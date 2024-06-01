package com.example.tp_web_fullstack.repository;

import com.example.tp_web_fullstack.model.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatesRepository extends JpaRepository<Candidates, Long> {
}
