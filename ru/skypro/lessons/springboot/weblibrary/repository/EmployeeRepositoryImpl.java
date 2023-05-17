package ru.skypro.lessons.springboot.weblibrary.repository;


import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;
import ru.skypro.lessons.springboot.weblibrary.service.EmployeeServiceImpl;

import java.util.Collections;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
    public final List<Employee> employeeList = List.of(
            new Employee("Svetlana", 60000),
            new Employee("Dmitry", 87000),
            new Employee("Ivan", 67000),
            new Employee("Oleg", 130000));

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public int sumSalary() {
        return sumSalary();
    }

    @Override
    public Employee getEmployeeWithMinSalary() {
        return getEmployeeWithMinSalary();
    }

    @Override
    public Employee getEmployeeWithMaxSalary() {
        return getEmployeeWithMaxSalary();
    }
    @Override
    public List<Employee> getAllEmployeesWithAboveAverageSalary(){
        return getAllEmployeesWithAboveAverageSalary();
    }
}
