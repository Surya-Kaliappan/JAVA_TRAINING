package day12;

public class ChennaiSilks{
    ChennaiSilks(){
        System.out.println("Welcome to ChennaiSilks");
    }

    ChennaiSilks(int amount, int discount){
        this();
        System.out.println("The Amount after Discount is "+(amount-discount));
    }

    ChennaiSilks(int amount){
        this(amount, 5);
        System.out.println("Visit again..");
    }
}