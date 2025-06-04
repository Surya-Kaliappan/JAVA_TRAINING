import java.util.Scanner;
import java.util.Arrays;

public class ArrayProblem{

    static void ReverseArray(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void RotateArrayToLeft(int[] arr, int n){
        int len = arr.length;
        n = n%len;
        ReverseArray(arr,0,n-1);
        ReverseArray(arr,n,len-1);
        ReverseArray(arr,0,len-1);

        // int[] B = new int[len];
        // for(int i=0;i<len;i++){
        //     B[i] = arr[(i+n)%len];
        // }
        // return B;
    }

    static void RotateArrayToRight(int[] arr,int n){
        int len = arr.length;
        n = n%len;
        ReverseArray(arr,0,len-1);
        ReverseArray(arr,0,n-1);
        ReverseArray(arr,n,len-1);
    }

    static boolean CheckArraySort(int[] arr){
        boolean check = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                check = false;
            }
        }
        if(check) return check;
        check = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                check = false;
            }
        }
        return check;
    }

    static boolean checkTask(int[] a){
        // return arr[0]<arr[arr.length-1];
        int n = a.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(a[i]>a[(i+1)%n]){
                cnt++;
            }
        }
        System.out.println(cnt);
        return cnt<=1;
    }

    static void KeepZeroAtLast(int[] arr){
        int i = 0,t;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void FindFrequencyOfArray(int[] arr){
        int len = arr.length,count;
        // boolean[] check = new boolean[len];
        // for(int i=0;i<len;i++){
        //     if(!check[i]){
        //         count = 0;
        //         for(int j=i;j<len;j++){
        //             if(arr[i]==arr[j]){
        //             count++;
        //             check[j] = true;
        //             }
        //         }
        //         System.out.println(arr[i]+" -> "+count);
        //     }
        // }

        Arrays.sort(arr);
        int max=1,min=1,high=arr[len-1]+1;
        int[] res = new int[high];
        for(int i=0;i<len;i++){
            res[arr[i]]++;
        }
        for(int i=0;i<high;i++){
            if(res[i]<min && res[i]>0){
                min = res[i];
            } else if(res[i]>max){
                max = res[i];
            }
            System.out.println(i+" -> "+res[i]);
        }
        System.out.println(max+" "+min);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {2,3,4,1,6};
        // System.out.println(checkTask(arr));
        // RotateArrayToRight(arr,4);
        // System.out.println(checkTask(arr));
        // FindFrequencyOfArray(arr);
        System.out.println(checkTask(arr));
    }
}