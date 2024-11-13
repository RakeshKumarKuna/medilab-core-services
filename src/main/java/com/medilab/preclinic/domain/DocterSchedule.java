package com.medilab.preclinic.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	@OneToOne
	@JoinColumn(name = "docterId")
    private MedilabUser docter;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "docterShcedule")
    // @JoinColumn(name = "availableDays")
	private Set<DocterAvailability> docterAvailability;
	private String startTime;
	private String endTime;
	@Column
    private String messege;
	private String scheduledStatus;
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
