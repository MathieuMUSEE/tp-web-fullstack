package com.example.tp_web_fullstack.repository;

import com.example.tp_web_fullstack.model.Vacations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacationsRepository extends JpaRepository<Vacations, Long>{
}
