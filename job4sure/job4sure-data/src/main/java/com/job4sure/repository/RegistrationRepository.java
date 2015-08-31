package com.job4sure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.job4sure.model.Login;
import com.job4sure.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer>{
	
	@Query("select registration from Registration registration where login.userName=:userName")
	 public List<Login> findUserDetailByUserName(
	   @Param("userName") String userName);
	public List<Registration> findAll(String emailId);

	
}
