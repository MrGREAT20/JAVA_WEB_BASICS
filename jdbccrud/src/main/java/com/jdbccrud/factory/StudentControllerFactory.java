package com.jdbccrud.factory;

import com.jdbccrud.controller.IStudentController;
import com.jdbccrud.controller.StudentControllerImpl;

public class StudentControllerFactory {

    private static IStudentController studentController = null;

    private StudentControllerFactory(){}

    public static IStudentController getStudentController(){
        if(studentController == null){
            studentController = new StudentControllerImpl();
        }
        return studentController;
    }

}

/**
 * The reason we return the implementation Class of the Interface in this Singleton Factory class is because if there are some other Student
 * implementation classes, and we want to return that, we can just change in getStudentController()
 * 
 * public static IStudentController getStudentController(){
        if(studentController == null){
            studentController = new AdvancedStudentControllerImpl();
        }
        return studentController;
    }
    
    Question : Why did we assigned variable "studentController" with "IStudentController" and NOT "StudentControllerImpl"

    ANS : We want loose coupling, if we had assigend studentController with StudentControllerImpl then we would we forced to use the 
    method implementations of "StudentControllerImpl", but lets say i want to use "AdvancedStudentControllerImpl" then how we could have done that?
    in that case, new variables should be generated with type "AdvancedStudentControllerImpl" with their own getAdvancedStudentController function. 
 * 
 */