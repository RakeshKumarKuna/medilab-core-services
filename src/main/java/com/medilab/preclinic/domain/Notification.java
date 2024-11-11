package com.medilab.preclinic.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.CascadeType;
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
import lombok.Data;

/**
 * 
 * @author Rakesh Kumar Kuna
 *
 */
@Entity
@Table(name = "Notification")
@Data

public class Notification implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int notificationId;
	private String title;
	private String body;
	@Temporal(TemporalType.TIMESTAMP)
	private Date notificationDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date expiryDate;
	private String createdBy;

	private boolean isSpecifictoUser;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedBy;
	private boolean isActive;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "typeId")
	private NotificationType notificationType;

}
