package com.heaven.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.heaven.mvc.UtopiaApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UtopiaApplication.class)
@WebAppConfiguration
public class UtopiaApplicationTests {

	@Test
	public void contextLoads() {
	}

}
