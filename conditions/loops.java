import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //Q print numbers from 1-5

        // for loops syntax
        // for (intialization, condition, increment/decrement){
        //     body
        // }

        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        for(int num = 1; num <= n; num++){
            System.out.println(num);
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int l = scan.nextInt();
        while(l <= 25){
            System.out.println(l);
            l++;
        }
        in.close();
        scan.close();

    }

}
