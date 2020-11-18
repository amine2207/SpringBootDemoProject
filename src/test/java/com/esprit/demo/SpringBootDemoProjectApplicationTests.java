package com.esprit.demo;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.demo.entity.Role;
import com.esprit.demo.entity.User;
import com.esprit.demo.service.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoProjectApplicationTests {

	@Autowired
	public IUserService ius;
	

	@Test
   public void contextLoads() {
		///////////////////////////Retrieve Users//////////////////////////
		//ius.retrieveAllUsers();

		///////////////////////////Create User & refresh//////////////////////////
		User u = new User("Chef","Departement",Role.CHEF_DEPARTEMENT,new Date());
		User u_id= new User(1);
		/*ius.addUser(u);
		ius.retrieveAllUsers();*/
		
		///////////////////////////Update User & refresh//////////////////////////
		/*u_id.setFirstName("test1");
		u_id.setLastName("test1");
		u_id.setRole(Role.ADMINISTRATEUR);
		u_id.setDate(new Date());
		ius.updateUser(u_id);*/
		//ius.retrieveAllUsers();
		///////////////////////////Update User & refresh//////////////////////////
		/*ius.deleteUser(12);
		ius.retrieveAllUsers();*/
		///////////////////////////Find User by ID//////////////////////////
		
		ius.retrieveUser("1");
		
		
	}


}
