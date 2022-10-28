package main;

import java.io.*;

import bean.Cash;

public class ATM {
	
	public static Cash getCash() throws Exception{
		Cash cash = null;
		
		FileInputStream filein = new FileInputStream("cash");
		try {
			ObjectInputStream in = new ObjectInputStream(filein);
			cash = (Cash) in.readObject();
			in.close();
		} catch( EOFException e) {
			//e.printStackTrace();
		}
        filein.close();
        
        if( cash == null) {
        	cash = new Cash();
        }
        
        return cash;
	}
	
	public static void LoadCash( int rs2000, int rs500, int rs100) throws Exception{
		Cash cash = null;
		
		FileInputStream filein = new FileInputStream("cash");
		try {
			ObjectInputStream in = new ObjectInputStream(filein);
			cash = (Cash) in.readObject();
			in.close();
		} catch( EOFException e) {
			//e.printStackTrace();
		}
        filein.close();
        
        if( cash == null) {
        	cash = new Cash();
        }
        
        cash.setRs2000(cash.getRs2000()+rs2000);
        cash.setRs500(cash.getRs500()+rs500);
        cash.setRs100(cash.getRs100()+rs100);
        
        FileOutputStream fileout = new FileOutputStream("cash");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        
        out.writeObject(cash);
          
        out.close();
        fileout.close();
	}
	
	public static void display() throws Exception{
		
		Cash cash = null;
		FileInputStream filein = new FileInputStream("cash");
		try {
			ObjectInputStream in = new ObjectInputStream(filein);
			cash = (Cash) in.readObject();
			in.close();
		} catch( EOFException e) {
			//e.printStackTrace();
		}
        filein.close();
        
        if( cash == null) cash = new Cash();
        System.out.println("----------CURRENT-ATM-BALANCE-------");
        System.out.println("+--------------+--------+-----------+");
        System.out.println("| Denomination | Number |     Value |");
        System.out.println("+--------------+--------+-----------+");
        System.out.format("| %12s | %6s |  %8s |", "Rs.2000", cash.getRs2000(), cash.getRs2000()*2000);
        System.out.println();
        System.out.format("| %12s | %6s |  %8s |", "Rs.500", cash.getRs500(), cash.getRs500()*500);
        System.out.println();
        System.out.format("| %12s | %6s |  %8s |", "Rs.100", cash.getRs100(), cash.getRs100()*100);
        System.out.println();
        System.out.println("+--------------+--------+-----------+");
        System.out.println("Total Balance: Rs." + ( cash.getRs2000()*2000+cash.getRs500()*500+cash.getRs100()*100));
	}
	
	
}
