// import java.util.Arrays;
// import java.util.Comparator;

// public class CollectionDemo{
//     public static void main(String[] args){
//         int a[] = {1,2,3};
//         int b[] = {1,2,3};

//         System.out.println(a.equals(b));
//         System.out.println(a==b);

//         Integer[] arr1 = {5,2,1,3,4};

//         Arrays.sort(arr1);

//         Comparator comp = new Comparator(){
//             @Override
//             public int compare(Object o1, Object o2){
//                 Integer a = (Integer)o1;
//                 Integer b = (Integer)o2;
//                 return b.compareTo(a);
//             }
//         };

//         Arrays.sort(arr1, comp);

//         System.out.println(Arrays.toString(arr1));


//     }
// }



import java.util.Collections;

public class Collections{
    public static void main(String[] args){
        int a[] = {5,4,3,2,1};
        Collections.sort(a);
        System.out.println(a.toString());
    }
}