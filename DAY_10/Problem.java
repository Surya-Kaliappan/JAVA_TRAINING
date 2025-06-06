public class Problem{

    public static boolean task(String s,String goal){
        int len1 = s.length();
        int len2 = goal.length();
        if(len1!=len2){
            return false;
        }
        String s1 = s+s;
        return s.contains(goal);
    }

    static int countcommas(int n){
        if(n<1000){
            return 0;
        }
        // int count=0;
        // for(int i=1000;i<=n;i++){
        //     count++;
        // }
        // return count;
        return n-999;
    }

    public static void main(String[] args){
        String s = "defdefdefabcabc";
        String goal = "defdefabcabcdef";
        // System.out.println(task(s,goal));
        System.out.println(countcommas(1010));
    }
}