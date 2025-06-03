import java.util.Scanner;

public class Demo {
    static Scanner input = new Scanner(System.in);

    static int Factorial(int n){
        if(n>1)
        return n*(Factorial(n-1));
        return n;
    }

    static double SquareRoot(int n){
        for(int i=1;i<=n/2;i++)
        if(n/i==i)
        return i;
        return 0;
    }

    static boolean StrongNumber(int n){
        int n1 = n;
        int r, sum=0;
        while(n>0){
            r = n%10;
            sum = sum + Factorial(r);
            n /= 10;
        }
        return n1==sum;
    }

    static double Expontential(double base, double power){
        double j=1;
        base = (power<0) ? 1/base : base;
        power = (power<0) ? -(power) : power;
        // for(int i=0;i<power;i++){
        //     j = j*base;
        // }
        // while(power!=0){
        //     if(power%2==0){
        //         j = j*base;
        //     }
        //     base = base*base;
        // }
        for(int i=0;i<power;i++){
            j = j*base;
        }
        return j;
    }

    static void Fibonocci(int n){
        int f1 = 0, f2 = 1, f3;
        System.out.print("0 1 ");
        for(int i=2;i<n;i++){
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f3+" ");       
        }
    }

    static boolean NeonNumber(int n){
        int sum=0, r;
        int expo = (int)Expontential(n,2);
        while(expo>0){
            r = expo%10;
            sum += r;
            expo /= 10;
        }
        return sum==n;
    }

    static boolean SpyNumber(int n){
        int sum=0, mul=1, r;
        while(n>0){
            r = n%10;
            sum += r;
            mul *= r;
            n /= 10;
        }
        return sum==mul;
    }

    public static void main(String[] args){
        int n = input.nextInt();
        // int m = input.nextInt(); 
        System.out.println(SpyNumber(n));
    }
}