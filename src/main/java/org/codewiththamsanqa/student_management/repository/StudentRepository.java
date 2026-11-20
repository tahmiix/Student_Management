package org.codewiththamsanqa.student_management.repository;

import org.codewiththamsanqa.student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository
        extends JpaRepository<Student, Long> {

    List<Student> findByDepartmentId(Long departmentId);
}