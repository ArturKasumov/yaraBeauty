package com.yarabeauty.repo;

import com.yarabeauty.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment,Long> {
}
