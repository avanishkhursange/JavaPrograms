public class useEcho{
    static void echo(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        String out = "This is a String ";
        echo (out);
        echo("This is a simple output");
        echo("This is output with a number" + 1);
    }
}