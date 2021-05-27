package com.yarabeauty.controller;

import com.yarabeauty.domain.Appointment;
import com.yarabeauty.repo.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private AppointmentRepo appointmentRepo;

    @GetMapping
    private String main() {
        return "index";
    }

    @PostMapping("/makeappointment")
    private String add(@RequestParam String name, @RequestParam String phone, @RequestParam String comment) {
        Appointment appointment = new Appointment(name, phone, comment);
        appointmentRepo.save(appointment);
        return "redirect:/";
    }

    @GetMapping("/makeappointment")
    private String makeappointment() {
        return "popup";
    }
}
