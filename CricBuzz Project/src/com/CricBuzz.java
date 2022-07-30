package com;

import java.util.Scanner;

public class CricBuzz {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	CricketersInformation cr=new CricketersInformationIpml();
	System.out.println("Welcome To CricBuzz");
	System.out.println("----------------");
	while(true) {
	System.out.println("1:ADD PLAYER\n2:REMOVE PLAYER");
	System.out.println("3:REMOVE PLAYERS\n4:DISPLAY PLAYER");
	System.out.println("5:DISPLAY ALL PLAYERS\n6:UPDATE PLAYER");
	System.out.println("7:COUNT PLAYER\n8:SORT PLAYERS\n9:EXIT");
	System.out.println("Enter The Choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		 cr.addPlayer();
		 break;
	case 2:
		cr.removePlayer();
		break;
	case 3:
		cr.removePlayers();
		break;
	case 4:
		cr.displayPlayer();
		break;
	case 5:
		cr.displayAllPlayers();
		break;
	case 6:
		cr.updatePlayer();
		break;
	case 7:
		cr.countPlayers();
		break;
	case 8:
		cr.sortPlayers();
		break;
	case 9:
		System.out.println("Thank You!!");
		System.exit(0);
		break;
		default:
			System.out.println("Invalid Choice");
	}
	System.out.println("-----------------------------");
	}
}
}
