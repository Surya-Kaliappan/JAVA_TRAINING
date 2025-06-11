import java.util.Arrays;

public class ArraysDemo{
    public static void main(String[] args){
        String[] s = {"ab","abc","abcdef","abcd","abcde"};
        Comparatordemo comp = new Comparatordemo();
        Arrays.sort(s,comp);

        System.out.println(Arrays.toString(s));

    }
}