package com.heaven.mvc.board.service;

import java.util.List;
import com.heaven.mvc.board.domain.BoardVO;

public interface BoardService {
	public abstract List<BoardVO> list();

	public abstract boolean delete(BoardVO boardVO);
	
	public abstract BoardVO edit(BoardVO boardVO);

	public abstract BoardVO write(BoardVO boardVO);

	public abstract BoardVO read(int seq);
}