import java.util.*;
class Sum array
  {
    public static void main(String args[])
      {
        System.out.println("enter the numbers of element in array:");
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      inta[]=new int[50];
      int sum=0,i;
      System.out.println("enter the array element:");
      for(i=0;i<n;i++)
        {
         a[i]=sc.nextInt();
        }
      for (i=0;i<n;i++)
        {
        sum=sum+a[i];
        }
      System. out.println("sum of array element is:"+sum);
      }
  }
