package com.EMS.controller;

import com.EMS.entity.Employee;
import com.EMS.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService service;

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody @Valid Employee e) {
        Employee saved = service.addEmployee(e);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAll() {
        List<Employee> employees = service.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Long id) {
        Employee employee = service.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody @Valid Employee e) {
        Employee updated = service.updateEmployee(id, e);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.deleteEmployee(id);
        return ResponseEntity.ok("Employee deleted successfully");
    }
}
