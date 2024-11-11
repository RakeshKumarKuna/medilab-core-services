package com.medilab.preclinic.domain;

import java.io.Serializable;

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
@Entity
@Table(name = "DocumentStatus")
@Data
public class DocumentStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "statusId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String statusName;
}
