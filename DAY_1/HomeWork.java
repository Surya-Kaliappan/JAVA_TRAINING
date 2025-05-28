import java.util.Scanner;

public class HomeWork{

    public static boolean withModulus(int value){
        return value%2==0;
    }

    public static boolean withoutModulus(int value){
        return (value&1)==0 ;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int value = input.nextInt();
        System.out.println("With Modulus Answer : "+(withModulus(value) ? "Even" : "Odd"));
        System.out.println("Without Modulus Answer : "+(withoutModulus(value) ? "Even" : "Odd"));
    }   
}