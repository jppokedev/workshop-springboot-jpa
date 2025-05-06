package com.course.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.course_spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
