package com.medilab.preclinic.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import lombok.Data;
@Data
public class AuditInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String createdBy;
	@Column
	private Date createDate;
	@Column
	private String updatedBy;
	@Column
	private Date updatedDate;
}
