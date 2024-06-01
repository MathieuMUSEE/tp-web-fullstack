package com.example.tp_web_fullstack.controller;


import com.example.tp_web_fullstack.model.Employees;
import com.example.tp_web_fullstack.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping()
    public String getAllEmployees(Model model) {
        List<Employees> employees = employeesService.findAll();
        model.addAttribute("employees", employees);
        return "employees/index";
    }

    @GetMapping("/new")
    public String newEmployee(Model model) {
        model.addAttribute("employee", new Employees());
        return "employees/new";
    }

    @GetMapping("/{id}")
    public String showEmployee(Model model, Long id) {
        Employees employee = employeesService.findById(id);
        model.addAttribute("employee", employee);
        return "employees/show";
    }

    @GetMapping("/{id}/delete")
    public String deleteEmployee(Long id) {
        employeesService.deleteById(id);
        return "redirect:/employees";
    }

    @GetMapping("/{id}/edit")
    public String editEmployee(Model model, Long id) {
        Employees employee = employeesService.findById(id);
        model.addAttribute("employee", employee);
        return "employees/edit";
    }

    @PostMapping()
    public String createEmployee(Employees employee) {
        employeesService.save(employee);
        return "redirect:/employees";
    }

    @PostMapping("/{id}")
    public String updateEmployee(Employees employee) {
        employeesService.save(employee);
        return "redirect:/employees";
    }


}
