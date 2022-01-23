import java.util.*;
class Factorial
  {
   public static void main (String args [])
     {
       int i;
        Scanner obj=new Scanner (System.in);
         System.out.println("entet the an integer number");
        int n=obj.nextInt();
         for(i=1;i<n;i++)
           {
           fact=fact*i;
           }
        System.out.println("Factorial is"+fact);
     }
  }
