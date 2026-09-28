package com.example.gymflex.repository;

import com.example.gymflex.model.Plan;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlanRepository {

    private final List<Plan> plans = new ArrayList<>();

    private Long nextId = 1L;

    public List<Plan> findAll() {
        return plans;
    }

    public Plan findById(Long id) {
        for (Plan plan : plans) {
            if (plan.getId().equals(id)) {
                return plan;
            }
        }
        return null;
    }

    public Plan save(Plan plan) {
        plan.setId(nextId++);
        plans.add(plan);
        return plan;
    }

    public Plan update(Long id, Plan updatedPlan) {

        Plan existingPlan = findById(id);

        if (existingPlan != null) {
            existingPlan.setName(updatedPlan.getName());
            existingPlan.setDurationMonths(updatedPlan.getDurationMonths());
            existingPlan.setPrice(updatedPlan.getPrice());
            existingPlan.setActive(updatedPlan.getActive());
        }

        return existingPlan;
    }

    public boolean delete(Long id) {

        Plan plan = findById(id);

        if (plan != null) {
            plans.remove(plan);
            return true;
        }

        return false;
    }
}