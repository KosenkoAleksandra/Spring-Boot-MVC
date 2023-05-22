package ru.skypro.lessons.springboot.weblibrary.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter

public class Employee {
    private Integer id;
    private String name;
    private int salary;

    public Employee(Integer id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
