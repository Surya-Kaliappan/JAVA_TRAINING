import java.util.Scanner;

public class Demo{
    static Scanner input = new Scanner(System.in);

    static void RightTriangle(){
        int n = input.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void InvertTriangle(){
        int n = input.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void LeftTriangle(){
        int n = input.nextInt();
        // for(int row=0;row<n;row++){
        //     for(int col=0;col<=row;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int row=0;row<n-1;row++){
        //     for(int col=0;col<n-row-1;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for(int row=0;row<n*2;row++){
            int totalCol = (row>n) ? 2*n-row : row;
            for(int col=0;col<totalCol;col++){
                System.out.print("* ");
            }
            System.out.println("-");
        }
        System.out.println("-");
    }

    static void InvertRightTriangle(){
        int n = input.nextInt();
        for(int row=0;row<n;row++){
            // for(int col=0;col<n-row-1;col++){
            //     System.out.print("  ");
            // }
            // for(int col=0;col<=row;col++){
            //     System.out.print("* ");
            // }
            // System.out.println();
            for(int col=0;col<n;col++){
                if(col < n-row-1){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void InvertInvert(){
        int n = input.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<row;col++){
                System.out.print("  ");
            }
            for(int col=0;col<n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pramid(){
        int n = input.nextInt();
        for(int row=0;row<n;row++){
            // for(int col=0;col<n-row-1;col++){
            //     System.out.print("  ");
            // }
            // for(int col=0;col<=row;col++){
            //     System.out.print("* ");
            // }
            // for(int col=1;col<=row;col++){
            //     System.out.print("* ");
            // }
            // System.out.println();
            for(int col=0;col<n-row-1;col++){
                System.out.print("  ");
            }
            for(int col=0;col<(row*2)+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void InvertPramid(){
        int n = input.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<row;col++){
                System.out.print("  ");
            }
            for(int col=0;col<(n-row)*2-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void OldTimeClock(){
        int n = input.nextInt();
        for(int row=0;row<n*2-1;row++){
            int space = (row<n) ? row : (n*2)-row-2 ;
            for(int col=0;col<space;col++){
                System.out.print(" ");
            }
            int star = (row<n-1) ? n-row : (row-n)+2;
            for(int col=0;col<star;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void OutlinePramid(){
        int n = input.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<n-row-1;col++){
                System.out.print(" ");
            }
            for(int col=0;col<(row*2)+1;col++){
                if(col==0 || col==row*2 || row==n-(n/3)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void Butterfly(){
        int n = input.nextInt();
        for(int row=0;row<(n*2);row++){
            int star = row>n ? 2*n-row : row;
            for(int col=0;col<star;col++){
                System.out.print("* ");
            }
            int space = row>n ? row-n : n-row;
            for(int col=0;col<space*2;col++){
                System.out.print("  ");
            }
            for(int col=0;col<star;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Diamond(){
        int n = input.nextInt();
        for(int row=0;row<n*2;row++){
            int space = row>n ? row-n : n-row;
            for(int col=0;col<space;col++){
                System.out.print("  ");
            }
            int star = row>n ? (n*2-row)*2-1 : row*2-1;
            for(int col=0;col<star;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void TriangleWithAlpha(){
        int n = input.nextInt();
        for(int row=n;row>0;row--){
            for(int col=0;col<row;col++){
                System.out.print((char)(65+row-col-1)+" ");
            }
            System.out.println();
        }
    } 

    static void CasewithAplha(){
        int n = input.nextInt();
        int m=0,val;
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                val = (row+col)%2==0 ? 32 : 0;
                System.out.print((char)(65+m+val)+" ");
                m++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        TriangleWithAlpha();
    }
}