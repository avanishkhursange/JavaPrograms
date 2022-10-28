import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner read = new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius to be converted: ");
        celsius = read.nextDouble();
        fahrenheit = (9*celsius+160)/5; 
        System.out.println(celsius+" degrees Celsius = "+fahrenheit+" degrees Fahrenheit");
    }
}
