/**
 *
 *  Mahrukh Khan
 */
abstract public class Person {
  String name;  
  
  //setter and getter
  public void setName(String n){
      name = n;
  }
  public String getName(){
      return name;
  }
  
  abstract public boolean isOutstanding();
}
