import java.util.Scanner;

public class StringDemo{

    // static boolean checkPalindrome(String n){
    //     int len = n.length();
    //     for(int i=0;i<len/2;i++){
    //         if(n.charAt(i) != n.charAt(len-i-1)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    static boolean checkPalindrome(StringBuffer n){
        StringBuffer sb = new StringBuffer(n);
        return sb == sb.reverse();
        // if(n<0){
        //     return false;
        // }
        // int sum=0,r,n1=n;
        // while(n>0){
        //     sum = (sum*10)+(n%10);
        //     n/=10;
        // }
        // return n1==sum;
    }

    static String task(String[] strs){
        // s = s.toLowerCase();
        // s = s.replace(" ","");
        // int i=0,j=s.length()-1;
        // while(i<j){
        //     while(!(s.charAt(i)>='a' && s.charAt(i)<='z') && !(s.charAt(i)>='0' && s.charAt(i)<='9') && i<j){
        //         i++;
        //     }
        //     while(!(s.charAt(j)>='a' && s.charAt(j)<='z') && !(s.charAt(j)>='0' && s.charAt(j)<='9') && j>i){
        //         j--;

        //     }
        //     if(s.charAt(i)!=s.charAt(j)){
        //         System.out.println(s.charAt(i)+" "+s.charAt(j));
        //         return false;
        //     }
        //     i++;j--;
        // }
        // return true;
        // StringBuffer sb = new StringBuffer(s);
        // for(int i=sb.length()-1;i>0;i--){
        //     if(sb.charAt(i)%2!=0){
        //         return sb.substring(0,i+1);
        //     }
        // }
        // return "";

        int min = Integer.MAX_VALUE,count,count1=0,len = strs.length,i=0,k=-1;
        for(i=0;i<len;i++){
            if(min>strs[i].length()){
                min = strs[i].length();
                k = i;
            }
        }
        for(i=0;i<min;i++){
            count = 0;
            for(int j=0;j<len;j++){
                if(strs[j].charAt(i) == strs[k].charAt(i)){
                    count++;
                }
            }
            if(count!=len){
                System.out.println("Work");
            }
            count1++;
        }
        if(count1==0){
            return "";
        }
        return strs[k];
    }

    public static void main(String[] args){
        // StringBuffer sb = new StringBuffer("HELLO");
        // StringBuffer sb1 = new StringBuffer("World");
        // System.out.println(sb.hashCode());
        // sb.reverse();
        // sb.append(sb1);
        // sb.deleteCharAt(0);
        // sb.delete(0,4);
        // sb.replace(0,3,"hello");
        // sb.insert(6,'o');
        // System.out.println(sb.hashCode());
        // System.out.println(sb);

        // System.out.println(checkPalindrome(new StringBuffer("ABCBA")));
        // System.out.println(checkPalindrome(new StringBuffer(121)));
        System.out.println(task(new String[]{"fo23","fo","fo2"}));
    }
}