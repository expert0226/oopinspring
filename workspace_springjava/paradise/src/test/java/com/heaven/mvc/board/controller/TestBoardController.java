package com.heaven.mvc.board.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;

import com.heaven.mvc.board.domain.BoardVO;
import com.heaven.mvc.board.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/BoardDaoTest-context.xml")
public class TestBoardController {
	@Test
	public void postWriteOK() {
		BoardController controller = new BoardController();
		BoardService service = mock(BoardService.class);		
		controller.setBoardService(service);
		
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("spring");
		
		BindingResult result = new BeanPropertyBindingResult(boardVO, "board");
		
		//Model model = new ExtendedModelMap();
		
		String viewName = controller.write(boardVO, result);
		//문제점 BindingResult 에 강제 에러를 설정해 주지 않는 이상 필수 항목 값을 다 입력하지 않아도 통과
		assertThat(viewName, is("redirect:/board/list"));
		// service 의 메서드 중에 boardVO 를 인자로하는 write() 메서드가 호출된 적이 있는지 검사
		verify(service).write(boardVO);
	}

	@Test
	public void postWriteError() {
		BoardController controller = new BoardController();
		BoardService service = mock(BoardService.class);		
		controller.setBoardService(service);
		
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("spring");
		
		BindingResult result = new BeanPropertyBindingResult(boardVO, "board");
		result.rejectValue("content",  "required", "input context please");
		
		//Model model = new ExtendedModelMap();
		
		String viewName = controller.write(boardVO, result);
		assertThat(viewName, is("/board/write"));
		//verify(service).write(boardVO);
	}
}
