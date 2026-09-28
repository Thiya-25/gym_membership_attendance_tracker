package com.example.gymflex.service;

import com.example.gymflex.model.Membership;
import com.example.gymflex.repository.MembershipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipService {

    private final MembershipRepository membershipRepository;

    public MembershipService(MembershipRepository membershipRepository) {
        this.membershipRepository = membershipRepository;
    }

    public List<Membership> getAllMemberships() {
        return membershipRepository.findAll();
    }

    public Membership getMembershipById(Long id) {
        return membershipRepository.findById(id);
    }

    public Membership createMembership(Membership membership) {
        return membershipRepository.save(membership);
    }
}