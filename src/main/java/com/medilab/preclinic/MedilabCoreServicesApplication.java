package com.medilab.preclinic;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.medilab.preclinic.domain.UserPermission;
import com.medilab.preclinic.domain.UserRole;
import com.medilab.preclinic.domain.UserRoleToPermission;
import com.medilab.preclinic.repository.IRoleRepo;
import com.medilab.preclinic.repository.IUserPermission;

@SpringBootApplication
public class MedilabCoreServicesApplication implements CommandLineRunner {
	@Autowired
	private IRoleRepo repo;
	@Autowired
	private IUserPermission permissionRepo;
	

	public static void main(String[] args) {
		SpringApplication.run(MedilabCoreServicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
      UserPermission per=new UserPermission();
      per.setName("view");
      permissionRepo.save(per);
//      UserRole role=new UserRole();
//      role.setName("admin");
//      UserRoleToPermission urp=new UserRoleToPermission();
//      urp.setUserRole(role);
//      urp.setUserPermission(per);
//      Set<UserRoleToPermission> perSet=new HashSet<UserRoleToPermission>();
//      perSet.add(urp);
//      role.setPermissionSet(perSet);
//      repo.save(role);
      
	}
}
