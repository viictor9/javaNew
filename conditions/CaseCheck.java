import java.util.Scanner;

public class CaseCheck{
    public static void main(String[] args) {
        
        System.out.print("Enter the character: ");
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("The character "+ ch +" is in lowercase ");
        }
        else{
            System.out.println("The character "+ ch +" is in Uppercase ");
        }



    }
}