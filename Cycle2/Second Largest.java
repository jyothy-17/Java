import java.util.*;
class Second Largest
  {
  public static void main (String args[])
    {
     int n,max;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter total number of element you want:");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the element :");
   for(i=0;i<n;i++)
     {
      a[i]=sc.nextInt();
     }
    for(i=0;i<n;i++)
      {
      for(int j=i+1;j<n;j++)
        {
        if(a[i]<a[j])
         {
          max=a[i];
          a[i]=a[j];
            a[j]=max;
          }
        }
      }
    System.out.println("The second largest elements in the array is:"+a[n_2]);
    }
  }
