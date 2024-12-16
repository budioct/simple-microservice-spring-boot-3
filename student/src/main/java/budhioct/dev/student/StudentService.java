package budhioct.dev.student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentEntity student);
    List<StudentEntity> findAllStudents();
}
