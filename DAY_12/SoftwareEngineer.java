package day12;

public class SoftwareEngineer extends Parent3 implements TrafficRules, OfficeRules{

    SoftwareEngineer(){
        System.out.println("This is from Software Engineer");
        work();
    }

    public static void main(String[] args){
        SoftwareEngineer s = new SoftwareEngineer();
        s.go_slow();
        System.out.println(salary);
    }

    public static void work(){
        System.out.println("Working in ZOHO project");
    }

    @Override
    public void no_of_leaves(){
        System.out.println("Taking leave");
    }
    @Override
    public void wear_id_card(){
        System.out.println("Wear id Card");
    }
    @Override
    public void work_8_hours(){
        System.out.println("Work 8 hours");
    }
    @Override
    public void wear_formals(){
        System.out.println("Wear Formals");
    }

    @Override
    public void go_slow(){
        System.out.println("Go Slow");
    }

    @Override
    public void keep_left(){
        System.out.println("Keep Left");
    }

    public void chatting(){
        System.out.println("Chatting with others");
    }

    public void break_time(){
        System.out.println("Break Time");
    }
}