package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class MyServlet extends HttpServlet {

public void doGet (HttpServletRequest req, HttpServletResponse resp ) throws IOException
{
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.print("<h1>HELLO WORLD</h1>");
	
}


}
