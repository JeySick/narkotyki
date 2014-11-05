package com.example.servletjspdemo.domain;

public class Person {

private String imie = "";
private String nazwisko = "";
private String plec = "";
private String hobby = "";
private String opis = "";
private String gupi = "";

public Person(){
super();
}

public Person(String imie, String nazwisko, String plec, String hobby,
String opis, String gupi) {
super();
this.imie = imie;
this.nazwisko = nazwisko;
this.plec = plec;
this.hobby = hobby;
this.opis = opis;
this.gupi = gupi;
}
public String getImie() {
return imie;
}
public void setImie(String imie) {
this.imie = imie;
}
public String getNazwisko() {
return nazwisko;
}
public void setNazwisko(String nazwisko) {
this.nazwisko = nazwisko;
}
public String getPlec() {
return plec;
}
public void setPlec(String plec) {
this.plec = plec;
}
public String getHobby() {
return hobby;
}
public void setHobby(String hobby) {
this.hobby = hobby;
}
public String getOpis() {
return opis;
}
public void setOpis(String opis) {
this.opis = opis;
}

public String getGupi() {
return gupi;
}
public void setGupi(String gupi) {
this.gupi = gupi;
}

}