package day12;

public interface TrafficRules{

    public final int salary = 10000;
    void go_slow();  // by default it is public abstract
    void keep_left();

    default void display(){
        System.out.println("Follow the Rules");
    }
}