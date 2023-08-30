package com.example.ems.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Data
@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private int age;
    private int salary;
    private String designation;
    private String address;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Project> projects;
    private String departmentId;
}
