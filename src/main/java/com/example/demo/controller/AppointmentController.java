package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AppointmentDAO;
import com.example.demo.model.Appointment;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class AppointmentController {
	
	@Autowired
	private AppointmentDAO appointmentDAO;
	
	@GetMapping("/app")
	public List<Appointment> getAppointments(){
		return appointmentDAO.findAll();
	}
	
	@PostMapping("/app")
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointmentDAO.save(appointment);
	}
	
	@DeleteMapping("/app/{id}")
	public boolean deleteAppointment(@PathVariable Long id) {
		appointmentDAO.delete(id);
		return true;
	}
	
	@PutMapping("/app")
	public Appointment updateAppointmet(@RequestBody Appointment appointment) {
		return appointmentDAO.save(appointment);
	}
}

