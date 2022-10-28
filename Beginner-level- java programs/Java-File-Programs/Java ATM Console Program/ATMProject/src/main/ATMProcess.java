package main;

import bean.Cash;
import bean.Customer;
import java.io.*;
import java.util.*;

public class ATMProcess {
	private Customer customer;
	
	public ATMProcess() {
		
	}

	public ATMProcess(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public static Customer validate( String name, int pin) throws Exception{
		ArrayList<Customer> list = null;
		Customer customer = null;
		FileInputStream filein = new FileInputStream("customer");
		try {
			ObjectInputStream in = new ObjectInputStream(filein);
			list = (ArrayList<Customer>) in.readObject();
			in.close();
		} catch( EOFException e) {
			//e.printStackTrace();
		}
		filein.close();
		
		if( list != null) {
			for( Customer cust: list) {
				if( cust.getName().equals(name) && cust.getPinNumber() == pin) {
					customer = cust;
				}
			}
		}
		
		return customer;
	}
	
	public static void withdraw( ATMProcess process, int amount) throws Exception{
		Customer customer = process.getCustomer();
		customer.setBalance(customer.getBalance()-amount);
		
		ArrayList<Customer> list = null;
		FileInputStream filein = new FileInputStream("customer");
		try {
			ObjectInputStream in = new ObjectInputStream(filein);
			list = (ArrayList<Customer>) in.readObject();
			in.close();
		} catch( EOFException e) {
			//e.printStackTrace();
		}
		filein.close();
		
		if( list != null) {
			for( int i = 0; i < list.size(); i ++) {
				Customer cust = list.get(i);
				if( cust.getName().equals(customer.getName()) && cust.getPinNumber() == customer.getPinNumber()) {
					list.get(i).setBalance(customer.getBalance());
				}
			}
		}
		
		FileOutputStream fileout = new FileOutputStream("customer");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(list);
		out.close();
		fileout.close();
		
	}
	
	public static void transfer( ATMProcess process, int amount, int acc_no) throws Exception {
		Customer customer = process.getCustomer();
		//customer.setBalance(customer.getBalance()-amount);
		
		ArrayList<Customer> list = null;
		FileInputStream filein = new FileInputStream("customer");
		try {
			ObjectInputStream in = new ObjectInputStream(filein);
			list = (ArrayList<Customer>) in.readObject();
			in.close();
		} catch( EOFException e) {
			//e.printStackTrace();
		}
		filein.close();
		
		if( list != null && acc_no < list.size()) {
			customer.setBalance(customer.getBalance()-amount);
			for( int i = 0; i < list.size(); i ++) {
				Customer cust = list.get(i);
				if( cust.getName().equals(customer.getName()) && cust.getPinNumber() == customer.getPinNumber()) {
					list.get(i).setBalance(customer.getBalance());
				}
			}
			list.get(acc_no).setBalance( list.get(acc_no).getBalance() + amount);
			System.out.println("Amount successfully transferred to Acc.No: " + acc_no + " !!");
		} else {
			System.out.println("No such recipient exist !!");
		}
		
		FileOutputStream fileout = new FileOutputStream("customer");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(list);
		out.close();
		fileout.close();
	}
	
	public static void startVending( int amount, int maxRs100, ATMProcess process) throws Exception{
		Cash cash = ATM.getCash();
		int rs2000count = 0;
		int rs500count = 0;
		int rs100count = 0;
		int num = amount;
		while( num >= 2000) {
			rs2000count ++;
			num -= 2000;
		}
		while( num >= 500) {
			rs500count ++;
			num -= 500;
		}
		while( num >= 100 && rs100count <= maxRs100) {
			rs100count ++;
			num -= 100;
		}
		if( num == 0 && ( cash.getRs2000() >= rs2000count && cash.getRs500() >= rs500count && cash.getRs100() >= rs100count)) {
			ATM.LoadCash( -rs2000count, -rs500count, -rs100count);
			ATMProcess.withdraw(process, amount);
			System.out.println("Withdrawal Sucessfull !! Please collect your Cash from ATM Vending Tray !!");
			System.out.println("+--------------+-----------+");
			System.out.println("| Denomination |    Number |");
			System.out.println("+--------------+-----------+");
			System.out.format("| %12s | %9s |\n", "Rs.2000", rs2000count);
			System.out.format("| %12s | %9s |\n", "Rs.500", rs500count);
			System.out.format("| %12s | %9s |\n", "Rs.100", rs100count);
			System.out.println("+--------------+-----------+");
		} else {
			System.out.println("Insufficient Cash on ATM !!");
		}
	}
	
	public static void startProcess( ATMProcess process, Scanner scan) throws Exception {
//		Scanner scan = new Scanner( System.in);
		Cash cash = ATM.getCash();
		Customer cust = process.getCustomer();
		do {
			System.out.println("+---CUSTOMER-OPERATIONS----+");
			System.out.println("| 1.Check Acc. Balance     |");
			System.out.println("| 2.Widthdraw Money        |");
			System.out.println("| 3.Transfer Money         |");
			System.out.println("| 4.Back to Main Menu      |");
			System.out.println("+--------------------------+");
			System.out.print("Enter you Choice: ");
			int choice = scan.nextInt();
			if( choice != 4) {
				switch(choice) {
					case 1:
						System.out.println("--------ACC-BALANCE---------");
						System.out.println("Acc. Holder: " + cust.getName());
						System.out.println("Acc. Balance: " + cust.getBalance());
						break;
					case 2:
						System.out.println("--------WITHDRAW-MONEY---------");
						int amount;
						System.out.print("Enter Amount to Withdraw:");
						amount = scan.nextInt();
						if( amount%100 == 0) 
						{
							if( amount <= 10000 && amount >= 100) 
							{
								int balance = cust.getBalance();
								if( amount <= balance) 
								{
									if( amount <= 5000 && ( ( amount > 3000 && cash.getRs2000() > 0) || ( amount > 1000 && cash.getRs500() > 0) || ( amount > 1500 && cash.getRs100() >= 10 ) || ( amount <= 1500))) 
									{
										ATMProcess.startVending(amount, 15, process);
									} 
									else if( amount > 5000 && ( cash.getRs2000() >= 2 && cash.getRs500() >= 2)) 
									{
										ATMProcess.startVending(amount, 10, process);
									} 
									else {
										System.out.println("Insufficient Cash on ATM !!");
									}
								} 
								else {
									System.out.println("Insufficient Balance (" + balance +") !!");
								}
							} 
							else {
								System.out.println("Withdrawal Range is from Rs.100 to Rs.10000 !!");
							}
						} 
						else {
							System.out.println("Withdrawal is only allowed in the Multiples of 100, 500 and 2000 !!!");
						}
						break;
					case 3:
						System.out.println("--------TRANSFER-MONEY----------");
						System.out.print("Enter Amount to Transfer:");
						amount = scan.nextInt();
						if( amount <= cust.getBalance() ) {
							System.out.println("Enter Acc. No of Recipient:");
							int accNo = scan.nextInt();
							ATMProcess.transfer(process, amount, accNo);
						} else {
							System.out.println("Insufficient Balance (" + cust.getBalance() +") !!");
						}
						break;
				}
			} else {
				break;
			}
 		} while( true);
	}
}
