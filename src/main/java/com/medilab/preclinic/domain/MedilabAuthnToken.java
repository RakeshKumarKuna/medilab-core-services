package com.medilab.preclinic.domain;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "MedilabAuthToken")
@Data
public class MedilabAuthnToken  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String access_Token;
	private String  id_Token;
	private String  refresh_Token;
	private String  expiry;
	private String  token_Type;
}
