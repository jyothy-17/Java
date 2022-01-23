import java.util.*;
class Palindrome
  {
   public static void main (String args[])
     {
     System.out.println("enter the three digit number:");
     Scanner sc=new Scanner (System.in);
     int n=sc.nextInt();
     int rem,n,sum=0,temp=n;
     
    while(n>0)
      {
      rem=n%10;
      sum=(sum*10)+rem;
      n=n/10;
      }
     if(temp==sum)
       {
       System.out.println("it is a palindrome:");
       }
     else
       {
       System.out.println("it is a not palindrome:");
       }
     }
  }
