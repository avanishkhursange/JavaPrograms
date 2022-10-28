import java.io.*;
class test5rockpaperscissors
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        String name,c2="rock",c1;
        int num,n=0,point=0;
        num=(int)(Math.random()*3);
        System.out.println("enter your choice");
        c1=obj.readLine();
        if(num==1){
            c2="Scissors";
        }
        else if(num==2){
            c2="rock";
        }
        else if(num==3){
            c2="paper";
        }
        System.out.println("opponent move is "+c2);
        if(c1.equals(c2)){
            System.out.println("tie");
        }
        else if(c1.equals("Scissors")&&c2.equals("paper")||
        c1.equals("rock")&&c2.equals("Scissors")||c1.equals("paper")&&c2.equals("rock"))
        {
           System.out.println("you win"); 
        }
        else
        {
            System.out.println("you lose");
        }
    }
}
