import java .util.*;
class Armstrong
  {
   public static void main (String args[])
     {
      System.out.println("enter a three digit number:");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int rem,num,sum=0,temp=n;
     while(n >0)
       {
        rem=n%10;
       num=rem*rem*rem;
       sum=sum+num;
       n=n/10;
       }
     if(sum==temp)
       {
       System.out.println("Number is armstrong");
       }
     }
  }
