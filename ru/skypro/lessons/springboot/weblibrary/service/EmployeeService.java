package ru.skypro.lessons.springboot.weblibrary.service;

import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    int sumSalary();
    Employee getEmployeeWithMinSalary();
    Employee getEmployeeWithMaxSalary();
    List<Employee> getAllEmployeesWithAboveAverageSalary();
    void addEmployee(Employee employee);
    void editEmployee(Employee employee);
    Employee getEmployee(Integer id);
    void deleteEmployee(Integer id);
    List<Employee> getEmployeesWithSalaryHigherThan(Integer salary);



}
