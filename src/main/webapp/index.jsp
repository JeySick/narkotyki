<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>sex drugs & rock&roll</title>
</head>
<body background="http://2.bp.blogspot.com/-iHjfsuy_55E/T1Rze9J-u9I/AAAAAAAAADQ/6d3qPtIUwnk/s1600/creepy%2Beye%2Bdrawing%2B%282%29.jpg">
<br><br>
    <jsp:useBean id="storage" class="com.example.servletjspdemo.service.CoffeeShop" scope="request" />
	<jsp:useBean id="osoba" class="com.example.servletjspdemo.domain.Drug" scope="session"/>
    <h2>Magic World of Drugs</h2>
    <br>

    <form action="personData" method="post">
        nazwa: <input type="text" name="drugName" value="${osoba.imie }"><br/><br>
        czas dzialania: <input type="text" name="czasDzialania" value="${osoba.czas }"><br/><br>
        rodzaj: <input type="radio" name="rodzaj" value="miekkie"<%= (osoba.getRodzaj().contains("miekkie"))?("checked='checked'"):""%>>miekkie
        <input type="radio" name="rodzaj" value="twarde"<%= (osoba.getRodzaj().contains("twarde"))?("checked='checked'"):""%>>twarde<br><br>
        symptomy: <br><input type="checkbox" name="symptomy" value="brak laknienia" <%= (osoba.getSymptomy().contains("brak laknienia"))?("checked='checked'"):""%>>brak laknienia
        		  <br><input type="checkbox" name="symptomy" value="nadmierne pocenie"<%= (osoba.getSymptomy().contains("nadmierne pocenie"))?("checked='checked'"):""%>>nadmierne pocenie
        		  <br><input type="checkbox" name="symptomy" value="jadlowstret"<%= (osoba.getSymptomy().contains("jadlowstret"))?("checked='checked'"):""%>>jadlowstret
        		  <br><input type="checkbox" name="symptomy" value="swiatlowstret"<%= (osoba.getSymptomy().contains("swiatlowstret"))?("checked='checked'"):""%>>swiatlowstret
        		  <br><input type="checkbox" name="symptomy" value="suchosc w ustach"<%= (osoba.getSymptomy().contains("suchosc w ustach"))?("checked='checked'"):""%>>suchosc w ustach
        		  <br><input type="checkbox" name="symptomy" value="euforia"<%= (osoba.getSymptomy().contains("euforia"))?("checked='checked'"):""%>>euforia
        		  <br><input type="checkbox" name="symptomy" value="przyplyw energii"<%= (osoba.getSymptomy().contains("przyplyw energii"))?("checked='checked'"):""%>>przyplyw energii
        		  <br><input type="checkbox" name="symptomy" value="poczucie pewnosci"<%= (osoba.getSymptomy().contains("poczucie pewnosci"))?("checked='checked'"):""%>>poczucie pewnosci
        		  <br><input type="checkbox" name="symptomy" value="polepszona koncentracja"<%= (osoba.getSymptomy().contains("polepszona koncentracja"))?("checked='checked'"):""%>>polepszona koncentracja
        		  <br><input type="checkbox" name="symptomy" value="drazliwosc i agresja"<%= (osoba.getSymptomy().contains("drazliwosc i agresja"))?("checked='checked'"):""%>>drazliwosc i agresja
        		  <br><input type="checkbox" name="symptomy" value="przymglona swiadomosc"<%= (osoba.getSymptomy().contains("przymglona swiadomosc"))?("checked='checked'"):""%>>przymglona swiadomosc
        		  <br><input type="checkbox" name="symptomy" value="zawroty glowy"<%= (osoba.getSymptomy().contains(""))?("checked='checked'"):""%>>zawroty glowy
        		  <br><input type="checkbox" name="symptomy" value="poszerzona zrenice"<%= (osoba.getSymptomy().contains("poszerzona zrenice"))?("checked='checked'"):""%>>poszerzona zrenice
        		  <br><input type="checkbox" name="symptomy" value="pobudzenie"<%= (osoba.getSymptomy().contains("pobudzenie"))?("checked='checked'"):""%>>pobudzenie
        		  <br><input type="checkbox" name="symptomy" value="niepokoj"<%= (osoba.getSymptomy().contains("niepokoj"))?("checked='checked'"):""%>>niepokoj
        		  <br><input type="checkbox" name="symptomy" value="wyostrzenie sluchu"<%= (osoba.getSymptomy().contains("wyostrzenie sluchu"))?("checked='checked'"):""%>>wyostrzenie sluchu
        		  <br><input type="checkbox" name="symptomy" value="omamy"<%= (osoba.getSymptomy().contains("omamy"))?("checked='checked'"):""%>>omamy
        		  <br><input type="checkbox" name="symptomy" value="nieobecnosc"<%= (osoba.getSymptomy().contains("nieobecnosc"))?("checked='checked'"):""%>>"nieobecosc"
        		  <br><input type="checkbox" name="symptomy" value="depersonalizacja"<%= (osoba.getSymptomy().contains("depersonalizacja"))?("checked='checked'"):""%>>depersonalizacja
        		  <br><input type="checkbox" name="symptomy" value="niespojnosc wypowiedzi"<%= (osoba.getSymptomy().contains("niespojnosc wypowiedzi"))?("checked='checked'"):""%>>niespojnosc wypowiedzi
        		  <br><input type="checkbox" name="symptomy" value="halucynacje"<%= (osoba.getSymptomy().contains("halucynacje"))?("checked='checked'"):""%>>halucynacje
        		  <br><br>
        
        
        
        opis dzialania: <textarea name="opisDzialania" rows="2" cols="30">${osoba.opis}</textarea><br>
        rodzina: <select name="rodzina"><option<%= (osoba.getRodzina().contains("psychodeliki"))?("selected='selected'"):""%>>psychodeliki</option>
        								<option<%= (osoba.getRodzina().contains("marihuana i haszysz"))?("selected='selected'"):""%>>marihuana i haszysz</option>
        								<option<%= (osoba.getRodzina().contains("halucynogeny"))?("selected='selected'"):""%>>halucynogeny</option>
        								<option<%= (osoba.getRodzina().contains("benzodiazepiny"))?("selected='selected'"):""%>>benzodiazepiny</option>
       									<option<%= (osoba.getRodzina().contains("barbiturany"))?("selected='selected'"):""%>>barbiturany</option>
       									<option<%= (osoba.getRodzina().contains("środki wziewne"))?("selected='selected'"):""%>>środki wziewne</option>
       									<option<%= (osoba.getRodzina().contains("psychostymulanty"))?("selected='selected'"):""%>>psychostymulanty</option>
        			</select>
        			<br>

        <input type="submit" value="Wyslij!">
    </form>
    
   <a href="deleteDrugs.jsp"><font color="red">Pozbadz się narkotykowow - policja!!</font></a>
</body>
</html>
