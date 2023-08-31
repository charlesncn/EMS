package com.example.ems.repository;

import com.example.ems.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends ReactiveCrudRepository<ProjectEntity, Integer> {
}
