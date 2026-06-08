package loggit.com.exam.service.implement;

import loggit.com.exam.entity.Department;
import loggit.com.exam.repository.DepartmentRepository;
import loggit.com.exam.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
