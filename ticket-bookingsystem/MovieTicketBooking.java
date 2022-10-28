package movie;

import java.util.Scanner;

public class MovieTicketBooking {

public static void main(String[] args) {

Demo d = new Demo();

d.getname();

}
}

class Demo{

static Scanner sc = new Scanner(System.in);

static String [] movieList = {"1) Beast", "2) Valemai", "3) Doctor", "4) KGF2", "5) Maanadu"}; 
public void getname() {
String name;
System.out.println("Enter your name: ");
name = sc.nextLine();
System.out.println("WELCOME "+name); 
getmovie();

}

public static void getmovie() {

System.out.println("Select the movie from your List: ");
for (int i=0; i<movieList.length; i++) {
	System.out.println(movieList[i]);
}


System.out.println("Please select the movie no.you want to watch: ");
int choice = sc.nextInt();
System.out.println(movieList[choice-1]); 
getseat();

}

public static void getseat() {

int n;

System.out.println("How many seat you want have Please Select ");
n = sc.nextInt(); 
int[] arr = new int[n];
System.out.println("Which seat number you want to have Choose it"); 
for (int i=0; i<n; i++) {
	arr[i]= sc.nextInt();
}

int amount = n*150; //1 ticket cost is 150
System.out.println("Total amount to pay: "+amount);
System.out.println("Please select your Bank to Pay ");

int bank=1;

while (bank==1) {

System.out.println("1) Axis Bank");

System.out.println("2) ICIC Bank");

System.out.println("3) Indian Bank");

System.out.println("4) State Bank");

int Bank = sc.nextInt();
switch(Bank) {

case 1:
   System.out.println("Welcome to Axis Bank"); 
   break;

case 2:

System.out.println("Welcome to ICIC Bank");
break;

case 3:

System.out.println("Welcome to Indian Bank"); 
break;

case 4:

System.out.println("Welcome to State Bank");
break;

default :
	System.out.println("INVALID INPUT !!!");
	System.out.println("CHOOSE AGAIN");
	continue;
}

break;

} 
System.out.println("Enter the amount :");

int amountpay = sc.nextInt();

if (amountpay == amount) {
	System.out.println("Your payment is Successfull ");

    System.out.println("Your seat has Been Successfully booked");

     System.out.println("THANK YOU !!!");

    }else {
System.out.println("enter a valid amount");
System.out.println("Your Payment is Failure Please try again!!");

}

}

}







