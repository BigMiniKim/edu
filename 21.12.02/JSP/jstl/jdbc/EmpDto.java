package edu.kosmo.ex.dto;

public class EmpDto { //요즘 spring에서는 EmpVo로 표현) DB에 있는 한행을 객체로 표현해서 가져온다
	private int empno; //col
	private String ename;
	private String job;
	
	public EmpDto() {} //디폴트 생성자
	
	
	public EmpDto(int empno, String ename, String job) { //생성자
		
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
