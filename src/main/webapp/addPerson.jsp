<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head><p><b>Grzybki halucynki i takie tam (:</b></p>
<body>
		<c:forEach var="drug" begin="1" end="${baza.length}"><br><br>
	        <p>Nazwa: ${baza.allPersons.get(drug-1).imie}</p>
	        <p>Czas dzialania: ${baza.allPersons.get(drug-1).czas}</p>
	        <p>Rodzaj: ${baza.allPersons.get(drug-1).rodzaj}</p>
	        <p>Symptomy po spożyciu: ${baza.allPersons.get(drug-1).symptomy}</p>
	        <p>Opis dzialania: ${baza.allPersons.get(drug-1).opis}</p>
	        <p>Rodzina: ${baza.allPersons.get(drug-1).rodzina}</p>
    	</c:forEach>
    	
    	
</body>
</html>