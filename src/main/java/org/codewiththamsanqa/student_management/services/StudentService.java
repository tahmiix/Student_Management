package org.codewiththamsanqa.student_management.services;

import org.codewiththamsanqa.student_management.dto.StudentRequest;
import org.codewiththamsanqa.student_management.dto.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse create(StudentRequest request);

    List<StudentResponse> findAll();

    StudentResponse findById(Long id);

    List<StudentResponse> findByDepartment(Long departmentId);
}