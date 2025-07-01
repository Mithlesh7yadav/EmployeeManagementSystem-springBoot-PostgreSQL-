package com.EMS.controller;

import com.EMS.entity.Manager;
import com.EMS.repository.ManagerRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/managers")
public class ManagerController {
    private final ManagerRepository managerRepository;

    @PostMapping
    public ResponseEntity<Manager> createManager(@RequestBody @Valid Manager manager) {
        Manager saved = managerRepository.save(manager);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{id}/team")
    public ResponseEntity<Manager> getManagerTeam(@PathVariable Long id) {
        Manager manager = managerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Manager not found"));
        return ResponseEntity.ok(manager);
    }
}
