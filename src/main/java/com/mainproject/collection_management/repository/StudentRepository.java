package com.mainproject.collection_management.repository;

import com.mainproject.collection_management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
