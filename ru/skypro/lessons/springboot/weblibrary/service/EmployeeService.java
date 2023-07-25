package ru.skypro.lessons.springboot.weblibrary.service;

import ru.skypro.lessons.springboot.weblibrary.dto.EmployeeDTO;
import ru.skypro.lessons.springboot.weblibrary.dto.EmployeeFullInfo;
import ru.skypro.lessons.springboot.weblibrary.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<EmployeeDTO> getAllEmployees();
    List<EmployeeFullInfo> getAllInfo();
    EmployeeDTO addEmployee(Employee employee);
    EmployeeDTO getEmployeeById(int id);
    void deleteEmployeeById(int id);
    List<EmployeeDTO> getEmployeesByName(String name);
    EmployeeDTO employeeWithHighestSalary();
    List<EmployeeDTO> allEmployeesPosition();




}
