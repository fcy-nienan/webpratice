package com.fcy.web;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "web")
@ContextConfiguration(locations={"classpath:SpringMVCDemo/application-context.xml",
        "classpath:SpringMVCDemo/spring-mvc.xml"})
public class SpringMVCTest {
    @Autowired
    private WebApplicationContext webApplicationContext;
    protected MockMvc mockMvc;
    protected MockHttpServletRequest request;
    protected MockHttpServletResponse response;
    private static Logger logger = Logger.getLogger(SpringMVCTest.class.getName());

    @Before
    public void setup(){
        //加载web容器上下文
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @Test
    public void testGetPome() throws  Exception {
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/user/login")// 数据的格式请求的url,请求的方法是 get
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)// 数据的格式
                        .param("username","1")// 添加参数
                        .param("password","12345")
        );
        MvcResult mvcResult = resultActions
        		 .andDo(MockMvcResultHandlers.print())// 打印出请求和相应的内容。如跳转视图的name以及传给视图的数据
        		 .andExpect(MockMvcResultMatchers.status().isOk()) //判断返回状态是否200
                .andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println(result);
        File file=new File("E://");

    }
}
