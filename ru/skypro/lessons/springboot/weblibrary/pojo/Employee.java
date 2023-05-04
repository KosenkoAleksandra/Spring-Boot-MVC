package ru.skypro.lessons.springboot.weblibrary.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter

public class Employee {
    private String name;
    private int salary;

    public Employee(int salary, String name) {
        this.name = name;
        this.salary = salary;
    }
}
