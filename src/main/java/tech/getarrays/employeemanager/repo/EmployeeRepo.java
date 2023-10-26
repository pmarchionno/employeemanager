package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteById(Long id);

    Optional<Employee> findEmployeeById(Long id);
    Optional<Employee> findById(Long id);
}
