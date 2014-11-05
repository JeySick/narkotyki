package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.servletjspdemo.domain.Person;
import com.example.servletjspdemo.service.StorageService;

@WebServlet(urlPatterns = "/odbior")
public class DataServlet extends HttpServlet {

private static final long serialVersionUID = 1L;



@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");

PrintWriter out = response.getWriter();
		
		StorageService data = (StorageService) getServletContext().getAttribute("baza");
		
		if(request.getSession().getAttribute("kosmita") == null)
		{
			request.getSession().setAttribute("kosmita", new Person());
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

	Person person = new Person(selectedImie, selectedNazwisko, selectedPlec, selectedHobby, selectedOpis, selectedWyksztalcenie);
	data.add(person);
	
	out.println("<html><body><h2>Wszystkie dane :</h2>");
	for (int i = 0; i < data.length(); i++) {
	

		out.println(
	"<p>Imie: " + data.getAllPersons().get(i).getImie() + "<br />" +
	"<p>Nazwisko: " + data.getAllPersons().get(i).getNazwisko() + "<br />" +
	"<p>Plec: " + data.getAllPersons().get(i).getPlec() + "<br />" +
	"<p>Hobby: " + data.getAllPersons().get(i).getHobby()+ "<br />" +
	"<p>Opis: " + data.getAllPersons().get(i).getOpis() + "<br />" +
	"<p>Wyksztalcenie: " + data.getAllPersons().get(i).getGupi() + "<br />"+ "<br />"+ "<br />");
	}
	out.print("</body></html>");
out.close();

}

@Override
public void init() throws ServletException {
	if(getServletContext().getAttribute("baza") == null)
	{
		getServletContext().setAttribute("baza", new StorageService());
	}
}

}