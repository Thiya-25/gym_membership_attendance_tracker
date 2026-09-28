package com.example.gymflex.service;

import com.example.gymflex.model.CheckIn;
import com.example.gymflex.repository.CheckInRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CheckInService {

    private final CheckInRepository checkInRepository;

    public CheckInService(CheckInRepository checkInRepository) {
        this.checkInRepository = checkInRepository;
    }

    public List<CheckIn> getAllCheckIns() {
        return checkInRepository.findAll();
    }

    public CheckIn createCheckIn(Long memberId) {

        CheckIn checkIn = new CheckIn();

        checkIn.setMemberId(memberId);
        checkIn.setCheckInTime(LocalDateTime.now());

        return checkInRepository.save(checkIn);
    }
}