// to find the greatest of two number 
// to print the tables as format of 1X2=2
// to swap the variable with and without the help of third variable

import java.util.Scanner;

class Swap{
    void withThird(int x, int y){
        int z = x;
        x = y;
        y = z;
        System.out.println("With Third Variable, x : "+x+", y : "+y);
    }

    void withoutThird(int x, int y){
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("Without Third Variable, x : "+x+", y : "+y);
    }
    
    void withXOR(int x, int y){
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("With XOR, x : "+x+", y : "+y);
    }
}

class FindLargest{
    FindLargest(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the list of numbers : ");
        String lines = input.nextLine();
        String[] numbers = lines.split(" ");
        int largest = 0, current;
        for(String number : numbers){
            current = Integer.parseInt(number);
            if(largest < current){
                largest = current;
            }
        }
        System.out.println("Largest Value among the numbers is "+largest);
    }
}

public class Demo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Swap sw = new Swap();
        System.out.print("Enter x and y value : ");
        int x = input.nextInt();
        int y = input.nextInt();
        // System.out.println("Value of x : "+x+" & y : "+y+"\n");
        sw.withThird(x,y);
        sw.withoutThird(x,y);
        sw.withXOR(x,y);
        FindLargest fl = new FindLargest();
        System.out.printf("%d",x)
    }
}