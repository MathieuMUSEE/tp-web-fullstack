package com.example.tp_web_fullstack.controller;


import com.example.tp_web_fullstack.model.Candidates;
import com.example.tp_web_fullstack.service.CandidatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/candidates")
public class CandidatesController {

    @Autowired
    private CandidatesService candidatesService;

    @GetMapping("/new")
    private String newCandidate(Model model) {
        model.addAttribute("candidate", new Candidates());
        return "candidates/new";
    }

    @GetMapping("/{id}")
    private String showCandidate(Model model, Long id) {
        Candidates candidate = candidatesService.findById(id);
        model.addAttribute("candidate", candidate);
        return "candidates/show";
    }

    @GetMapping("/{id}/delete")
    private String deleteCandidate(Long id) {
        candidatesService.deleteById(id);
        return "redirect:/candidates";
    }

    @PostMapping()
    private String createCandidate(@ModelAttribute Candidates candidate, BindingResult result, Model model ) {
        if (result.hasErrors()) {
            model.addAttribute("candidate", candidate);
            return "candidates/new";
        }
        candidatesService.save(candidate);
        return "redirect:/candidates";
    }

    @PostMapping("/{id}")
    private String updateCandidate(@ModelAttribute Candidates candidate, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("candidate", candidate);
            return "candidates/show";
        }
        candidatesService.save(candidate);
        return "redirect:/candidates";
    }
}
