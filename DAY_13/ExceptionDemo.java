public class ExceptionDemo{
    public static void main(String[] args){
        int a[] = {1,2,3};
        try{
            System.out.println(Component.sum(a));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        } catch (Component e){
            System.out.println("Working");
        }
        System.out.println("Ending");
    }
}