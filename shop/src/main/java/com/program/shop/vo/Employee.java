package com.program.shop.vo;

import lombok.Data;

@Data
public class Employee {
    private String id;
    private String name;
    private int salary;
    private String sex;

    public Employee(String id, String name, int salary, String sex) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.sex = sex;
    }
}
