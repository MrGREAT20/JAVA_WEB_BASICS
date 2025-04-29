package com.jdbccrud.dao;

import com.jdbccrud.dto.Student;

public interface IStudentDao {

    String save(Student student);

    Student findById(Integer studentId);

    String updateById(Integer studentId);

    String deleteById(Integer studentId);

}