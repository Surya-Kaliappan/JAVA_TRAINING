package day12;

public class School{
    int mark;
    private int salary;
    static String school_name = "St. Antony's Primary School";

    void counduct_exams(){
        System.out.println("Conduct Exams");
    }

    void publish_results(int mark){
        System.out.println("Marks : "+mark);
    }
}