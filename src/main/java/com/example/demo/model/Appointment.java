package com.example.demo.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	private String time;
	
	private String description;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		
	public Appointment(Date date, String time, String description) {
		super();
		this.date = date;
		this.time = time;
		this.description = description;
	}
	
	public Appointment() {
		
	}
	
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", date=" + date + ", time=" + time + ", description=" + description + "]";
	}
	
	
}
