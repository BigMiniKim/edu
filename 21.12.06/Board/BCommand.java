package edu.kosmo.ex.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand {
	
	void execute(HttpServletRequest request, HttpServletResponse response); //자손이 구현해야함
	
}

