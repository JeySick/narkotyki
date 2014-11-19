package com.example.hellodemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.servletjspdemo.domain.Drug;



@WebServlet(urlPatterns = "/siema")
public class HelloServlet extends HttpServlet {

private static final long serialVersionUID = 1L;



public void doGet(HttpServletRequest request,
       HttpServletResponse response)   throws ServletException, IOException {
HttpSession httpSession = request.getSession();


if(request.getSession().getAttribute("kosmita") == null){

request.getSession().setAttribute("kosmita", new Drug());
}
Drug person = (Drug) request.getSession().getAttribute("kosmita");



   PrintWriter out = response.getWriter();


   
   out.println("<html><head><title>Dane Osobowe</title></head><body>");
   out.println(" <form action=\"odbior\"; method=\"get\">");
   out.println("<input name=\"Imie\" />Imie<br /><br>");
   out.println("<input name=\"Nazwisko\" />Nazwisko<br /><br><br>");
   out.println("<input type=\"radio\" name=\"Plec\" value=\"kobieta\"  />Kobieta <br><br>");
   out.println("<input type=\"radio\" name=\"Plec\" value=\"mezczyzna\" />Mezczyzna<br><br>");
   out.println("<p>Hobby</p>");
   out.println("<input type=\"checkbox\" name=\"Hobby\" value=\"Muzyka\" />Muzyka<br />");
   out.println("<input type=\"checkbox\" name=\"Hobby\" value=\"Polityka\" />Polityka<br />");
   out.println("<input type=\"checkbox\" name=\"Hobby\" value=\"spacerty\" />Spacery<br />");
   out.println("Powiedz cos o sobie: <textarea name=\"Opis\" rows=\"3\" cols=\"40\"> opis ciebie </textarea><br><br>");
   out.println("Wyksztalcenie: <select name= \"gupi\"> <option> Wyksztalcenie wyzsze </option><option> Wyksztalcenie srednie </option><option> Wyksztalcenie podstawowe </option></select><br><br>");
   out.println("<input type=\"submit\" value=\"Wyslij\">");

   out.println("</form></body></html>");
   out.close();
 
}


}