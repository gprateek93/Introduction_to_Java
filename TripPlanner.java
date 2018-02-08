import java.util.Scanner;
public class TripPlanner{
    public static void main(String[] args){
        greet();
        budget();
        time_diff();
        country_area();
    }
    public static void greet(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Vacation Planner");
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ". Where are you travelling to?");
        String city = input.nextLine();
        System.out.println("Great! " + city + " sounds like a great trip.\n");
    }
    public static void budget(){
        Scanner input = new Scanner(System.in);
        System .out.print("How many days are going to spend travelling?");
        int days = input.nextInt();
        System.out.print("How much money in INR are you planning to spend?");
        int money = input.nextInt();
        System.out.print("What is the three letter currency code for your travel destination?");
        String code = input.next();
        System.out.print("How many " + code + " are there in 1 INR?");
        float rate = input.nextFloat();
        int daysH = days*24;
        int daysM = daysH*60;
        float moneyC = (float)(money)*rate;
        float moneyDay = (float)(money)/days;
        float moneyCDay = moneyC/days;
        System.out.println("If you are travelling for " + days + " days which is same as " + daysH + " hours or " + daysM + " minutes");
        System.out.println("If you are going to spend " + money + " INR that means per day you can spend " + moneyDay + " INR");
        System.out.println("Your  budget in " + code + " is " + moneyC + " ,which per day is " + moneyCDay + " " + code + "\n");
    }
    public static void time_diff(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and travel destination?");
        int hours = input.nextInt();
        int midnight = hours%24;
        int noon = (12 + hours)%24;
        System.out.println("That means when it is midnight at home, it will be " + midnight + ":00 at your travel destination and when it is noon at home it will be " + noon + ":00.\n");
    }
    public static void country_area(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the area of your destination country in km^2?");
        int distance = input.nextInt();
        double distanceM = 0.386 * distance;
        System.out.println("In miles^2, that is "+ distanceM);
    }
}