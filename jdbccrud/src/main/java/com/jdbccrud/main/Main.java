package com.jdbccrud.main;

import com.jdbccrud.controller.IStudentController;
import com.jdbccrud.factory.StudentControllerFactory;

public class Main {
    public static void main(String[] args) {
        IStudentController studentController = StudentControllerFactory.getStudentController();
        System.out.println("Factory Implementation ===> : " + studentController.save(null));
    }
}   