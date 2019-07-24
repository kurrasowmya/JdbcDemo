package com.stackroute;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
    //create object for jdbctemplate
    private JdbcTemplate jdbcTemplate;
    //set the value for jdbc template
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    //method to save employee details
    public int saveEmployee(Employee e){
        String query="insert into employee values( '"+e.getName()+"','"+e.getDept()+"','"+e.getSalary()+"')";
        return jdbcTemplate.update(query);
    }
    //method to update employee details
    public int updateEmployee(Employee e){
        String query="update employee set name='"+e.getName()+"',salary='"+e.getDept()+"' where salary='"+e.getSalary()+"' ";
        return jdbcTemplate.update(query);
    }
    //method to delete employee details
    public int deleteEmployee(Employee e){
        String query="delete from employee where salary='"+e.getSalary()+"' ";
        return jdbcTemplate.update(query);
    }
}
