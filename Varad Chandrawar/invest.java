public class Invests{
    public static void main(String[] args) {
        double amount;
        double principle=1000.0;
        double rate=0.05;

        System.out.printf("%s%20\n","year","Amount on deposit");
            for(int year=1;year<=10;year++){
                amount = principle * Math.pow(1.0+rate,year);
                System.out.format("%4d%20.2f\n",year,amount);
    }
        }
}