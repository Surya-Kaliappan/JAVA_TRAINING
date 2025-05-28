public class Pattern{

    static void A(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(col==0 && row!=0 || row==3 || col==4 && row!=0 || row==0 && col!=0 && col!=4){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void B(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(col==0 || row==0 && col!=4 || row==3 && col!=4 || row==6 && col!=4 || col==4 && row!=0 && row!=6){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void C(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(row==0 || row==6 || col==0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void D(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<6;col++){
                if(row==0 && col!=5 || row==6 && col!=5 || col==1 || col==5 && row!=0 && row!=6){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void E(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(row==0 || row==3 || row==6 || col==0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void F(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(row==0 || row==3 || col==0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void G(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(row==0 || row==6 || col==0 || col==4 && row!=1 && row!=2 || row==3 && col!=1 && col!=2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void H(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(col==0 || col==4 || row==3){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void I(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(row==0 || row==6 || col==2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void J(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(row==0 || col==2 || row==6 && col==1 || row==5 && col==0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void K(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(col==0 || (row+col)==4 || (row-col)==2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void M(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<7;col++){
                if(col==0 || col==6 || (col==1 || col==5) && row==1 || (col==2 || col==4) && row==2 || col==3 && row==3){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void N(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<7;col++){
                if(col==0 || col==6 || col==row){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    static void Q(){
        System.out.println();
        for(int row=0;row<6;row++){
            for(int col=0;col<6;col++){
                if((row==0 || row==4) && col!=5 || (col==0 || col==4) && row!=5 || (row==col) && col>1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void V(){
        System.out.println();
        for(int row=0;row<5;row++){
            for(int col=0;col<9;col++){
                if(row==col || row+col==8){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void W(){
        System.out.println();
        for(int row=0;row<4;row++){
            for(int col=0;col<7;col++){
                if(col==0 || col==6 || col+row==3 || col-row==3){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void X(){
        System.out.println();
        for(int row=0;row<7;row++){
            for(int col=0;col<7;col++){
                if(row==col || row+col==6){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void Y(){
        System.out.println();
        for(int row=0;row<6;row++){
            for(int col=0;col<7;col++){
                if((col==row && col<3) || (col+row==6) && col>3 || col==3 && row>2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Y();
    }
}