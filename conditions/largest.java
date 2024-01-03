import java.util.Scanner;

public class largest{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        System.out.print("Enter third number: ");
        int c = in.nextInt();

        // int max = a;

        // if(b > max){
        //     max = b;
        // }
        
        // if(c > max){
        //     max = c;
        // }

        int max = 0;
        if (a > b){
            max = a;
        }

        else{
            max = b;
        }

        if(c > max){
            max = c;
        }

        System.out.println("\nThe largest number is" + max + " ");
    }
}