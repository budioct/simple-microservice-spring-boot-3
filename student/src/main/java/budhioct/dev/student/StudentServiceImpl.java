package budhioct.dev.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Transactional
    public void saveStudent(StudentEntity student) {
        repository.save(student);
    }

    @Transactional(readOnly = true)
    public List<StudentEntity> findAllStudents() {
        return repository.findAll();
    }

}
