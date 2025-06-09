package day12;

public abstract class Parent{

    Parent(){
        System.out.println("This is from parent class");
    }

    public static void main(String[] args){

        // Parent p = new Parent();  // This is not possible because of abstarct.
        // p.repayLoan();
    }

    void work(){
        System.out.println("working");
    }

    void getLoan(){
        System.out.println("got loan");
    }

    abstract void repayLoan();   // Abstract method
}