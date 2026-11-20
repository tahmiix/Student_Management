package org.codewiththamsanqa.student_management.services;

import org.codewiththamsanqa.student_management.dto.DepartmentRequest;
import org.codewiththamsanqa.student_management.dto.DepartmentResponse;
import org.codewiththamsanqa.student_management.entity.Department;
import org.codewiththamsanqa.student_management.exceptions.ResourceNotFoundException;
import org.codewiththamsanqa.student_management.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl
        implements DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentServiceImpl(
            DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public DepartmentResponse create(
            DepartmentRequest request) {

        Department department = new Department(
                request.name(),
                request.description()
        );

        Department saved = repository.save(department);

        return mapToResponse(saved);
    }

    @Override
    public List<DepartmentResponse> findAll() {

        return repository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    @Override
    public DepartmentResponse findById(Long id) {

        Department department = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Department not found: " + id
                        ));

        return mapToResponse(department);
    }

    private DepartmentResponse mapToResponse(
            Department department) {

        return new DepartmentResponse(
                department.getId(),
                department.getName(),
                department.getDescription()
        );
    }
}