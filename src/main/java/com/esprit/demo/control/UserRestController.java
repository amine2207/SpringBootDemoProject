package com.esprit.demo.control;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.demo.entity.User;
import com.esprit.demo.service.IUserService;

@RestController
public class UserRestController {

	@Autowired
	IUserService us;
	
	@GetMapping("/retrieve-all-users")
	@ResponseBody
	public List<User> getUsers()
	{
		List<User> list = us.retrieveAllUsers();
		return list;
	}
	
    @GetMapping("/retrieve-user/{user-id}")
    @ResponseBody
	public Optional <User> retrieveUser(@PathVariable("user-id") String userId)
	{
		return us.retrieveUser(userId);
	}
	
	@PostMapping("/add-user")
	@ResponseBody
	public User addUser(@RequestBody User u)
	{
		User user = us.addUser(u);
		return user;
	}
	
	@DeleteMapping("/remove-user/{user-id}")
	@ResponseBody
	public void removeUser(@PathVariable("user-id") String userId) {
	us.deleteUser(userId);
	//us.retrieveAllUsers();
	}
	
	@PutMapping("/modify-user")
	@ResponseBody
	public User modifyUser(@RequestBody User user) {
		return us.updateUser(user);
	}
	
	
}
