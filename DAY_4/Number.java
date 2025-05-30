import java.util.Scanner;

public class Number{
    static Scanner input = new Scanner(System.in);

    static void CountDigit(){
        int n = input.nextInt();
        // int count ;
        // for(count=0;n>0;n/=10,count++);
        // System.out.println(count);

        System.out.print((int)Math.log10(n)+1);
    }

    static void Divisor(){
        int n = input.nextInt();
        int div = 2;
        while(div<=n/2){
            if(n%div == 0){
                System.out.print(div+" ");
            }
            div++;
        }
    }

    static void CommonDivisor(){
        int n = input.nextInt();
        int m = input.nextInt();
        for(int i=1;i<=100;i++){
            if(i%n==0 && i%m==0){
                System.out.print(i+" ");
            }
        }
    }

    // static void LCM(){
    //     int n = input.nextInt();
    //     int m = input.nextInt();
        
    // }

    public static void main(String[] args){
        CommonDivisor();
    }
}