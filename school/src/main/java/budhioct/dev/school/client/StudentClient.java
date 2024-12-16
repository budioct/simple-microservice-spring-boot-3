package budhioct.dev.school.client;

import budhioct.dev.school.SchoolDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service",url = "${application.config.students-url}")
public interface StudentClient {

    @GetMapping(
            path = "/school/{school-id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    List<SchoolDTO.Student> findAllStudentsBySchool(@PathVariable("school-id") long schoolId);

}