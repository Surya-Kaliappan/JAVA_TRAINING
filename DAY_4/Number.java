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

    static void SumofDigit(){
        int n = input.nextInt();
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
    }

    static void ReverseNumber(){
        int n = input.nextInt();
        int r, k=0;
        while(n>0){
            r = n%10;
            n = n/10;
            k = k*10+r;
        }
        System.out.println(k);
    }

    // static void LCM(){
    //     int n = input.nextInt();
    //     int m = input.nextInt();
        
    // }

    static void ArmstrongNumber(){
        int n = input.nextInt();
        int count =(int)Math.log10(n)+1;
        double res = 0;
        int n1 = n;
        while(n>0){
            int r = n%10;
            res = res + (Math.pow(r,count));
            n /= 10;
        }
        if(n1 == res){
            System.out.println("True");
        } else { 
            System.out.println("False");
        }
    }

    static void PrimeNumber(int n){
        // int n = input.nextInt();
        int j=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                j = 0;
                break;
            }
        }
        // System.out.println(j==0 ? "It is not a Prime Number.." : "It is a Prime Number..");
        if(j!=0){
            System.out.print(n+" ");
        }
    }

    static void LeepYear(){
        int n = input.nextInt();
        if(n%4==0 && n%100!=0 || n%400==0){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

    public static void main(String[] args){
        for(int i=2;i<10;i++){
            PrimeNumber(i);
        }
    }
}