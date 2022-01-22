import java.util.*;
class Transpose
  {
   public static void main(String args[])
     {
       int i,j,r,c;
       Scanner num=new Scanner (System.in);
       System.out.println("enter the number of rows and columns:");
        r=num.nextInt();
        c=num.nextInt();
         int matrix[][]=new int[10][10];
         int matrix[][]=new int[10][10];
         System. out.println("enter the matrix element");
         for(i=0;i<r;i++)
           for(j=0;j<c;j++)
         Tmatrix[i][j]=matrix[i][j];
         for(i=0;i<c;i++)
           {
           for(j=0;j<r;j++)
           System.out.print("\t"+matrix[j][i]);
           System.out.println("\n");
           }
     }
  }
