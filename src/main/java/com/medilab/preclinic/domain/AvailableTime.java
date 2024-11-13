package com.medilab.preclinic.domain;

import java.io.Serializable;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
/**
 * 
 * @author Rakesh Kumar Kuna
 *
 */
@Data
@Entity
@Table(name = "AvailableTime")
public class AvailableTime implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String startTime;
	private String endTime;
	@Column
	private String createdBy;
	@Column
	private Date createDate;
	@Column
	private String updatedBy;
	@Column
	private Date updatedDate;
}
