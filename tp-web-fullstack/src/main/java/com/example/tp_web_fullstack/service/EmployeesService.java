package com.example.tp_web_fullstack.service;

import com.example.tp_web_fullstack.model.Employees;

import java.util.List;

public interface EmployeesService {

    List<Employees> findAll();

    Employees findById(Long id);

    Employees save(Employees employees);

    void deleteById(Long id);
}
