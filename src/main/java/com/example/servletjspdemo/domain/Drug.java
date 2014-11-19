package com.example.servletjspdemo.domain;

public class Drug {

private String drugName = "";
private String czasDzialania = "";
private String rodzaj = "";
private String symptomy = "";
//symptomy-hobby
private String opisDzialania = "";
private String rodzina = "";
//wyksztalcenie=rodzina
public Drug(){
super();
}

public Drug(String nazwa, String czas, String rodzaj, String symptomy,
String opis, String rodzina) {
super();
this.drugName = nazwa;
this.czasDzialania = czas;
this.rodzaj = rodzaj;
this.symptomy = symptomy;
this.opisDzialania = opis;
this.rodzina = rodzina;
}
public String getImie() {
return drugName;
}
public void setNazwa(String nazwa) {
this.drugName = nazwa;
}
public String getCzas() {
return czasDzialania;
}
public void setCzas(String czas) {
this.czasDzialania = czas;
}
public String getRodzaj() {
return rodzaj;
}
public void setRodzaj(String rodzaj) {
this.rodzaj = rodzaj;
}
public String getSymptomy() {
return symptomy;
}
public void setSymptomy(String symptomy) {
this.symptomy = symptomy;
}
public String getOpis() {
return opisDzialania;
}
public void setOpis(String opis) {
this.opisDzialania = opis;
}

public String getRodzina() {
return rodzina;
}
public void setRodzina(String rodzina) {
this.rodzina = rodzina;
}

}