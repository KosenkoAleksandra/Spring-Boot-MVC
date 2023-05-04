package ru.skypro.lessons.springboot.weblibrary.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRepository;


import java.util.List;
@Data
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public int sumSalary() {
        int sum = 0;
        for (Employee employee : employeeRepository.getAllEmployees()) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public int getFirstNotNullSalaryIndex() {
        for (Employee employee : employeeRepository.getAllEmployees()) {
            if (employeeRepository.getAllEmployees() != null) {
                return employee.getSalary();
            }
        }
        throw new RuntimeException("Нет ни одного работника");
    }

    @Override
    public Employee getEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employeeRepository.getAllEmployees().get(getFirstNotNullSalaryIndex());
        for (int i = getFirstNotNullSalaryIndex() + 1; i < employeeRepository.getAllEmployees().size(); i++) {
            if (employeeRepository.getAllEmployees().get(i) != null &&
                    employeeRepository.getAllEmployees().get(i).getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employeeRepository.getAllEmployees().get(i);
            }
        }
        return employeeWithMinSalary;
    }

    @Override
    public Employee getEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employeeRepository.getAllEmployees().get(getFirstNotNullSalaryIndex());
        for (int i = getFirstNotNullSalaryIndex() + 1; i < employeeRepository.getAllEmployees().size(); i++) {
            if (employeeRepository.getAllEmployees().get(i) != null &&
                    employeeRepository.getAllEmployees().get(i).getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employeeRepository.getAllEmployees().get(i);
            }
        }
        return employeeWithMaxSalary;
    }


}