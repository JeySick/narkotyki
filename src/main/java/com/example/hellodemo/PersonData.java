package com.example.hellodemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.SessionContext;
import javax.enterprise.inject.New;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.servletjspdemo.domain.Drug;
import com.example.servletjspdemo.service.CoffeeShop;


@WebServlet (urlPatterns = "/personData")

public class PersonData extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		CoffeeShop data = (CoffeeShop) getServletContext().getAttribute("baza");
		
		if(req.getSession().getAttribute("osoba") == null)
		{
			req.getSession().setAttribute("osoba", new Drug());
		}
		
		Drug osoba = (Drug) req.getSession().getAttribute("osoba");
		
		osoba.setNazwa(req.getParameter("drugName"));
		
		osoba.setCzas((req.getParameter("czasDzialania")));
		
		osoba.setRodzaj(req.getParameter("rodzaj"));
		
		String symptomy = "";
		for (String sympto : req.getParameterValues("symptomy")) {
		symptomy += sympto + ", ";
		}
		osoba.setSymptomy(symptomy);
		
		osoba.setOpis(req.getParameter("opisDzialania"));
		osoba.setRodzina(req.getParameter("rodzina"));

		
		data.add(osoba);
		if(data.getAllPersons().size() >= 1) resp.sendRedirect("addPerson.jsp");
		else resp.sendRedirect(req.getContextPath());
		
	}

	@Override
	public void init() throws ServletException {
		if(getServletContext().getAttribute("baza") == null)
		{
			getServletContext().setAttribute("baza", new CoffeeShop());
		}
	}

}
	
