package day12;

public class Child extends Parent{

    Child(){
        System.out.println("Hi, This is from Child");
    }

    public static void main(String[] args){
        Child c = new Child();
        c.study();
        c.repayLoan();
    }

//  the type Child must implement the inherited abstract method Parent.repayLoan();

    void study(){
        System.out.println("Studying in CSE");
    }

    @Override
    void repayLoan(){               // From parent cass, this is an abstract method from Parent
        System.out.println("i'll pay the loan");
    }

}