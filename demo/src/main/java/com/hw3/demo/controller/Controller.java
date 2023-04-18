package com.hw3.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hw3.demo.entity.Plan;
import com.hw3.demo.repository.PlanRepository;

@RestController
@RequestMapping("/api/v1.0")
public class Controller {
    @Autowired
    private PlanRepository planRepository;

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    // @GetMapping("/{id}")
    // public Plan getPlan(@PathVariable Double id) {
    //     return planRepository.findById(id).orElse(null);
    // }

    // @PostMapping("/")
    // public Plan createPlan(@RequestBody PlanRequest planRequest) {
    //     Plan plan = new Plan(planRequest.getId(), planRequest.getTitle(), planRequest.getBudget());
    //     return planRepository.save(plan);
    // }

    public static class PlanRequest {
        private int id;
        private String title;
        private Float budget;

        public PlanRequest() {}

        public PlanRequest(int id, String title, Float budget) {
            this.id = id;
            this.title = title;
            this.budget = budget;
        }

        // Getters and setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public Float getBudget() { return budget; }
        public void setBudget(Float budget) { this.budget = budget; }
    }
}


