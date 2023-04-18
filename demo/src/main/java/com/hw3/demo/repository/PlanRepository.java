package com.hw3.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hw3.demo.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Double>{
    
}
