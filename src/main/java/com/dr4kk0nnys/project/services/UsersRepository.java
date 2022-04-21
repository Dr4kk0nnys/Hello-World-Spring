package com.dr4kk0nnys.project.services;

import com.dr4kk0nnys.project.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {

}
