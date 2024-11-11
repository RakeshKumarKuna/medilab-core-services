package com.medilab.preclinic.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name ="TokenAuditInfo")
public class TokenAuditInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String createdBy;
	@Column
	private Date createDate;
	@Column
	private String updatedBy;
	@Column
	private Date updatedDate;
    /**
     * authnstore can be IDP/Db
     */
	private String authnStore;
	private Date tokenRefreshedTime;
	private String olderAccessToken;
	private String newAccessToken;
	private String subject;
	@OneToOne
	private MedilabAuthnToken authToken;
}
