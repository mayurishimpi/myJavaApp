package com.hw3.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Plan {
    @Id
    private double id;
    private String title;
    private Float budget;

    public Plan() {}

    public Plan(double id, String title, Float budget) {
        this.id = id;
        this.title = title;
        this.budget = budget;
    }

    // Getters and setters
    public double getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Float getBudget() { return budget; }
    public void setBudget(Float budget) { this.budget = budget; }
}
