import java.util.*;
class Factor
  {
    public static void main (String args[])
      {
       System.out.println("enter the number:");
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      int i;
      System.out.println("Factor are:");
      for(i=1;i<n;i++)
        {
         if(n%i==0)
           {
            System.out.println("\n"+i);
           }
        }
      }
  }
