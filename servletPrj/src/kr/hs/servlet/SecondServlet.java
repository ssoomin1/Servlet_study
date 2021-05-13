package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		//해도 되고 안해도 되고
		System.out.println("init()출력");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int a=3;
		//짝수, 홀수인지 판별해서 출력
		if(a%2==0) System.out.println("짝수입니다.");
		else System.out.println("홀수입니다.");
	}
}
