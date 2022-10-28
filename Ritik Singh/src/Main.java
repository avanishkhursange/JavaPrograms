

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //mini project
        Scanner sc= new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        int userNum = 0;
        do{
            System.out.println("Guess my number: ");
            userNum = sc.nextInt();

            if(userNum== myNum){
                System.out.println("bravo ....! correct number");
                break;

            }
            else if(userNum > myNum){
                System.out.println("number too large");
            }
            else{
                System.out.println("number too small");
            }
        }while(userNum>=0);

        System.out.print("my number was: ");
        System.out.println(myNum);


    }
}