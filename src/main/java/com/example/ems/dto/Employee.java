package com.example.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String name;
    private String email;
    private int age;
    private int salary;
    private String designation;
    private String address;
    private List<Project> projects;
    private String departmentId;
}
