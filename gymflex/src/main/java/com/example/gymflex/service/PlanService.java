package com.example.gymflex.service;

import com.example.gymflex.model.Plan;
import com.example.gymflex.repository.PlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {

    private final PlanRepository planRepository;

    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    public List<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    public Plan getPlanById(Long id) {
        return planRepository.findById(id);
    }

    public Plan createPlan(Plan plan) {
        return planRepository.save(plan);
    }

    public Plan updatePlan(Long id, Plan plan) {
        return planRepository.update(id, plan);
    }

    public boolean deletePlan(Long id) {
        return planRepository.delete(id);
    }
}