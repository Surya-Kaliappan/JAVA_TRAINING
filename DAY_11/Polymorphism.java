import java.util.Scanner;

public class Polymorphism{

    static Scanner input = new Scanner(System.in);

    static{
        System.out.println("This is from Static");
    }

    {
        System.out.println("This is from Non-Static");
    }

    public static void main(String[] args){

       System.out.println("Working");
    }
}