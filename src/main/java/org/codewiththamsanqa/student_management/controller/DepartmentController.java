package org.codewiththamsanqa.student_management.controller;

import org.codewiththamsanqa.student_management.dto.DepartmentRequest;
import org.codewiththamsanqa.student_management.dto.DepartmentResponse;
import org.codewiththamsanqa.student_management.services.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<DepartmentResponse> create(
            @RequestBody DepartmentRequest request) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.create(request));
    }

    @GetMapping
    public ResponseEntity<List<DepartmentResponse>> findAll() {

        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DepartmentResponse> findById(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.findById(id));
    }
}