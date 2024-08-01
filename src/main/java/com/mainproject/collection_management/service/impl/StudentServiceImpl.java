package com.mainproject.collection_management.service.impl;

import com.mainproject.collection_management.model.Student;
import com.mainproject.collection_management.repository.StudentRepository;
import com.mainproject.collection_management.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
