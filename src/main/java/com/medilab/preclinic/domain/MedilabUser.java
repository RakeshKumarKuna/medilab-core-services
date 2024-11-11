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
@Table(name = "MedilabUser")
@Data
public class MedilabUser extends AuditInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String userId;
	@Column
	private String email;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dob;
	@Column
	private String gender;
	@Column
	private String shortBio;
	@Column
	private boolean status;
	@OneToOne
	private UserRole userRole;
	@OneToOne
	private Address postalAddress;
	@OneToOne
	private UserType userType;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Document> document;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Notification> notification;
}
