package com.nattakit.studentmanagement.service.impl;

import com.nattakit.studentmanagement.dto.StudentDto;
import com.nattakit.studentmanagement.entity.Student;
import com.nattakit.studentmanagement.mapper.StudentMapper;
import com.nattakit.studentmanagement.repository.StudentsRepository;
import com.nattakit.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class StudentServiceImpl implements StudentService {

    private StudentsRepository studentsRepository;

    @Autowired
    public StudentServiceImpl(StudentsRepository studentsRepository){
        this.studentsRepository = studentsRepository;
    }

    @Override
    public List<StudentDto> getAllStudents(){
        List<Student> students = studentsRepository.findAll();
        List<StudentDto> studentDtos = students.stream().map((student)-> StudentMapper.mapToStudentDto(student)).collect(Collectors.toList());
        return studentDtos;
    }
}
