package com.example.demo;

import com.sun.org.apache.xerces.internal.util.Status;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class DemoApplicationTests {

	private MockMvc mm;
	@Before
	public void test(){
		mm = MockMvcBuilders.standaloneSetup(new HomeController()).build();
	}
	@Test
	public void contextLoads() throws  Exception{
		//mm.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON)).andExpect(status);
	}

}
