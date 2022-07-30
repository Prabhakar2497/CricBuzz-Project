package com;

public class Cricketers {
private int jersyNumber;
private String name;
private int matches;
private Double average;
private Double strikeRate;
private int wickets;
Cricketers(int jersyNumber,String name,int matches,
		double average,double strikeRate,int wickets){
	this.jersyNumber=jersyNumber;
	this.name=name;
	this.matches=matches;
	this.average=average;
	this.strikeRate=strikeRate;
	this.wickets=wickets;
}

public int getJersyNumber() {
	return jersyNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMatches() {
	return matches;
}
public void setMatches(int matches) {
	this.matches = matches;
}
public Double getAverage() {
	return average;
}
public void setAverage(Double average) {
	this.average = average;
}
public Double getStrikeRate() {
	return strikeRate;
}
public void setStrikeRate(Double strikeRate) {
	this.strikeRate = strikeRate;
}
public int getWickets() {
	return wickets;
}
public void setWickets(int wickets) {
	this.wickets = wickets;
}
@Override
public String toString() {
	return "Jersy Number:"+jersyNumber+"\tName:"+name+"\tMatches:"+matches+
			"\tAverage:"+average+"\tStrike Rate:"+strikeRate+"\tWickets:"+wickets;
   }
   }
