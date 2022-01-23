import java.util.*;
public class Evalute
  {
    public static void main (String args[])
      {
        int n,m;
        Scanners obj=new scanner (System.in);
        System.out.print("enter the number whose factorial to be calculated:");
        m=obj.nextInt();
        System.out.println("enter the number whose number of digits to calculate:");
       n=obj .nextInt();
       Evalute obj1=new Evaluate ();
       obj1.factorial(m);
        obj1.sum of digit(n);
      }
     void factorial(int a)
       {
         int i,fact=1;
          for(i=1;i<=a;i++)
            fact=fact*i;
          System.out.println("factorial="+fact);
         }
          void SumDigits(int a)
            {
              int res=0,rem;
               while(a!=0)
                 {
                 rem =a%10;
                 res=res+rem;
                 a=a/10;
                 }
            System.out.println("No of digit="+res);
            }
  }
             
         
   
