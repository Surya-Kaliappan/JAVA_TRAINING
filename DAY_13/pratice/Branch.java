package task5;

public class Branch extends Branch_Plan{

    public void receive_Customers(){
        System.out.println("Recieve Customers from Branch");
    }

    public static void main(String[] args){
        Branch b = new Branch();
        b.check_Accounts(2000);
        int res = b.pay_tax(1010);
        System.out.println("Remaining : "+res);
        b.do_Interview();
    }
}