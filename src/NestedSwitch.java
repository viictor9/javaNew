import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter EmpId: ");
        int empId = in.nextInt();
        System.out.print("Enter department: ");
        String department = in.next();


        switch (empId) {
            case 1:
            System.out.println("Victor Mayekar");
                break;
            case 2:
            System.out.println("Abhishek Diwate");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                
                    case "Management":
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("No department alloted");
                        break;
                }
                break;
            default:
            System.out.println("Enter correct empId");
                break;
        }
        in.close();

    }
}
