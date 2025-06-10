package task3;

public class Mother extends Grandma{
    String name = "Stella";
    public void work(){
        System.out.println(super.name);
        System.out.println("Work from Mother");
    }

    public static void main(String[] args){
        new Mother().work();
    }
}