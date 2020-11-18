package com.esprit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	//public User findByAgeGreaterThan(int age);
	//public long count();
}
