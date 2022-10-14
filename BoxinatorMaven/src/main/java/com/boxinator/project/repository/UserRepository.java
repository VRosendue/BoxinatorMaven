package com.boxinator.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boxinator.project.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	boolean findByEmail(String email);
}
