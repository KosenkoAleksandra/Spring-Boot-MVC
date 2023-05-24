//package ru.skypro.lessons.springboot.weblibrary.repository;
//
//
//import org.springframework.stereotype.Repository;
//import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;
//import ru.skypro.lessons.springboot.weblibrary.service.EmployeeServiceImpl;
//
//import java.util.Collections;
//import java.util.List;
//
//@Repository
//public class EmployeeRepositoryImpl implements EmployeeRepository{

//    public final List<Employee> employeeList = List.of(
//            new Employee(1,"Svetlana", 60000),
//            new Employee(2, "Dmitry", 87000),
//            new Employee(3, "Ivan", 67000),
//            new Employee(4, "Oleg", 130000));
//
//    @Override
//    public List<Employee> getAllEmployees() {
//        return employeeList;
//    }
//
//    @Override
//    public int sumSalary() {
//        return sumSalary();
//    }
//
//    @Override
//    public Employee getEmployeeWithMinSalary() {
//        return getEmployeeWithMinSalary();
//    }
//
//    @Override
//    public Employee getEmployeeWithMaxSalary() {
//        return getEmployeeWithMaxSalary();
//    }
//    @Override
//    public List<Employee> getAllEmployeesWithAboveAverageSalary(){
//        return getAllEmployeesWithAboveAverageSalary();
//    }
//    @Override
//    public void addEmployee(Employee employee){
//        addEmployee(employee);
//    }
//    @Override
//    public void editEmployee(Employee employee) {
//        editEmployee(employee);
//    }
//    @Override
//    public Employee getEmployee(Integer id) {
//        return getEmployee(id);
//    }
//    @Override
//    public void deleteEmployee(Integer id) {
//        deleteEmployee(id);
//    }
//    @Override
//    public List<Employee> getEmployeesWithSalaryHigherThan(Integer salary) {
//        return getEmployeesWithSalaryHigherThan(salary);
//    }
//}
