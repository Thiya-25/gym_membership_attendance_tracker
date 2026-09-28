package com.example.gymflex.repository;

import com.example.gymflex.model.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberRepository {

    private final List<Member> members = new ArrayList<>();

    private Long nextId = 1L;

    public List<Member> findAll() {
        return members;
    }

    public Member findById(Long id) {
        for (Member member : members) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    public Member save(Member member) {
        member.setId(nextId++);
        members.add(member);
        return member;
    }

    public Member update(Long id, Member updatedMember) {

        Member existingMember = findById(id);

        if (existingMember != null) {
            existingMember.setName(updatedMember.getName());
            existingMember.setEmail(updatedMember.getEmail());
            existingMember.setPhone(updatedMember.getPhone());
        }

        return existingMember;
    }

    public boolean delete(Long id) {

        Member member = findById(id);

        if (member != null) {
            members.remove(member);
            return true;
        }

        return false;
    }
}