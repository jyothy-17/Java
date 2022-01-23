import java.util.*;
class Natural number
  {
    public static void main (String args[])
      {
      int i;
      Scanner obj=new Scanner (System.in);
      System.out.println("enter number of the natural number neeed");
      int n=obj.nextInt();
      for(i=1;i<n;i++)
        {
        sum=sum+i;
        }
      System.out.println("The sum of natural number is:"+sum);
      }
  }
