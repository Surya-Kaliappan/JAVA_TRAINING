public class Theater{

    public int bookTicket(int ticket){
        int ticket_price = 120;
        if(ticket<ticket_price) return -1;
        int balance = ticket-ticket_price;
        return balance;
    }

    public static void main(String[] args){
        Theater raja = new Theater();
        int balance = raja.bookTicket(110);
        System.out.println("Balance : "+balance);
    }
}