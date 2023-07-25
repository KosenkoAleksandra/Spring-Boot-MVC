package ru.skypro.lessons.springboot.weblibrary.service;

import ru.skypro.lessons.springboot.weblibrary.dto.EmployeeDTO;
import ru.skypro.lessons.springboot.weblibrary.dto.EmployeeFullInfo;
import ru.skypro.lessons.springboot.weblibrary.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<EmployeeDTO> getAllEmployees();
    List<EmployeeFullInfo> getAllInfo();
    void addEmployee(Employee employee);
    EmployeeDTO getEmployeeById(int id);
    void deleteEmployeeById(int id);
    List<Employee> getEmployeesByName(String name);




}
