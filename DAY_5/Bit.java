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

    public static void main(String[] args){
        DecToBin(15);
    }
}