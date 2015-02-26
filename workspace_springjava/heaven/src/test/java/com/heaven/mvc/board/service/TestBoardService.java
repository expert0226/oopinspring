package com.heaven.mvc.board.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.heaven.mvc.board.dao.BoardDao;
import com.heaven.mvc.board.domain.BoardVO;

public class TestBoardService {
	List<BoardVO> boards;
	BoardServiceImpl boardServiceImpl;
	BoardDao mockBoardDao;
	
	@Before
	public void setUp() {
		this.boards = new ArrayList<BoardVO>();		
		
		BoardVO boardVO;
		
		boardVO = new BoardVO("제목1", "내용1", "작성자1", 1000);
		boardVO.setSeq(1);
		this.boards.add(boardVO);
		
		boardVO = new BoardVO("제목2", "내용2", "작성자2", 2000);
		boardVO.setSeq(2);
		this.boards.add(boardVO);
		
		boardVO = new BoardVO("제목3", "내용3", "작성자3", 3000);
		boardVO.setSeq(3);
		this.boards.add(boardVO);		

		this.mockBoardDao = mock(BoardDao.class);
		when(this.mockBoardDao.list()).thenReturn(this.boards);
		when(this.mockBoardDao.select(1)).thenReturn(this.boards.get(0));
		when(this.mockBoardDao.select(2)).thenReturn(this.boards.get(1));
		when(this.mockBoardDao.select(3)).thenReturn(this.boards.get(2));
		
		this.boardServiceImpl = new BoardServiceImpl();
		this.boardServiceImpl.setBoardDao(mockBoardDao);		
	}
	
	@Test
	public void testList() {
		List<BoardVO> boardList = boardServiceImpl.list();
		
		assertThat(boardList.size(), is(3));
	}
	
	@Test
	public void testRead() {
		BoardVO boardVO;
		
		for(int index = 0; index < boards.size(); index++) {
			boardVO = boardServiceImpl.read(index + 1);		
			compareVO(boardVO, index);
		}
	}

	private void compareVO(BoardVO boardVO, int index) {
		assertThat(boardVO.getTitle(), is(this.boards.get(index).getTitle()));
		assertThat(boardVO.getContent(), is(this.boards.get(index).getContent()));
		assertThat(boardVO.getWriter(), is(this.boards.get(index).getWriter()));
		assertThat(boardVO.getCnt(), is(this.boards.get(index).getCnt()));
	}
}