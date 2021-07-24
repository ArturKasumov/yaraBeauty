package com.yarabeauty.controller;

import com.yarabeauty.domain.Appointment;
import com.yarabeauty.repo.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private AppointmentRepo appointmentRepo;

    @GetMapping("/appointments")
    public String appointments(Model model) {
        List<Appointment> appointmentList = appointmentRepo.findAll();
        model.addAttribute("appointments", appointmentList);
        return "appointments";
    }

}
