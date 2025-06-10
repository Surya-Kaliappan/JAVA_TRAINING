package task5;

public abstract class HeadOffice{

    public int tax = 1000;
    public void check_Accounts(int amount){
        System.out.println("Current Amount : "+amount);
    }

    public int pay_tax(int amount){
        return amount-this.tax;
    }
    public abstract void receive_Customers();
}