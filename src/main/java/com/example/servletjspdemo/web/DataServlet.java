package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.servletjspdemo.domain.Drug;
import com.example.servletjspdemo.service.CoffeeShop;

@WebServlet(urlPatterns = "/dajsewzyle")
public class DataServlet extends HttpServlet {

private static final long serialVersionUID = 1L;



@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");

PrintWriter out = response.getWriter();
		
		CoffeeShop dealer = (CoffeeShop) getServletContext().getAttribute("drugData");
		
		if(request.getSession().getAttribute("newDrug") == null)
		{
			request.getSession().setAttribute("newDrug", new Drug());
		}



	String selectedImie = "";
	for (String imie : request.getParameterValues("Imie")) {
	selectedImie += imie + " ";
	}
	
	String selectedNazwisko = "";
	for (String nazwisko : request.getParameterValues("Nazwisko")) {
	selectedNazwisko += nazwisko + " ";
	}
	
	String selectedPlec = "";
	for (String plec : request.getParameterValues("Plec")) {
	selectedPlec += plec + " ";
	}
	
	String selectedHobby = "";
	for (String hobby : request.getParameterValues("Hobby")) {
	selectedHobby += hobby + " ";
	}
	
	String selectedOpis = "";
	for (String opis : request.getParameterValues("Opis")) {
	selectedOpis += opis + " ";
	}
	
	String selectedWyksztalcenie = "";
	for (String wyksztalcenie : request.getParameterValues("gupi")) {
	selectedWyksztalcenie += wyksztalcenie + " ";
	}

	Drug mixture = new Drug(selectedImie, selectedNazwisko, selectedPlec, selectedHobby, selectedOpis, selectedWyksztalcenie);
	dealer.add(mixture);
	
}

@Override
public void init() throws ServletException {
	if(getServletContext().getAttribute("drugData") == null)
	{
		getServletContext().setAttribute("drugData", new CoffeeShop());
	}
}

}