import java.io.File;

class Main {
  public static void main(String[] args) {
    File file = new File("JavaFile.java");
    try {
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("New Java File is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
    String program = "class JavaFile { " +
                       "public static void main(String[] args) { " +
                         "System.out.println(\"This is file\");"+
                       "}"+
                     "}";
     try {
       FileWriter output = new FileWriter("JavaFile.java");
       output.write(program);
       System.out.println("Data is written to the file.");
       output.close();
     }
     catch (Exception e) {
       e.getStackTrace();
     }
  }
}
