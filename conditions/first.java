import java.util.Scanner;

public class first{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the salary: ");

        int salary = scan.nextInt();

        // int salary = 25400;

        if (salary > 10000){
            salary = salary + 2000;
        }

        else if(salary > 50000){
            salary += 5000;
        }

        else{
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}