package com.medilab.preclinic.domain;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
/**
 * 
 * @author Rakesh Kumar Kuna
 *
 */
@Entity
@Table(name ="Appointment" )
@Data
public class Appointment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int AppointmentId;
    @OneToOne
    @JoinColumn(name = "patient")
    private MedilabUser patient;
    @OneToOne
    @JoinColumn(name = "department")
    private Department department;
    @OneToOne
    @JoinColumn(name = "docter")
    private MedilabUser docter;
    
    private String date;
    private String time;
    private String messege;
    private String status;

	
	
	}
