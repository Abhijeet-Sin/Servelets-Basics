package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDao;
import dao.PersonDaoImple;
import model.Address;
import model.Person;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Person person = new Person();
		Address address = new Address();
		person.setRole(request.getParameter("role")); 
		person.setFirstname(request.getParameter("fname"));
		person.setLastname(request.getParameter("lname"));
		person.setUsername(request.getParameter("uname"));
		person.setPassword(request.getParameter("pwd"));
		person.setEmail(request.getParameter("email"));
		person.setAge(Integer.parseInt(request.getParameter("age")));
		
		address.setDoorNo(Integer.parseInt(request.getParameter("doorno")));
		address.setDoorNo(Integer.parseInt(request.getParameter("pincode")));
		address.setCity(request.getParameter("city"));
		address.setStreet(request.getParameter("street"));
		address.setState(request.getParameter("state"));
		address.setCountry(request.getParameter("country"));
		
		person.setAddress(address);
		PersonDao dao =new PersonDaoImple();
		dao.addPerson(person);
		PrintWriter out = response.getWriter();
		out.println("<h1> Person Added Sucessfully to the database from the servlet end </h1>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
