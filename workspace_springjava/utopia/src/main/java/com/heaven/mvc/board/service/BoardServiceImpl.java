package com.heaven.mvc.board.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.heaven.mvc.board.dao.BoardDao;
import com.heaven.mvc.board.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Resource
	private BoardDao boardDao;

	public BoardDao getBoardDao() {
		return boardDao;
	}

	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public List<BoardVO> list() {
		return boardDao.findAll();
	}

	@Override
	public boolean delete(BoardVO boardVO) {
		BoardVO vo = boardDao.findOne(boardVO.getSeq());
		
		if(vo.getPassword() == boardVO.getPassword()) {
			boardDao.delete(boardVO);
			return true;
		}
		
		return false;
	}

	@Override
	public BoardVO edit(BoardVO boardVO) {
		return boardDao.save(boardVO);
	}

	@Override
	public BoardVO write(BoardVO boardVO) {
		boardVO.setRegDate(new Date());
		return boardDao.save(boardVO);
	}

	@Override
	public BoardVO read(int seq) {
		BoardVO boardVO = boardDao.findOne(seq);
		boardVO.setCnt(boardVO.getCnt() + 1);
		boardDao.save(boardVO);
		
		return boardVO;
	}
}
