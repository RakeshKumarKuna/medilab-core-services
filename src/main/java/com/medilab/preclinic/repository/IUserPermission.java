package com.medilab.preclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.medilab.preclinic.domain.UserPermission;

public interface IUserPermission extends JpaRepository<UserPermission, Integer> {

}
