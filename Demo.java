/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gaura
 */
/*public class Demo 
{
    int a=10; String b="dev";
    void show()
    {
        System.out.print(a+" "+b);
    }   
}
class Test
{
    public static void main(String[] args)
    {
        Demo r=new Demo();
        r.show();
    }
}*/
class Student{
int id;
String name;
int age;
//creating two arg constructor
Student(int i,String n)
{
id = i;
name = n;
}
//creating three arg constructor
Student(int i,String n,int a){
id = i;
name = n;
age=a;
}
void display(){
System.out.println(id+""+name+" "+age);
}
public static void main(String args[])
{
    Student s1=new Student(111,"Karan");
    Student s2=new Student(222,"Aryan",25);
    s1.display();
    s2.display();
}
}