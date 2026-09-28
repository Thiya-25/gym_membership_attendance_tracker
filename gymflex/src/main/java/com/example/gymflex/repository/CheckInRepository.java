package com.example.gymflex.repository;

import com.example.gymflex.model.CheckIn;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CheckInRepository {

    private final List<CheckIn> checkIns = new ArrayList<>();

    private Long nextId = 1L;

    public List<CheckIn> findAll() {
        return checkIns;
    }

    public CheckIn save(CheckIn checkIn) {

        checkIn.setId(nextId++);

        checkIns.add(checkIn);

        return checkIn;
    }
}