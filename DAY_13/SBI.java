package bank.chennai;

public class SBI{

    public String empName, empId;
    public static String branch_name = "chennai";

    public void get_loan(int amount){
        System.out.println("Loan amount : "+amount);
    }

    public void create_account(){
        System.out.println("Creating Account");
    }
}