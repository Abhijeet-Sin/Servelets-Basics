package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondMine")
public class SecondMine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDate date =LocalDate.now();
		PrintWriter out =response.getWriter();
		out.println("<html><title> sososososoos</title><body> ");
		out.println("<h1>This Printed here "+date+"Just to see</h1></body></html>");
		request.setAttribute("jim",date);
		out.println("<h2> Request Object is " + request+"</h2>");
		out.println("<h2> Response Object is " + response+"</h2>");
		out.println("<h2> Context Object is " + getServletContext()+"</h2>");
		out.println("<h2> Config Object is " + getServletConfig()+"</h2>");
		getServletContext().getRequestDispatcher("/index.html").include(request, response);	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
