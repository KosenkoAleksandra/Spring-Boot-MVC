package ru.skypro.lessons.springboot.weblibrary.service;

import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

@Service
public class CounterServiceImpl implements CounterService{
    private int counter;

    public String showCounter(){
        return "Количество запросов " + ++counter;
    }

}
