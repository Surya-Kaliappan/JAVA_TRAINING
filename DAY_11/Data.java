package school;

import java.util.Scanner;

public class Data{
    static Student[] students = new Student[10];
    static int strength=0;

    static Scanner input = new Scanner(System.in);

    public void updateMark(Student s){
        int mark = input.nextInt();
        s.setMark(mark);
    }

    public static Student[] get(){
        return students;
    }

    public static void main(String[] args){
        for(int i=0;i<5;i++){
            students[i] = new Student("STU"+(i+1),"100"+(i+1));
        }
        System.out.println(students);
        System.out.println("press 0 to quit...");
        int n;
        do{
            n = input.nextInt();
        } while(n!=0);

    }
}