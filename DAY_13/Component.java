public class Component extends RuntimeException{
    public static int sum(int[] a) throws ArrayIndexOutOfBoundsException{

        if(a.length <5){
            throw new Component();
        }
        int sum=0;
        for(int i=0;i<5;i++){
            sum += a[i];
        }
        return sum;
    }
}