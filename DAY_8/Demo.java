import java.util.Arrays;
import java.util.Scanner;

public class Demo{

    static Scanner input = new Scanner(System.in);

    static void PrintArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void TransposeArray(int[][] arr){
        int n = arr.length,temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void ReverseTwoDArray(int[][] arr){
        TransposeArray(arr);
        System.out.println();
        PrintArray(arr);
        System.out.println();
        int temp,len;
        for(int i=0;i<arr.length;i++){
            len = arr[i].length;
            for(int j=0;j<len/2;j++){
                temp = arr[i][j];
                arr[i][j] = arr[i][len-j-1];
                arr[i][len-j-1] = temp;
            }
        }
    }

    static int[][] InputArray(){
        System.out.print("Enter the row and col value : ");
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the Matrix Values");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int arr[][] = InputArray();
        ReverseTwoDArray(arr);
        PrintArray(arr);
    }
}