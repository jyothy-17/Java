import java.util.*;
class Replace
  {
    public static void main(String args [])
      {
       System.out.println("enter the number of elements");
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[50];
      int i;
      System.out.println("enter the array element");
        for (i=0;i<n;i++)
          a[i]=sc.nextInt();
          System.out.println("enter the location in which number to be replaced:");
          int x=sc.nextInt();
          a[x]=y;
           System.out.println("New array is:");
        for(i=0;i<n;i++)
          
         System.out.println(a[i]);
      }
  }
