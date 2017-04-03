package com.exercise_1;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeListener implements ApplicationListener<EmployeeEvent> {
    public void onApplicationEvent(EmployeeEvent event) {
        if (event.getSource() instanceof Employee) {


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Employee employee = (Employee) event.getSource();
            System.out.println(employee.getName());
        }
    }
}
