package main;

import java.util.*;

import bean.Customer;

public class Main {
	public static void main(String[] args) throws Exception{
		int choice = -1;
		Scanner scan = new Scanner( System.in);
		do {
			System.out.println("+--------MAIN-MENU--------+");
			System.out.println("| 1.Load Cash to ATM      |");
			System.out.println("| 2.Show Customer Details |");
			System.out.println("| 3.Show ATM Operations   |");
			System.out.println("| 4.Show ATM Balance      |");
			System.out.println("| 0.Exit                  |");
			System.out.println("+-------------------------+");
			System.out.print("Enter you Choice: ");
			choice = scan.nextInt();
			switch(choice) {
				case 1:
					System.out.println("---------LOAD-CASH-INTO-ATM-------------");
					System.out.print("Enter rs2000:");
					int rs2000 = scan.nextInt();
					System.out.print("Enter rs500:");
					int rs500 = scan.nextInt();
					System.out.print("Enter rs100:");
					int rs100 = scan.nextInt();
					ATM.LoadCash( rs2000, rs500, rs100);
					System.out.println("Cash has been Loaded into the ATM");
					System.out.println();
					break;
				case 2: 
					System.out.println("---------SHOW-CUSTOMER-DETAILS-------------");
					Details.display();
					System.out.print("Press any character to Continue:");
					scan.next();
					break;
				case 3:
					System.out.println("-----------CUSTOMER-LOGIN---------------------");
					System.out.println("Please Login to Continue..");
					System.out.print("Customer Name: ");
					String name = scan.next();
					System.out.print("Enter Pin: ");
					int pin = scan.nextInt();
					Customer cust = ATMProcess.validate(name, pin);
					if( cust != null) {
						System.out.println("Login Successfull..");
						ATMProcess process = new ATMProcess( cust);
						ATMProcess.startProcess(process, scan);
					} else {
						System.out.println("Incorrent Login Input..");
					}
					break;
				case 4:
					ATM.display();
					System.out.print("Press any character to Continue..");
					scan.next();
					break;
			}
		} while( choice != 0);
		scan.close();
//		Details.populate();
	}
}
