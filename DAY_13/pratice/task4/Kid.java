package task4;

public class Kid{
    String name = "Suman";

    public void work(){
        System.out.println(name);
        System.out.println("Woring...");
    }

    public void study(){
        work();
        System.out.println("Studying...");
    }

    public static void main(String[] args){
        Kid kid = new Kid();
        kid.study();
    }
}