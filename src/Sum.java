import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Sum program");

        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();

        int answer = first + second;

        System.out.println("Your answer is: " + answer);
        scan.close();
    }
}

