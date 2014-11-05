package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Person;

public class StorageService {

private List<Person> db = new ArrayList<Person>();

public void add(Person person){
Person newPerson = new Person(person.getImie(), person.getNazwisko(), person.getPlec(), person.getHobby(), person.getOpis(), person.getGupi());
db.add(newPerson);
}

public List<Person> getAllPersons(){
return db;
}

public int length() {
	return db.size();
}



}