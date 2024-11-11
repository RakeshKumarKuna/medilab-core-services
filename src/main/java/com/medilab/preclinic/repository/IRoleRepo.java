package com.medilab.preclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.medilab.preclinic.domain.UserRole;
public interface IRoleRepo extends JpaRepository<UserRole, Integer> {

}
