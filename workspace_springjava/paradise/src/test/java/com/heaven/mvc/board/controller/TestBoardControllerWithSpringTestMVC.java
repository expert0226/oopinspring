package com.heaven.mvc.board.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.server.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Matchers;
import org.springframework.test.web.server.MockMvc;
import org.springframework.test.web.server.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.heaven.mvc.board.domain.BoardVO;
import com.heaven.mvc.board.service.BoardService;

public class TestBoardControllerWithSpringTestMVC {
	static MockMvc mockMvc;
	static BoardService service;

	@BeforeClass
	public static void beforeClass() {
		BoardController controller = new BoardController();
		service = mock(BoardService.class);
		controller.setBoardService(service);
		
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/views");
		internalResourceViewResolver.setSuffix(".jsp");
		
		mockMvc = MockMvcBuilders.standaloneSetup(controller)
				.setViewResolvers(internalResourceViewResolver)
				.build();
	}

	@Before
	public void before() {
		reset(service);
	}

	@Test
	public void Write_정상_POST_요청() throws Exception {
		mockMvc.perform(post("/board/write")
				.param("title", "spring")
				.param("content", "spring")
				.param("password", "1234")
				.param("writer", "spring"))
			.andExpect(status().isOk())
			.andExpect(view().name("redirect:/board/list"));
		
		verify(service, times(1)).write(Matchers.<BoardVO>any());
	}

	@Test
	public void Write_비정상_POST_요청() throws Exception {
		mockMvc.perform(post("/board/write"))
			//.andDo(print())
			.andExpect(status().isOk())
			.andExpect(view().name("/board/write"));
		
		verify(service, times(0)).write(Matchers.<BoardVO>any());
	}
}
