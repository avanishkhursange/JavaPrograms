/**
 *
 *  Mahrukh Khan
 */
public class Student extends Person{
    double CGPA;
    
  public void setCGPA(double cgpa){
      CGPA= cgpa;
  }
  public double getCGPA(){
      return CGPA;
  }
  
    @Override
   public boolean isOutstanding(){
      if (CGPA > 3.5){
          return true;
      }  
      else return false;
    }
    
}