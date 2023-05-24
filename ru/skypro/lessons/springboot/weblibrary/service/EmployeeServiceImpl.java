package ru.skypro.lessons.springboot.weblibrary.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.weblibrary.dto.EmployeeDTO;
import ru.skypro.lessons.springboot.weblibrary.dto.EmployeeFullInfo;
import ru.skypro.lessons.springboot.weblibrary.entity.Employee;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Math.min;
import static java.util.Objects.isNull;

@Data
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAllEmployees().stream()
                .map(EmployeeDTO::fromEmployee)
                .collect(Collectors.toList());
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);

    }
    @Override
    public EmployeeDTO getEmployeeById(int id) {
        return EmployeeDTO.fromEmployee(
                employeeRepository.findById(id)
                        .orElse(new Employee())
        );
    }
    @Override
    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }
    @Override
    public List<Employee> getEmployeesByName (String name) {
        return employeeRepository.getEmployeesByName(name);
    }

    @Override
    public List<EmployeeFullInfo> getAllInfo() {
        return employeeRepository.findAllEmployeeFullInfo();
    }


}