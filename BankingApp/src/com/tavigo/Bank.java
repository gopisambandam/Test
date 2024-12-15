package com.tavigo;

import java.io.InputStream;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		    	Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your Operation: ");
		        String operation = scanner.nextLine();
		        while (operation != "X") {
					switch (operation) {
					  case "C":
					    System.out.println("Implement account creation");
					    break;
					  case "W":
					    System.out.println("Implement withdraw amount from customer account");
					    break;
					  case "D":
					    System.out.println("Implement deposit amount to customer account ");
					    break;
					  case "T":
					    System.out.println("Implemention transfer of amount from one account to another customer");
					    break;
					}
			        operation = scanner.nextLine();
	
		        }
		        scanner.close();

		}
}
