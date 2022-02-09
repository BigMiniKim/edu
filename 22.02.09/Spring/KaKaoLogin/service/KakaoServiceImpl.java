package edu.kosmo.ex.service;

import org.springframework.stereotype.Service;

@Service

public class KakaoServiceImpl  {
	 private final static String K_CLIENT_ID = "672eb324eb7778f950375c4cd7d5ab0d";
	 private final static String K_REDIRECT_URI = "http://localhost:8282/ex/auth/kakao/callback";
	 
		public String getAuthorizationUrl() {
			String kakaoUrl = "https://kauth.kakao.com/oauth/authorize?" + "client_id=" + K_CLIENT_ID + "&redirect_uri="
					+ K_REDIRECT_URI + "&response_type=code";
			return kakaoUrl;
		}
}
