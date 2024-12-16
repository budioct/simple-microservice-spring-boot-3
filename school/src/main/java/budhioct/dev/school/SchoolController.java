package budhioct.dev.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody SchoolEntity school) {
        service.saveSchool(school);
    }

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<SchoolEntity>> findAllStudents() {
        return ResponseEntity.ok(service.findAllSchools());
    }

    @GetMapping(
            path = "/with-students/{school-id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<SchoolDTO.SchoolResponse> findAllSchools(@PathVariable(name = "school-id") long schoolId){
        return ResponseEntity.ok(service.findSchoolsWithStudents(schoolId));
    }


}
