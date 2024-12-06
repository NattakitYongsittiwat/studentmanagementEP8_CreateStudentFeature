package com.nattakit.studentmanagement.service;

import com.nattakit.studentmanagement.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
}
