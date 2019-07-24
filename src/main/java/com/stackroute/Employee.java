package com.stackroute;

public class Employee {
    //declare variables for employee name , department and salary
    private String name;
    private String dept;
    //write setters and getter methods for the variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;
    //Empty constructor
    public Employee()
    {

    }
    //parameterized constructor with declared variables
    public Employee(String name,String dept,int salary)
    {
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }

}
