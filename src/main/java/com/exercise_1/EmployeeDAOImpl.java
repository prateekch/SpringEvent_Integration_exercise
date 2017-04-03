package com.exercise_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

public class EmployeeDAOImpl implements EmployeeDAO {

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;
    // private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public void save(Employee employee) {
        addEmployeer(employee.getId(),employee.getName(), employee.getMailid(),employee.getSalary());
        System.out.println(employee);

    }

    private void addEmployeer(int id,String name,String mailid,int  salary) {

        jdbcTemplate.update("INSERT INTO Employee(id,name,mailid,salary) Values (?,?,?,?)",
                new Object[]{id,name,mailid, salary});

    }
}
