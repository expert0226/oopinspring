package com.heaven.mvc.board.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.transaction.annotation.Transactional;

import com.heaven.mvc.UtopiaApplication;
import com.heaven.mvc.board.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UtopiaApplication.class)
//@Transactional
public class TestBoardDao {
	@Autowired
	private BoardDao boardDao;

	private List<BoardVO> boardList;

	@Before
	public void setUp() {
		boardDao.deleteAll();

		boardDao.save(new BoardVO("제목1", "내용1", "작성자1", 1000));
		boardDao.save(new BoardVO("제목2", "내용2", "작성자2", 1111));
		boardDao.save(new BoardVO("제목3", "내용3", "작성자3", 2222));

		boardList = boardDao.findAll();
	}

	@Test
	public void list() {
		assertThat(boardList.size(), is(3));

		BoardVO dbVO;
		
		for(int index = 0; index < boardList.size(); index++) {
			dbVO = boardDao.findOne(boardList.get(index).getSeq());
			compareVO(dbVO, boardList.get(index));
		}
	}
	
	@Test
	public void delete() {
		int seq = boardList.get(0).getSeq();
		
		boardDao.delete(boardList.get(0));
		
		boardList = boardDao.findAll();
		
		assertThat(boardList.size(), is(2));
		assertThat(boardDao.findOne(seq), is(nullValue()));
	}

	@Test
	public void deleteAll() {
		boardDao.deleteAll();
		
		boardList = boardDao.findAll();

		assertThat(boardList.size(), is(0));
	}

	@Test
	public void update() {
		BoardVO vo = boardList.get(0);
		
		vo.setTitle("title");
		vo.setContent("context");
		vo.setContent("writer");
		
		boardDao.save(vo);
	
		compareVO(boardDao.findOne(vo.getSeq()), vo);
	}
	
	@Test
	public void insert() {
		BoardVO vo;
		BoardVO dbVO;
		
		vo = new BoardVO("제목4", "내용4", "작성자4", 3333);
		
		int size = boardDao.findAll().size();
		
		boardDao.save(vo);
		
		dbVO = boardDao.findOne(vo.getSeq());
		
		vo.setRegDate(dbVO.getRegDate());
	
		assertThat(boardDao.findAll().size(), is(size + 1));
		compareVO(boardDao.findOne(vo.getSeq()), vo);
	}

	@Test
	public void select() {
		int index;		
		BoardVO dbVO;
		
		index = 0;
		dbVO = boardDao.findOne(boardList.get(index).getSeq());
		compareVO(dbVO, boardList.get(index));
		
		index = 1;
		dbVO = boardDao.findOne(boardList.get(index).getSeq());
		compareVO(dbVO, boardList.get(index));
	}
	
	@Test
	public void updateReadCount() {
		int index;		
		int readCount;
		BoardVO dbVO;
		BoardVO dbVO2;
		
		index = 0;
		
		int pk = boardList.get(index).getSeq();
		
		dbVO = boardDao.findOne(pk);
		readCount = dbVO.getCnt();
		dbVO.setCnt(dbVO.getCnt() + 1);
		boardDao.save(dbVO);
		
		dbVO2 = boardDao.findOne(pk);

		assertThat(dbVO2.getCnt(), is(readCount + 1));
	}

	private void compareVO(BoardVO vo1, BoardVO vo2) {
		assertThat(vo1.getSeq(), is(vo2.getSeq()));
		assertThat(vo1.getTitle(), is(vo2.getTitle()));
		assertThat(vo1.getContent(), is(vo2.getContent()));
		assertThat(vo1.getWriter(), is(vo2.getWriter()));
		assertThat(vo1.getRegDate(), is(vo2.getRegDate()));
		assertThat(vo1.getPassword(), is(vo2.getPassword()));
		assertThat(vo1.getCnt(), is(vo2.getCnt()));
	}
}
