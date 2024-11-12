package com.medilab.preclinic.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 * @author Rakesh Kumar Kuna
 *
 */

@Entity
@Data
@Table(name = "UsertoDepartment")
public class UsertoDepartment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userdepartmentId;
	@OneToOne
	private MedilabUser medilabUser;
	@OneToOne
	private Department department;
}
