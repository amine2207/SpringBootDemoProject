package com.esprit.demo.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.esprit.demo.entity.Role;
import com.esprit.demo.entity.User;
import com.esprit.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;
	
	private static final Logger l =  LogManager.getLogger(UserServiceImpl.class);

	@Override
	public List<User> retrieveAllUsers() {
		List<User> users= (List <User>) userRepository.findAll();
		for(User user: users)
		{
			l.info("user:"+user);
		}
		return users;
	}

	@Override
	public User addUser(User u) {
		
		return userRepository.saveAndFlush(u);
	}

	@Override
	public void deleteUser(String id) {
		userRepository.deleteById(Long.parseLong(id));
		l.info("deleted");
		
	}

	@Override
	public User updateUser(User u){
		l.info("updated");
		return userRepository.save(u);
	}

	

	@Override
	public Optional<User> retrieveUser(String id) {
		// TODO Auto-generated method stub
		Optional<User> finder = userRepository.findById(Long.parseLong(id));
		
		l.info("user : "+finder);
		
		return finder;
	}


	


}
