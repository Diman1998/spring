package com.dima.spring.mvc_hibernate_aop.dao;

import com.dima.spring.mvc_hibernate_aop.entity.Employee;
import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();
    void saveOrUpdateEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}
