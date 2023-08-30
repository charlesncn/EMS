package com.example.ems.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "projects_table")
public class Project {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;
}
