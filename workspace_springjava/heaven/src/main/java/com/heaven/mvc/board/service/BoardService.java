package com.heaven.mvc.board.service;

import java.util.List;
import com.heaven.mvc.board.domain.BoardVO;

public interface BoardService {
	public abstract List<BoardVO> list();

	public abstract int delete(BoardVO boardVO);
	
	public abstract int edit(BoardVO boardVO);

	public abstract void write(BoardVO boardVO);

	public abstract BoardVO read(int seq);
}