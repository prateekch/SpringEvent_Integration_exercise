package com.exercise_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.setId(2);
        employee.setName("Prateek");
        employee.setMailid("prateek@tothenew.com");
        employee.setSalary(5090);

        if(employee.getSalary()>3000){

            ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");

            EmployeeEvent employeeEvent=new EmployeeEvent(employee);

            EmployeeDAO employeeDAO= (EmployeeDAO) context.getBean("employeeDao");
            employeeDAO.save(employee);

            EmployeePublisher publisher=context.getBean(EmployeePublisher.class);
            publisher.publish(employeeEvent);

        }
    }
}
