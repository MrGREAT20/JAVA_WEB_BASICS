package com.jdbccrud.dto;

// DTO object is the one which talks with frontend and is the form in which Data Object is moved through different Layers in Java application
public class Student {

    private String name;
    private String address;

    static {
        System.out.println("Student.class is loading...");
    }
    /**
     * STATIC : 
     * This block runs once when the class is first loaded into memory by the JVM.
     * Useful for debugging class loading behavior.
     */


    // Constructor
    public Student(){
        System.out.println("Student Object created...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address + "]";
    }

    
}
