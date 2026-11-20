package org.codewiththamsanqa.student_management.repository;

import org.codewiththamsanqa.student_management.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
