package com.example.gymflex.controller;

import com.example.gymflex.model.CheckIn;
import com.example.gymflex.service.CheckInService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checkins")
public class CheckInController {

    private final CheckInService checkInService;

    public CheckInController(CheckInService checkInService) {
        this.checkInService = checkInService;
    }

    @GetMapping
    public List<CheckIn> getAllCheckIns() {
        return checkInService.getAllCheckIns();
    }

    @PostMapping
    public CheckIn createCheckIn(@RequestParam Long memberId) {
        return checkInService.createCheckIn(memberId);
    }
}