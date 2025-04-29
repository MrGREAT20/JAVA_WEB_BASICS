package com.jdbccrud.factory;

import com.jdbccrud.service.IStudentService;
import com.jdbccrud.service.StudentServiceImpl;

public class StudentServiceFactory {

    private static IStudentService studentService = null;

    private StudentServiceFactory(){}
    
    public static IStudentService getStudentService(){
        if(studentService == null){
            studentService = new StudentServiceImpl();
        }
        return studentService;
    }
}

/**
 *  The reason we have Factory Singleton Classes for Services , Controllers is because we dont want 
 *  unnecessary object creations for handling the data, we can use the same controller and service.
 */
