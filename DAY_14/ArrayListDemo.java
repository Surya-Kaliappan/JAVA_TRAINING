import java.util.*;

public class ArrayListDemo{
    public static void main(String[] args){
        List l1 = new ArrayList<>();

        l1.add(1);
        l1.add(3.4);
        l1.add('a');
        l1.add("JSON");
        l1.add(true);
        System.out.println(l1.toString());

        System.out.println(l1.size());

        System.out.println(l1.get(0));
        System.out.println(l1.remove(2));
        System.out.println(l1.remove("JSON"));
        System.out.println(l1.contains("JSON"));
        System.out.println(l1.lastIndexOf(true));
        System.out.println(l1);
    }
}