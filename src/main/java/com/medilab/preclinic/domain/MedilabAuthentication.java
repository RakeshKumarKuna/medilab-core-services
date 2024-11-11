package com.medilab.preclinic.domain;

import java.io.Serializable;
import java.util.Set;

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
@Table(name = "MedilabAuthentication")
@Data
public class MedilabAuthentication implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String userName;
    private String passWord;
}
