package com.example.tp_web_fullstack.service;


import com.example.tp_web_fullstack.model.Candidates;

import java.util.List;

public interface CandidatesService {

    List<Candidates> findAll();

    Candidates findById(Long id);

    Candidates save(Candidates candidate);

    void deleteById(Long id);
}
