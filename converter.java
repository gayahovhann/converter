import java.util.Scanner;

public class converter {
    public static void main(String[] args) {

       int b;
        Scanner input = new Scanner(System.in);

        System.out.println("Hi, what currency do you want to convert to AMD?  ");
       
        System.out.println("1) Dollar   " + "2) Euro    " + "3) Rub ");
        System.out.println("please choose and write the number ");
        System.out.print("number = ");
        int a = input.nextInt();
        if (a > 3) {
            System.out.println("Please, choose 1, 2 or 3, Thank you. ");
        }

        System.out.print("please enter AMOUNT  = ");
        int amount = input.nextInt();
        if (a == 1) {
            b = a * 487;
            System.out.println("Your money = " + b + "AMD");
        } else { 
            if (a == 2) {
                b = a * 596;
                System.out.println("Your money = " + b + " AMD");
            } else {
                if(a == 3) {
                    b = a * 7;
                    System.out.println("Your money = " + b + "AMD");
                }
            } 
        } 
        
        
        

        
    }
}