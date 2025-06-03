import java.util.Scanner;

public class Bit{

    static int SetIthBit(int n, int pos){
        int mask = 1<<pos;
        n = n ^ mask;
        return n;
    }

    static int GetIthBit(int n, int pos){
        int mask = 1<<pos;
        n = n & mask;
        return n;
    }

    static int ClearIthBit(int n, int pos){
        int mask = ~(1<<pos);
        n = n&mask;
        return n;
    }

    static int ClearLastIthBit(int n, int pos){
        int mask = -1<<pos;
        n = n & mask;
        return n;
    }

    static int UpdateIthBit(int n, int pos, int value){
        n = ClearIthBit(n, pos);
        int mask = value<<pos;
        n = n | mask;
        return n;
    }

    static int ClearBitInRange(int n,int start, int end){
        int a = (~0)<<end+1;
        int b = (1<<start)-1;
        int mask = a | b;
        n = n & mask;
        return n;
    }

    static int CountOnes(int n){
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

    static void DecToBin(int n){
        int mask = 1<<7;
        for(int i=0;i<8;i++){
            System.out.print((n&mask)!=0 ? "1" : "0");
            mask = mask>>1;
        }
    }

    static int BinToDec(String n){
        int sum = 0, pos, len = n.length();
        char ch;
        // while(n>0){
        //     r = n%10;
        //     sum += (Math.pow(2,pos)*r);
        //     pos++;
        //     n /= 10;
        // }
        // return sum;
        for(int i=0;i<len;i++){
            pos = len-i-1;
            pos = n.charAt(pos)-'0';  // method to convert the char to numeric value
            sum += (Math.pow(2,i)*pos);
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        System.out.println(BinToDec(n));
        // BinToDec(n);
    }
}