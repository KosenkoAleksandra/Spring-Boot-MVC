package ru.skypro.lessons.springboot.weblibrary.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;
import ru.skypro.lessons.springboot.weblibrary.service.EmployeeService;

import java.util.List;

@Data
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;


    @GetMapping
    public List<Employee> showCounter() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/salary/sum")
    public int sumSalary(){
        return employeeService.sumSalary();
    }
    @GetMapping("/salary/min")
    public Employee getEmployeeWithMinSalary() {
       return employeeService.getEmployeeWithMinSalary();
    }
    @GetMapping("/salary/max")
    public Employee getEmployeeWithMaxSalary() {
        return employeeService.getEmployeeWithMaxSalary();
    }





}
