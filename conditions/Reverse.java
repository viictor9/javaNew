import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int count = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            count = count * 10 + rem;
        }
        System.out.println("The reverse of the number is: " + count);
    }
}
