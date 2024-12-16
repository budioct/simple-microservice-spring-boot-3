package budhioct.dev.school;

import budhioct.dev.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository repository;
    private final StudentClient client;

    @Transactional
    public void saveSchool(SchoolEntity school) {
        repository.save(school);
    }


    @Transactional(readOnly = true)
    public List<SchoolEntity> findAllSchools() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public SchoolDTO.SchoolResponse findSchoolsWithStudents(long schoolId) {
        List<SchoolDTO.Student> students = client.findAllStudentsBySchool(schoolId); // find all the students from the student micro-service
        SchoolEntity school = repository.findById(schoolId)
                .orElse(
                        SchoolEntity.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );
        return SchoolDTO.SchoolResponse
                .builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }

}
