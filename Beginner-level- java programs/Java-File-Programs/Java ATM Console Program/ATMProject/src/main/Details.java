package main;

import java.util.*;
import java.io.*;
import bean.Customer;

public class Details {
	public static void populate() throws Exception{
		ArrayList<Customer> list = new ArrayList<>(
			List.of(
				new Customer( "Suresh", 2343, 25234),
				new Customer( "Ganesh", 5432, 34123),
				new Customer( "Magesh", 7854, 26100),
				new Customer( "Naresh", 2345, 80000),
				new Customer( "Harish", 1907, 103400)
			)
		);
		
		FileOutputStream fileout = new FileOutputStream("customer");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(list);
		out.close();
		fileout.close();
	}
	
	public static void display() throws Exception{
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
		
		if( list == null) list = new ArrayList<>();
		System.out.println("+--------+------------------+------------+--------------------+");
		System.out.println("| Acc No |   Account Holder ;alskdfja;slkdjfa;slkdfj| Pin Number |    Account Balance |");
		System.out.println("+--------+------------------+------------+--------------------+");
		for( int i = 0; i < list.size(); i ++) {
			Customer c = list.get(i);
			System.out.format("| %6s | %16s | %10s | %18s |\n", i, c.getName(), c.getPinNumber(), c.getBalance());
		}
		System.out.println("+--------+------------------+------------+--------------------+");
	}
}
