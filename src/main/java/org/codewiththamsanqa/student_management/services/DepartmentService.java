package org.codewiththamsanqa.student_management.services;

import org.codewiththamsanqa.student_management.dto.DepartmentRequest;
import org.codewiththamsanqa.student_management.dto.DepartmentResponse;

import java.util.List;

public interface DepartmentService {

    DepartmentResponse create(DepartmentRequest request);

    List<DepartmentResponse> findAll();

    DepartmentResponse findById(Long id);
}
