package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/odbior")
public class DataServlet extends HttpServlet {

private static final long serialVersionUID = 1L;



@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");

PrintWriter out = response.getWriter();


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

out.println("<html><body><h2>Twoje dane</h2>" +
"<p>Imie: " + selectedImie + "<br />" +
"<p>Nazwisko: " + selectedNazwisko + "<br />" +
"<p>Plec: " + selectedPlec + "<br />" +
"<p>Hobby: " + selectedHobby + "<br />" +
"<p>Opis: " + selectedOpis + "<br />" +
"<p>Wyksztalcenie: " + selectedWyksztalcenie + "<br />" +
"</body></html>");
out.close();

}

}