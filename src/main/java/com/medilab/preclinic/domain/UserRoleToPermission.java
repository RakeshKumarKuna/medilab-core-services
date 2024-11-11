package com.medilab.preclinic.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Table(name = "UserRoleToPermissiom")
@Entity
@Data
public class UserRoleToPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    @ManyToOne
    private UserRole userRole;
    @ManyToOne
    private UserPermission userPermission;

}
