import java.util.*;
class largest
{
  public static void main(String args[])
  {
    System.out.println("enter the number of row:");
    Scanner sc=new Scanner (System.in)
    int row=sc.nextInt();
    System.out.println("enter the number of column:");
    int col=sc.nextInt();
    int a[][]=new int[50][50];
    int i,j;
    System.out.println("enter the matrix element:");
    for(i=0;i<row;i++)
      for(j=0;j<col;j++)
       a[i][j]=sc.nextInt();
       int large=a[0][0];
       for (i=0;i<row;i++)
         for(j=0;j<col;j++)
         {
           if a[i][j]>large
           large=a[i][j];
           }
           System.out.println("larger number is"+large);
           }
         }
