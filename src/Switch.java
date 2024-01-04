import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

        switch(fruit){
            case "Mango":
            System.out.println("Mango");
            break;

            case "Apple":
            System.out.println("Apple");
            break;

            default:
            System.out.println("Enter a valid fruit");
            break;
        }

    }
}
