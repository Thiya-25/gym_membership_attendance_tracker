package com.example.gymflex.model;

import java.time.LocalDate;

public class Membership {

    private Long id;
    private Long memberId;
    private Long planId;
    private LocalDate startDate;
    private LocalDate expiryDate;

    public Membership() {
    }

    public Membership(Long id, Long memberId, Long planId,
                      LocalDate startDate, LocalDate expiryDate) {
        this.id = id;
        this.memberId = memberId;
        this.planId = planId;
        this.startDate = startDate;
        this.expiryDate = expiryDate;
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

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}