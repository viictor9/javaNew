public class Condition {
    public static void main(String[] args) {
        if(true){
            System.out.println("Hello world");
        }

        if(false){
            System.out.println("This will not print");
        }

        int a = 69;
        if(a == 69){
            System.out.println("The number will print " + a);
        }


        int count = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        }

        for(count = 1; count != 10; count++)
        System.out.println(count);
    }
}
