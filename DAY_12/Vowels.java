public class Vowels{
    static String findVowels(String s){
        StringBuilder sb = new StringBuilder(s);
        String vowels = "aeiouAEIOU", check1, check2;
        int i=0,j=sb.length()-1;
        while(i<j){
            check1 = String.valueOf(sb.charAt(i));
            check2 = String.valueOf(sb.charAt(j));
            if(vowels.contains(check1) && vowels.contains(check2)){
                char temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,temp);
                i++;
                j--;
            } else {
                if(!vowels.contains(check1)){
                    i++;
                }
                if(!vowels.contains(check2)){
                    j--;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(findVowels("Zoho Corporation"));
    }
}