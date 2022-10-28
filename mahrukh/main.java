package com.mycompany.lab3t3;
/**
 * @author Mahrukh Khan
 */
public class Lab3t3 {

    public static void main(String[] args) {  
        
        Person[] person = new Person[2];
        
        Student p= new Student();
        Professor p1= new Professor();
        
        p.setCGPA(3.6);
        p1.setPublications(100);
        
        person[0]= p;
        person[1]=p1;
       
        for(int i=0;i<2;i++){
            System.out.println(person[i].isOutstanding());
        }
    }
}