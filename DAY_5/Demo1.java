public class Demo1
{
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},
                   {4,5,6}
                 };
                //  (2x3)
         int b[][]={
                {1,2},
                {3,4},
                {5,6}
               }; 
               //(2x2)

            int rowA=a.length;//2
            int colA=a[0].length;//3

            int colB=b[0].length;//2
            System.out.println(rowA+" "+colB);
               int c[][]=new int[rowA][colB];
               for(int i=0;i<rowA;i++)
               {
                  for(int j=0;j<colA;j++)
                  {
                    for(int k=0;k<colB;k++)
                    {
                        c[i][j]+=a[i][j]*b[i][j];
                    }
                  }
               }
    }
}