/**
 *
 *  Mahrukh Khan
 */
public class Professor extends Person{
    int numberOfPublications;
    
    public void setPublications(int p){
        numberOfPublications = p;
    }
    
    public int getNumberOfPublications(){
        return numberOfPublications;
    }
    
    @Override
   public boolean isOutstanding(){
      if (numberOfPublications > 50){
          return true;
      }  
      else return false;
    }
    
}