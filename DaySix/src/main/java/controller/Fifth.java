package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Local;


@WebServlet("/Fifth")
public class Fifth extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDate date = (LocalDate) request.getAttribute("reqo");
		LocalDate ctxo = (LocalDate) getServletContext().getAttribute("contx");
		PrintWriter out =response.getWriter();
		out.println("<h1>Request Object Date is "+date+"</h1>");
		out.println("<h1>Context Object Date is "+ctxo+"</h1>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
