package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Drug;

public class CoffeeShop {

private List<Drug> db = new ArrayList<Drug>();

public void add(Drug drug){
Drug newPerson = new Drug(drug.getImie(), drug.getCzas(), drug.getRodzaj(), drug.getSymptomy(), drug.getOpis(), drug.getRodzina());
db.add(newPerson);
}

public List<Drug> getAllPersons(){
return db;
}

public void spuscDragiWKiblu(){
db = new ArrayList<Drug>();
}

public int getLength() {
	return db.size();
}



}