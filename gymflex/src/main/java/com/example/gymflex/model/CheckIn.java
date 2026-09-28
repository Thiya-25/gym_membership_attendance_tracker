package com.example.gymflex.model;

import java.time.LocalDateTime;

public class CheckIn {

    private Long id;
    private Long memberId;
    private LocalDateTime checkInTime;

    public CheckIn() {
    }

    public CheckIn(Long id, Long memberId, LocalDateTime checkInTime) {
        this.id = id;
        this.memberId = memberId;
        this.checkInTime = checkInTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalDateTime checkInTime) {
        this.checkInTime = checkInTime;
    }
}