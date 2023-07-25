package ru.skypro.lessons.springboot.weblibrary.dto;

import lombok.*;
import lombok.experimental.Accessors;
import ru.skypro.lessons.springboot.weblibrary.entity.Employee;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors (chain = true)
public class EmployeeDTO {
    private Integer id;
    private String name;
    private Integer salary;

    public static EmployeeDTO fromEmployee(Employee employee) {
        return new EmployeeDTO()
                .setId(employee.getId())
                .setName(employee.getName())
                .setSalary(employee.getSalary());
    }

    public Employee toEmployee() {
        Employee employee = new Employee();
        employee.setId(this.getId());
        employee.setName(this.getName());
        employee.setSalary(this.getSalary());
        return employee;
    }

}
