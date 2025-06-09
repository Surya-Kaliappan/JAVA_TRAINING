package day12;

public class TCS_Madurai extends ChennaiSilks{
    TCS_Madurai(int amount){
        super(amount);
        System.out.println("SCOOTY WON IN COUPEN");
    }

    public static void main(String[] args){
        TCS_Madurai shirt = new TCS_Madurai(2000);
    }
}