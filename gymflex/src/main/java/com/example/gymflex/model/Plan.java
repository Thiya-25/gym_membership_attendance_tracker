package com.example.gymflex.model;

import java.math.BigDecimal;

public class Plan {

    private Long id;
    private String name;
    private Integer durationMonths;
    private BigDecimal price;
    private Boolean active;

    public Plan() {
    }

    public Plan(Long id, String name, Integer durationMonths,
                BigDecimal price, Boolean active) {
        this.id = id;
        this.name = name;
        this.durationMonths = durationMonths;
        this.price = price;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(Integer durationMonths) {
        this.durationMonths = durationMonths;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}