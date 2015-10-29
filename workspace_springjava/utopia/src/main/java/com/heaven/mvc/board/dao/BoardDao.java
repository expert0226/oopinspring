package com.heaven.mvc.board.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heaven.mvc.board.domain.BoardVO;

public interface BoardDao extends JpaRepository<BoardVO, Integer> {
	
}