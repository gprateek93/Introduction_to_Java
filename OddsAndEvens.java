import java.util.Scanner;
import java.util.Random;

public class OddsAndEvens{
    public static void main(String[] args){
        play();
    }
    public static void play(){
        System.out.println("Let's play a game called \"Odds and Evens\"");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", what do you want to choose? O(Odd) or E(Even) ");
        String choice = input.next();
        if(choice.equals("O"))
            System.out.println(name + " has picked up Odds! The computer will be Evens.");
        else
            System.out.println(name + " has picked up Evens! The computer will be Odds.");
        System.out.println("------------------------------------------------------");
        System.out.print("How many \"fingers\" do you put out? ");
        int user = input.nextInt();
        Random rand = new Random();
        int com = rand.nextInt(6);
        System.out.println("The computer plays " + com + " \"fingers\" ");
        System.out.println("------------------------------------------------------");
        int sum = user + com;
        System.out.println(user + " + " + com + " = " + sum);
        if(sum%2 == 0){
            System.out.println(sum + " is ....even");
            if(choice.equals("E"))
                System.out.println("That means " + name + " wins. :) ");
            else
                System.out.println("That means " + name + " loses. :(");
        }
        else{    
            System.out.println(sum + " is ....odd");
            if(choice.equals("E"))
                System.out.println("That means " + name + " loses. :( ");
            else
                System.out.println("That means " + name + " wins. :)");
        }
        System.out.println("------------------------------------------------------");
        
    }
}