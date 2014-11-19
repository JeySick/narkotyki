<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<jsp:useBean id="baza" class="com.example.servletjspdemo.service.CoffeeShop" scope="application" />
<%
baza.clear();
response.sendRedirect(request.getContextPath());
%>
</body>
</html>