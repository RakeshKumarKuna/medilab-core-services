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
 * @author Rakeh Kumar Kuna
 *
 */
@Entity
@Table(name = "UserPermission")
@Data
public class UserPermission implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column()
	private String name;
	/**
	 * audit info
	 */
	@Column
	private String createdBy;
	@Column
	private Date createDate;
	@Column
	private String updatedBy;
	@Column
	private Date updatedDate;

}
