package day12;

public class Child1 extends Parent1{
    public static void main(String[] args){
        Child1 c = new Child1();
        c.goto_school();
        c.goto_tution();
        // c.pocketmoney = 50;
        c.getpocketmoney();
    }

    // @Override
    // void goto_tution(){
    //     System.out.println("Here it is changed..");  // this won't work because this has been final in the Parent Class
    // }
}