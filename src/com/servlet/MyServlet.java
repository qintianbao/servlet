package com.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("init....");
		String value = super.getInitParameter("thisname");
		System.out.println("当前容器初始化值："+value);
		ServletContext servlet = super.getServletContext();
		String global = servlet.getInitParameter("globalname");
		System.out.println("web容器初始化值："+global);
		
	
		
	}
	@Override
	public void destroy() {
		System.out.println("destroy...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this doGet...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this doPost...");
		this.doGet(req, resp);
	}
	
}
