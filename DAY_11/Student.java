package school;

public class Student{
    protected String Name;
    String RollNo;
    int Mark;

    Student(String Name, String RollNo){
        this.Name = Name;
        this.RollNo = RollNo;
        System.out.println("Student has been updated as "+this.RollNo);
    }

    void setMark(int mark){
        this.Mark = mark;
        System.out.println("Marks has been updated to Student "+this.RollNo);
    }
}