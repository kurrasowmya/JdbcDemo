package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");

        EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");

        //decalre variable to get the status of update
        int status1=dao.updateEmployee(new Employee("asha","sales",15000));
        System.out.println(status1);


        Employee e=new Employee();
        e.setSalary(50000);
        //declare variable to get the status of deletion
        int status2=dao.deleteEmployee(e);
        System.out.println(status2);

    }
}
