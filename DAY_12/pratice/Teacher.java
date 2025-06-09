package day12;

public class Teacher{
    public static void main(String[] args){
        School teacher = new School();
        System.out.println(School.school_name);
        teacher.counduct_exams();
        teacher.publish_results(75);
        // System.out.println(teacher.salary);
    }
}