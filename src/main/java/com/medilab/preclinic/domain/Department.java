package com.medilab.preclinic.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.Data;
/**
 * 
 * @author Rakesh Kumar Kuna
 *
 */
@Entity
@Table(name ="Department" )
@Data
public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentId;
	@Column
    private String name;
	@Column
    private String discription;
	private String status;
	@Column
	private String createdBy;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	@Column
	private String updatedBy;
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date updatedDate;
	}
