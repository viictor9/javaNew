import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        System.out.print("Enter which number to count: ");
        int num = in.nextInt();

        int count = 0;

        while(n > 0){
            int rem = n % 10;
            if(rem == num){
                count++;
            }

            n = n / 10;
        }

        System.out.println(count);
    }
}
