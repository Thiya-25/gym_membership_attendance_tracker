package com.example.gymflex.controller;

import com.example.gymflex.model.Plan;
import com.example.gymflex.service.PlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plans")
public class PlanController {

    private final PlanService planService;

    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping
    public List<Plan> getAllPlans() {
        return planService.getAllPlans();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plan> getPlanById(@PathVariable Long id) {

        Plan plan = planService.getPlanById(id);

        if (plan == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(plan);
    }

    @PostMapping
    public Plan createPlan(@RequestBody Plan plan) {
        return planService.createPlan(plan);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plan> updatePlan(
            @PathVariable Long id,
            @RequestBody Plan plan) {

        Plan updatedPlan = planService.updatePlan(id, plan);

        if (updatedPlan == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updatedPlan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePlan(@PathVariable Long id) {

        boolean deleted = planService.deletePlan(id);

        if (!deleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Plan deleted successfully");
    }
}