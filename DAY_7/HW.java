import java.util.*;

public class HW{

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
    }
}