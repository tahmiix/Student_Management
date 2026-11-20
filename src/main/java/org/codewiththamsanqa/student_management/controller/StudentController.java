package org.codewiththamsanqa.student_management.controller;

import org.codewiththamsanqa.student_management.dto.StudentRequest;
import org.codewiththamsanqa.student_management.dto.StudentResponse;
import org.codewiththamsanqa.student_management.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<StudentResponse> create(
            @RequestBody StudentRequest request) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.create(request));
    }

    @GetMapping
    public ResponseEntity<List<StudentResponse>> findAll() {

        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> findById(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/department/{departmentId}")
    public ResponseEntity<List<StudentResponse>>
    findByDepartment(@PathVariable Long departmentId) {

        return ResponseEntity.ok(
                service.findByDepartment(departmentId)
        );
    }
}