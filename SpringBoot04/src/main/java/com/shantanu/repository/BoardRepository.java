package com.shantanu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shantanu.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	public Board findByName(String name);

}
