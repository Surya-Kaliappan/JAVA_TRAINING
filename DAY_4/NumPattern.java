import java.util.Scanner;

public class NumPattern {
    static Scanner input = new Scanner(System.in);

    static void Triangle(){
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n-i+" ");
            }
            System.out.println();
        }
    }
    
    static void MirrowTriangle(){
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }

    static void InvertTriangle(){
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void MirrorInvertTriangle(){
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i-1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void MirrorInvertTriangle1(){
        int n = input.nextInt();
        for(int i=n;i>0;i--){
            for(int j=5;j>i;j--){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void Triangle1(){
        int n = input.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void Triangle2(){
        int n = input.nextInt();
        int m = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }

    static void Triangle3(){
        int n = input.nextInt();
        int m = 0;
        for(int i=1;i<=n;i++){
            for(int j=m+i;j>m;j--){
                System.out.print(j+" ");
            }
            m += i;
            System.out.println();
        }
    }

    static void Triangle4(){
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }

    static void Triangle5(){
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            int j=1;
            for(;j<=i+1;j++){
                System.out.print(j+" ");
            }
            for(j=j-2;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    static void Triangle6(){
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(j=i+1;j>0;j--){
                System.out.print(j+" ");
            }
            for(j=2;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void Triangle7(){
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(((i+j)%2==0 ? 0 : 1)+" ");
            }
            System.out.println();
        }
    }

    static void Triangle8(){
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<i+n;j++){
                System.out.print((j%n+1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Triangle3();
    }
}