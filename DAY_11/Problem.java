
public class Problem{

    static boolean isomorphic(String s, String t){
        if(s.length() != t.length()) return false;

        int hash[] = new int[256];
        boolean ismapped[] = new boolean[256];
        for(int i=0;i<s.length();i++){
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);
            if(hash[s1] == 0){
                if(ismapped[s2]){
                    return false;
                }
                hash[s1] = s2;
                ismapped[s2] = true;
            } else {
                if(hash[s1] != s2){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isomorphic("add","edg"));
    }
}