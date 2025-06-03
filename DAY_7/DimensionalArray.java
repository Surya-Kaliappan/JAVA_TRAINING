import java.util.Scanner;

public class DimensionalArray{

    static Scanner input = new Scanner(System.in);

    static void PrintArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
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

    static void jaggedArray(){
        int c[][] = new int[3][];
        c[0] = new int[3];
        c[1] = new int[2];
        c[2] = new int[1];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j] = input.nextInt();
            }
        }

        PrintArray(c);
    }

    static void TransposeArray(int[][] arr){
        int temp;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[i].length-1;j++){
                temp = 0;
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        PrintArray(arr);
    }

    static int[][] RotateImage(int[][] arr){
        int n = arr.length;  // 3
        int m = arr[0].length; // 4
        int a[][] = new int[m][n];            // 1 2 3 4                  9 5 1
        for(int i=0;i<m;i++){                 // 5 6 7 8                  10 6 2
            for(int j=0;j<n;j++){             // 9 10 11 12               11 7 3
//                                                                        12 8 4
                a[i][j] = arr[n-j-1][i];
            }
        }
        return a;
    }


    public static void main(String[] args){
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] b = RotateImage(a);
        PrintArray(b);
    }
}