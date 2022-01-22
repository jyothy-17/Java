import java.util.*;
class Trace
  {
   public static void main (String args[])
     {
       int r,c,i,j,sum=0;
        Scanner num=new Scanner(System.in);
        int a[][]=new int[20][20];
         System.out.println("enter the number of rows and columns:");
          r=num.nextInt();
          c=num nextInt();
         System.out.println("enter the element in the matrix");
         for (i=0;i<r;i++)
           for (j=0;j<c;j++)
             {
             a[i][j]=num.nextInt();
             }
          if(r==c)
            {
            for(i=0;i<r;i++)
              for(j=0;j<c;j++)
                sum=sum+a[i][j];
            System.out.println("sum of diagonal elements"+sum);
            else
              System.out.println(" matrix is not a square matric");
            }
     }
          
