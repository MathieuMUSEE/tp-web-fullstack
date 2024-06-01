package com.example.tp_web_fullstack.repository;

import com.example.tp_web_fullstack.model.MissingDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissingDaysRepository extends JpaRepository<MissingDays, Long> {
}
