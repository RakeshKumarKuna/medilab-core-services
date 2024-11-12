package com.medilab.preclinic.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
/**
 * 
 * @author Rakesh Kumar Kuna
 *
 */
@Entity
@Table(name ="DocterSchedule" )
@Data
public class DocterSchedule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int docterscheduleId;
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
