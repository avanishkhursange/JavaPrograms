// these all the basic java programs come under beginner level

import java.util.Scanner;  
public class LcmExample4  
{  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");         
int x = sc.nextInt();  
//reads an integer from the user  
System.out.print("Enter the second number: ");        
//reads an integer from the user  
int y = sc.nextInt();  
//logic for finding lcm of both numbers  
int i;  
//find the largest between two numbers x and y and assigns the large number to the variable a  
int a =(x > y)? x : y;  
  
for(i = a ; i <= x*y ; i = i + a)  
{  
//returns true if both conditions are true  
if(i % x == 0 && i % y == 0)  
break;  
}  
//prints the result  
System.out.println("LCM of "+x+" and "+y+" is: "+i);  
}  
}  
