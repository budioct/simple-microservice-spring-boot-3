package budhioct.dev.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository repository;

    @Transactional
    public void saveSchool(SchoolEntity school) {
        repository.save(school);
    }


    @Transactional(readOnly = true)
    public List<SchoolEntity> findAllSchools() {
        return repository.findAll();
    }

}
