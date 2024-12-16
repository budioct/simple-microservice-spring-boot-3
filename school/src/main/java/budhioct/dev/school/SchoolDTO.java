package budhioct.dev.school;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class SchoolDTO {

    @Getter
    @Setter
    @Builder
    public static class SchoolResponse {
        private String name;
        private String email;
        List<Student> students;
    }

    @Getter
    @Setter
    @Builder
    public static class Student {
        private String firstName;
        private String lastName;
        private String email;
    }

}
