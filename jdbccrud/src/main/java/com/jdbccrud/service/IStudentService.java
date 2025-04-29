package com.jdbccrud.service;

import com.jdbccrud.dto.Student;

public interface IStudentService {

    String save(Student student);

    Student findById(Integer studentId);

    String updateById(Integer studentId);

    String deleteById(Integer studentId);
    
}
