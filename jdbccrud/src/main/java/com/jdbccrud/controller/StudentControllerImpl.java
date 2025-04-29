package com.jdbccrud.controller;

import com.jdbccrud.dto.Student;
import com.jdbccrud.factory.StudentServiceFactory;
import com.jdbccrud.service.IStudentService;

public class StudentControllerImpl implements IStudentController{

    IStudentService studentService = StudentServiceFactory.getStudentService();

    @Override
    public String save(Student student) {
        // TODO Auto-generated method stub
        return studentService.save(student);
    }

    @Override
    public Student findById(Integer studentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public String updateById(Integer studentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateById'");
    }

    @Override
    public String deleteById(Integer studentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}
