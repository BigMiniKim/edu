package edu.kosmo.ex.controller;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration //web.xml 읽어드림
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
      "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class BoardControllerTest {

   @Setter(onMethod_ = { @Autowired })
   private WebApplicationContext ctx; //web.xml에 있는 컨텍스트
   //컨트롤러 테스트 = 모가지 테스트
   private MockMvc mockMvc;

   @Before
   public void setup() {
      mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
   }

   @Test
   public void testList() throws Exception {
      mockMvc.perform(get("/list"))
      .andExpect(status()
      .isOk())// 응답 검증
      .andDo(print())
      .andExpect(forwardedUrl("/WEB-INF/views/board/list.jsp"));
   }

   //http://localhost:8282/ex/content_view?bid=26
   
   @Test
   public void testContent_view() throws Exception {

      
   log.info(mockMvc.perform(MockMvcRequestBuilders.get("/content_view").param("bid", "26")).andReturn()
            .getModelAndView().getModelMap());
   

   }
}