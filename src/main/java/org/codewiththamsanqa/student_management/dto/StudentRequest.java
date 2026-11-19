package org.codewiththamsanqa.student_management.dto;

public record StudentRequest(
        String firstName,
        String lastName,
        String email,
        Long departmentId
) {}