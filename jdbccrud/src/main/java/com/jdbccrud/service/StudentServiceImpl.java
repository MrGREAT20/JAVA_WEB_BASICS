package com.jdbccrud.service;

import com.jdbccrud.dto.Student;

public class StudentServiceImpl implements IStudentService {

    @Override
    public String save(Student student) {
        // TODO Auto-generated method stub
        return "You got it from here";
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
