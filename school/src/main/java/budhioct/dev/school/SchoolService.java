package budhioct.dev.school;

import java.util.List;

public interface SchoolService {
    void saveSchool(SchoolEntity school);
    List<SchoolEntity> findAllSchools();
    SchoolDTO.SchoolResponse findSchoolsWithStudents(long schoolId);
}
