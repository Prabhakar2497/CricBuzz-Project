package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class CricketersInformationIpml implements CricketersInformation {
	Scanner sc=new Scanner(System.in);
	LinkedHashMap<Integer, Cricketers>lm=new LinkedHashMap<>();
@Override
public void addPlayer() {
System.out.println("Enter Jersy Number,Name,Matches,Average,Strike Rate,Wickets");
	int jersyNumber=sc.nextInt();
	String name=sc.next();
	int matches=sc.nextInt();
	double averge=sc.nextDouble();
	double strikeRate=sc.nextDouble();
	int wickets=sc.nextInt();
Cricketers cr=new Cricketers(jersyNumber, name, matches, averge, 
		strikeRate, wickets);
	 lm.put(jersyNumber,cr);
	 System.out.println("Players Data Added Successfully");
}
@Override
public void removePlayer() {
	System.out.println("Enter The Player Jersy Number");
	int jersyNumber=sc.nextInt();
	if(lm.containsKey(jersyNumber)) {
		lm.remove(jersyNumber);
		System.out.println("Player Data Removd Successfully");
	}
	else {
		try {
throw new CricketersInformationNotFoundException("Invalid Jersy  Number");
		}
		catch(CricketersInformationNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
@Override
public void removePlayers() {
	lm.clear();
	System.out.println("Players Data Removed Successfully");
}
@Override
public void displayPlayer() {
	System.out.println("Enter The Jersy Number");
	int jersyNumber=sc.nextInt();
	if(lm.containsKey(jersyNumber)) {
		Cricketers cr=lm.get(jersyNumber);
		System.out.println(cr);
	}
	else {
		try {
		throw new CricketersInformationNotFoundException("Player Data Not Found");
		}
		catch(CricketersInformationNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
@Override
public void displayAllPlayers() {
	Set<Integer>s=lm.keySet();
	for(int a:s) {
		System.out.println(lm.get(a));
	}
}
@Override
public void updatePlayer() {
	System.out.println("Enter The Jersy Number");
	int jersyNumber=sc.nextInt();
if(lm.containsKey(jersyNumber)) {
	Cricketers cr=lm.get(jersyNumber);
	System.out.println("1:UPDATE NAME\n2:UPDATE MATCHES");
	System.out.println("3:UPDATE AVERAGE\n4:UPDATE STRIKE RATE");
	System.out.println("5:UPDATE WICKETS");
	System.out.println("Enter The Choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Enter The Name");
		String name=sc.next();
		cr.setName(name);
		System.out.println("Player Name Updated Successfully");
		break;
	case 2:
		System.out.println("Enter The Matches");
		int matches=sc.nextInt();
		cr.setMatches(matches);
		System.out.println("Player Match Updated Successfully");
		break;
	case 3:
		System.out.println("Enter The Average");
		double average=sc.nextDouble();
		cr.setAverage(average);
		System.out.println("Player Average Updated Successfully");
		break;
	case 4:
		System.out.println("Enter The Strike Rate");
		double strikeRate=sc.nextDouble();
		cr.setStrikeRate(strikeRate);
		System.out.println("Player Strike Rate Updated Successfully");
		break;
	case 5:
		System.out.println("Enter The Wickets");
		int wickets=sc.nextInt();
		cr.setWickets(wickets);
		System.out.println("Player Wickets Updated Succesfully");
		break;
		default:
			System.out.println("Invalid Choice!!");
	}
}
else {
	try {
	throw new CricketersInformationNotFoundException("Player Date Not Found");
	}
	catch(CricketersInformationNotFoundException e) {
		System.out.println(e.getMessage());
	}
}
}
@Override
public void countPlayers() {
	System.out.println("Total Players:"+lm.size());
}
@Override
public void sortPlayers() {
	ArrayList<Cricketers>al=new ArrayList<>();
	Set<Integer>s=lm.keySet();
	for(int jersyNumber:s) {
		al.add(lm.get(jersyNumber));
	}
System.out.println("1:SORT BASED ON NAME\n2:SORT BASED ON MATCHES");
System.out.println("3:SORT BASED ON AVERAGE\n4:SORT BASED ON STRIKE RATE");
System.out.println("5:SORT BASED ON WICKETES");
System.out.println("Enter The Choice");
int choice=sc.nextInt();
switch(choice) {
case 1:
	Collections.sort(al,new SortCricketersByName());
	for(Cricketers c1:al) {
		System.out.println(c1);
	}
	break;
case 2:
	Collections.sort(al,new SortCricketersByMatches());
	for(Cricketers c2:al) {
		System.out.println(c2);
	}
	break;
case 3:
	Collections.sort(al,new SortCricketersByAverage());
	for(Cricketers c3:al) {
		System.out.println(c3);
	}
	break;
case 4:
	Collections.sort(al,new SortCricketersByStrikeRate());
	for(Cricketers c4:al) {
		System.out.println(c4);
	}
	break;
case 5:
	Collections.sort(al,new SortCricketersByWickets());
	for(Cricketers c5:al) {
		System.out.println(c5);
	}
	break;
	default:
		System.out.println("Invalid Choice!!");
}
 
}
}

