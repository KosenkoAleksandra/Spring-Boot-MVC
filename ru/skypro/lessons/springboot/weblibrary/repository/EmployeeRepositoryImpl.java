package ru.skypro.lessons.springboot.weblibrary.repository;


import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.Collections;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
    public final List<Employee> employeeList = List.of(
            new Employee(60000, "Svetlana"),
            new Employee(87000, "Dmitry"),
            new Employee(67000, "Ivan"),
            new Employee(150000, "Oleg"));

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public int sumSalary() {
        return 0;
    }

    @Override
    public Employee getEmployeeWithMinSalary() {
        return null;
    }

    @Override
    public Employee getEmployeeWithMaxSalary() {
        return null;
    }
}
