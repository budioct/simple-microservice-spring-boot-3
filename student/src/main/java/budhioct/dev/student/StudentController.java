package budhioct.dev.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody StudentEntity student) {
        service.saveStudent(student);
    }

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<StudentEntity>> findAllStudents() {
        return ResponseEntity.ok(service.findAllStudents());
    }

    @GetMapping(
            path = "/school/{school-id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<StudentEntity>> findAllStudents(@PathVariable(name = "school-id") long schoolId) {
        return ResponseEntity.ok(service.findAllStudentsBySchool(schoolId));
    }

}
