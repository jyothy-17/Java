import java util.*;
class amall
  {
   
    public static void main(String args[])
      {
      System.out.println("enter the  numver of element");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      inta[]=newbew int[50];
      int i;
      System.out.println("enter the array element:");
      for(i=0;i<n;i++)
        a[i]=sc.nextInr();
         int small=a[0];
          for (i=0;i<n;i++)
            {
               if(a[i]<small)
                 {
                   small=a[i];
                 }
            }
       System.out.println("snall element is"+small);
      }
  }
