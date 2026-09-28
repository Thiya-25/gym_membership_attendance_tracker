package com.example.gymflex.repository;

import com.example.gymflex.model.Membership;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MembershipRepository {

    private final List<Membership> memberships = new ArrayList<>();

    private Long nextId = 1L;

    public List<Membership> findAll() {
        return memberships;
    }

    public Membership findById(Long id) {

        for (Membership membership : memberships) {

            if (membership.getId().equals(id)) {
                return membership;
            }
        }

        return null;
    }

    public Membership save(Membership membership) {

        membership.setId(nextId++);

        memberships.add(membership);

        return membership;
    }
}