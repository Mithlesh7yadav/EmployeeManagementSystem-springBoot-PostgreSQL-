package com.EMS.service;

import com.EMS.entity.Employee;
import com.EMS.exception.ResourceNotFoundException;
import com.EMS.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository repo;

    public Employee addEmployee(Employee e) {
        return repo.save(e);
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found"));
    }

    public Employee updateEmployee(Long id, Employee updated) {
        Employee emp = getEmployeeById(id);
        emp.setName(updated.getName());
        emp.setAge(updated.getAge());
        emp.setDepartment(updated.getDepartment());
        emp.setSalary(updated.getSalary());
        return repo.save(emp);
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
