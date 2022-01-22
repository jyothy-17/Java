import java.util.*;
class Small
  {
  public static void main (String args[])
    {
      System.out.println("enter the  number if elements");
       Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
         int a[]=new int[50];
         int i;
          System.out.println("enter the array element:*);
          for(i=0;i<n;i++)
             a[i]=sc .nextInt();
             int small=a[0];
             for(i=0;i<n;i++)
              {
                if(a[i]<small)
                  {
                  small=a[i];
                  }
                }
                 
                System.out.println("small element is"+small);
                             
                 }
              }
                             
                             
