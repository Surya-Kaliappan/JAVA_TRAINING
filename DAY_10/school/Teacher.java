package school;

import java.util.Scanner;
import school.Student;

public class Teacher{
    static Scanner input = new Scanner(System.in);

    // private static void entryMark(Student s){
    //     System.out.println("\nEnter the Mark : ");
    //     int mark = input.nextInt();
    //     s.mark = mark;
    //     System.out.println("Mark has been updated to Student "+s.Name+"("+s.RollNo+")");
    // }

    public static void main(String[] args){
        System.out.println("Teacher View");
        Student s = new Student();

        System.out.println(s.name);
        System.out.println(s.RollNo);
        // System.out.println(s.native);

        // while(true){
        //     System.out.print("\nRegister Student Name : ");
        //     String sName = input.nextLine();
        //     System.out.print("Register Number of Student : ");
        //     String sRollNo = input.next();
        //     Student s1 = new Student(sName,sRollNo);
        //     entryMark(s1);
        // }
    }
}