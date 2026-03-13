package com.arcana.AppointmentServiceCaseStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arcana.AppointmentServiceCaseStudy.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

}
