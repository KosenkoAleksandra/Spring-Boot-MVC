package ru.skypro.lessons.springboot.weblibrary.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRepository;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Math.min;

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

    @Override
    public Employee getEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employeeRepository.getAllEmployees().stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .get();
        return employeeWithMinSalary;
    }

    @Override
    public Employee getEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employeeRepository.getAllEmployees().stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .get();
        return employeeWithMaxSalary;
    }

    @Override
    public List<Employee> getAllEmployeesWithAboveAverageSalary() {
        List<Employee> allEmployeesWithAboveAverageSalary = new ArrayList<>();
        for (Employee employee : employeeRepository.getAllEmployees()) {
            if (employee != null && employee.getSalary() > getAverage()) {
                allEmployeesWithAboveAverageSalary.add(employee);
            }
        }
        return allEmployeesWithAboveAverageSalary;
    }

    public int getAverage() {
        int averageSalary = sumSalary()/employeeRepository.getAllEmployees().size();
        return averageSalary;
    }
    @Override
    public void addEmployee(Employee employee) {
        Employee newEmployee = new Employee(employee.getId(), employee.getName(), employee.getSalary());
        for (Employee empl : employeeRepository.getAllEmployees()) {
            if (empl != null && empl == employee) {
                newEmployee = empl;
                }
            }
    }
    @Override
    public void editEmployee(Employee employee) {
    }
    @Override
    public Employee getEmployee(Integer id) {
        for (Employee employee : employeeRepository.getAllEmployees()) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return employeeRepository.getEmployee(id);
    }
    @Override
    public void deleteEmployee(Integer id) {
        for (Employee employee : employeeRepository.getAllEmployees()) {
            if (employee != null && id.equals(employee.getId())) {
                employee = null;
                return;
            }
        }
    }
    @Override
    public List<Employee> getEmployeesWithSalaryHigherThan(Integer salary) {
        List<Employee> allEmployeesWithSalaryHigherThan = new ArrayList<>();
        for (Employee employee : employeeRepository.getAllEmployees()) {
            if (employee != null && employee.getSalary() > salary) {
                allEmployeesWithSalaryHigherThan.add(employee);
            }
        }
        return allEmployeesWithSalaryHigherThan;
    }

}