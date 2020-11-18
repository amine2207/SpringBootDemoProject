package com.esprit.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.esprit.demo.entity.Role;
import com.esprit.demo.entity.User;

public interface IUserService {

	
	public List<User>retrieveAllUsers();
	public User addUser(User u );
	public User updateUser(User u);
	public void deleteUser(String id);
	public Optional<User> retrieveUser(String id);
	
}
