package com.exercise_1;

public class Employee {
    private int id;
    private String name;
    private String mailid;
    private int  salary;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getMailid() {
        return mailid;
    }

    public Employee setMailid(String mailid) {
        this.mailid = mailid;
        return this;
    }

    public int getSalary() {
        return salary;
    }

    public Employee setSalary(int salary) {
        this.salary = salary;
        return this;
    }
}
