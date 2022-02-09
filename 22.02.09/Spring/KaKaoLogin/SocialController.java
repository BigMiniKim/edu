package edu.kosmo.ex;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.kosmo.ex.service.KakaoServiceImpl;
import edu.kosmo.ex.vo.kakao.KakaoAuth;
import edu.kosmo.ex.vo.kakao.KakaoProfile;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Setter
@Controller

public class SocialController {

	@Setter(onMethod_=@Autowired)
	private KakaoServiceImpl kakaoService;

	@GetMapping("/social")
	public String home(Model model) {
		log.info("social..");
		model.addAttribute("kakaoUrl", kakaoService.getAuthorizationUrl());
		
		return "social/login";
	}
	@GetMapping("/auth/kakao/callback")	
	public String kakaoCallback(String code,Model model,HttpSession session) {
		log.info("kakaoCallback ..");
		//이제 부터 스프링 서버와 외부 카카오 서버와 POST 통신을 해야함
		
		System.out.println("아이고==========");
		//KakaoAuth kakaoAuth = kakaoService.getKakaoTokenInfo(code);
		//KakaoProfile profile= kakaoService.getKakaoProfile(kakaoAuth.getAccess_token());
		//model.addAttribute("user", profile);
		
		//session.setAttribute("access_token", kakaoAuth.getAccess_token());
		
		//user.kakao_account.profile.nickname
		return "social/social_home";
	}
}