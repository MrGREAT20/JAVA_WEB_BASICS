package com.jdbccrud.controller;

import com.jdbccrud.dto.Student;

public interface IStudentController {

    String save(Student student);

    Student findById(Integer studentId);

    String updateById(Integer studentId);

    String deleteById(Integer studentId);
}
