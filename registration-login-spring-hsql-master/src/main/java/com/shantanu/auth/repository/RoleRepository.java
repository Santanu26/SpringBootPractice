package com.shantanu.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shantanu.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
