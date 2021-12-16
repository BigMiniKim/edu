package edu.kosmo.ex.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Allargsconstructor 생성자 @NoArgsConstructor 디폴트 생성자

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class Member {
 private String name; 
 private String id;
 private String pw;
 private String email;
 
 
 
 }
