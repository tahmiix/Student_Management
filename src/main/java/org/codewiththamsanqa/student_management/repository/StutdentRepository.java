package org.codewiththamsanqa.student_management.repository;

import org.codewiththamsanqa.student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StutdentRepository extends JpaRepository<Student, Long> {

}
