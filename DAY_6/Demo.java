import java.util.Scanner;
import java.util.Arrays;

public class Demo{

    static boolean PowofTwo(int n){
        // if(n==0) return false;
        // while(n%2==0){
        //     n/=2;
        // }
        // return n==1;

        return (n!=0 && (n&(n-1))==0);   // 8->1000, 7->0111, 8&7->0000
    }

    static void PrintEven(int[] arr){
        for(int i:arr){
            if(i%2==0 && i!=0){
                System.out.print(i+" ");
            }
        }
    }

    static int SumArray(int[] arr){
        int sum=0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }

    static void ProductTwoArray(int[] arr1, int[] arr2){
        int min = arr1.length > arr2.length ? arr2.length : arr1.length;
        int[] maxarr = arr1.length > arr2.length ? Arrays.copyOfRange(arr1,min,arr1.length) : Arrays.copyOfRange(arr2,min,arr2.length);
        int res[] = new int[maxarr.length+min];
        for(int i=0;i<min;i++){
            res[i] = arr1[i]*arr2[i];
        }
        for(int i=min;i<maxarr.length+min;i++){
            res[i] = maxarr[i-min];
        }
        System.out.println(Arrays.toString(res));
    }

    static void FindMaxAndMin(int[] arr){
        int max=arr[0],min=arr[0], max1=arr[0], min1=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max1 = max;
                max = arr[i];
            } else if(min>arr[i]){
                min1 = min;
                min = arr[i];
            }
        }
        System.out.println("Min: "+min1+", Max: "+max1);
    }

    static void ReverseArray(int[] arr){
        int len = arr.length;
        int start = arr[0], end = len-1, temp;
        for(int i=0;i<len/2-1;i++){
            // System.out.println(i+" "+(len-i));
            temp = arr[i];
            arr[i] = arr[len-i];
            arr[len-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int ConStrToInt(String n){
        int num = 0;
        char ch;
        for(int i=0;i<n.length();i++){
            ch = n.charAt(i);
            num = (num*10)+(ch - '0');
        }
        return num;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // System.out.println(PowofTwo(n));
        // System.out.println(12&13);
        // int n = input.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = input.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(SumArray(arr));

        // int[] a = {1,2,3,4,5,6,7};
        // int[] b = {1,2,3};
        // ReverseArray(a);
        String str = input.next();
        int n = input.nextInt();
        System.out.println(str);
        System.out.println(n);
    }
}