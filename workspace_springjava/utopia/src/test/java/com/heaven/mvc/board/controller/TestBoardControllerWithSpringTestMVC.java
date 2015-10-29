package com.heaven.mvc.board.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.heaven.mvc.UtopiaApplication;
import com.heaven.mvc.board.domain.BoardVO;
import com.heaven.mvc.board.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UtopiaApplication.class)
@WebAppConfiguration
public class TestBoardControllerWithSpringTestMVC {
	static MockMvc mockMvc;
	static BoardService service;
	
	@Autowired
	WebApplicationContext wac;

	@BeforeClass
	public static void beforeClass() {
		BoardController controller = new BoardController();
		service = mock(BoardService.class);
		controller.setBoardService(service);
	}

	@Before
	public void before() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac)
				.build();
		
		reset(service);
	}

	@Test
	public void Write_정상_POST_요청() throws Exception {
		mockMvc.perform(post("/board/write")
				.param("title", "spring")
				.param("content", "spring")
				.param("password", "1234")
				.param("writer", "spring"))
			.andExpect(status().is3xxRedirection())
			.andExpect(view().name("redirect:/board/list"));
	}

	@Test
	public void Write_비정상_POST_요청() throws Exception {
		mockMvc.perform(post("/board/write"))
			//.andDo(print())
			.andExpect(status().isOk())
			.andExpect(view().name("/board/write"));
	}
}
