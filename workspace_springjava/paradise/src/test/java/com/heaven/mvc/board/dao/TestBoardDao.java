package com.heaven.mvc.board.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.transaction.annotation.Transactional;

import com.heaven.mvc.board.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/BoardDaoTest-context.xml")
//@Transactional
public class TestBoardDao {
	@Autowired
	private BoardDao boardDao;

	private List<BoardVO> boardList;

	@Before
	public void setUp() {
		boardDao.deleteAll();

		boardDao.insert(new BoardVO("제목1", "내용1", "작성자1", 1000));
		boardDao.insert(new BoardVO("제목2", "내용2", "작성자2", 1111));
		boardDao.insert(new BoardVO("제목3", "내용3", "작성자3", 2222));

		boardList = boardDao.list();
	}

	@Test
	public void list() {
		assertThat(boardList.size(), is(3));

		BoardVO dbVO;
		
		for(int index = 0; index < boardList.size(); index++) {
			dbVO = boardDao.select(boardList.get(index).getSeq());
			compareVO(dbVO, boardList.get(index));
		}
	}
	
	@Test
	public void delete() {
		int seq = boardList.get(0).getSeq();
		
		boardDao.delete(boardList.get(0));
		
		boardList = boardDao.list();
		
		assertThat(boardList.size(), is(2));
		assertThat(boardDao.select(seq), is(nullValue()));
	}

	@Test
	public void deleteAll() {
		boardDao.deleteAll();
		
		boardList = boardDao.list();

		assertThat(boardList.size(), is(0));
	}

	@Test
	public void update() {
		BoardVO vo = boardList.get(0);
		
		vo.setTitle("title");
		vo.setContent("context");
		vo.setContent("writer");
		
		boardDao.update(vo);
	
		compareVO(boardDao.select(vo.getSeq()), vo);
	}
	
	@Test
	public void insert() {
		BoardVO vo;
		BoardVO dbVO;
		
		vo = new BoardVO("제목4", "내용4", "작성자4", 3333);
		
		int size = boardDao.list().size();
		
		boardDao.insert(vo);
		
		dbVO = boardDao.select(vo.getSeq());
		
		vo.setRegDate(dbVO.getRegDate());
	
		assertThat(boardDao.list().size(), is(size + 1));
		compareVO(boardDao.select(vo.getSeq()), vo);
	}

	@Test
	public void select() {
		int index;		
		BoardVO dbVO;
		
		index = 0;
		dbVO = boardDao.select(boardList.get(index).getSeq());
		compareVO(dbVO, boardList.get(index));
		
		index = 1;
		dbVO = boardDao.select(boardList.get(index).getSeq());
		compareVO(dbVO, boardList.get(index));
	}
	
	@Test
	public void updateReadCount() {
		int index;		
		int readCount;
		BoardVO dbVO;
		
		index = 0;
		dbVO = boardDao.select(boardList.get(index).getSeq());
		readCount = dbVO.getCnt();
		boardDao.updateReadCount(dbVO.getSeq());
		dbVO = boardDao.select(boardList.get(index).getSeq());
		assertThat(dbVO.getCnt(), is(readCount + 1));
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
