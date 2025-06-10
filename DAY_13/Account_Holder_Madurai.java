package bank.madurai;

import bank.chennai.SBI;

public class Account_Holder_Madurai{
    public static void main(String[] args){
        SBI s = new SBI();
        s.create_account();
        s.get_loan(200);
        System.out.println(s.empName);
        System.out.println(s.empId);
        System.out.println(SBI.branch_name);
    }
}