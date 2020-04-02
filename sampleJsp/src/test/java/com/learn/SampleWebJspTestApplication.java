package com.learn;

import com.learn.controller.WelcomeController;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class SampleWebJspTestApplication {

    private MockMvc mvc;

    @Before
    private void setUp() throws Exception{
        mvc = MockMvcBuilders.standaloneSetup(new WelcomeController()).build();
    }



}
