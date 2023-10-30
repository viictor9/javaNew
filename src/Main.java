import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.print("Enter your name: ");

        Scanner input = new Scanner(System.in);

        String read = input.nextLine();
        System.out.println("Your name is " + read);


    }
}