import java.util.*;
class search character
  {
  public static void main(String args[])
    {
    inti,flag=0;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the  string length ");
    
     int n=obj.nextInt();
     System.out.println("enter the string");
    char a[]=new char[20];
    for(i=0;i<n;i++)
      a[i]=obj.next().chart[0];
     System.out.print("enter the character to be searcged");
    char ch=ibj.next().charAt[0];
    for(i=0;i<n;i++)
      {
      if(a[i]==ch)
        {
        flag==0;
        break;
        }
      else
        flag=1;
      }
    if(flag==1)
      System.out.println("character us not present inthe string");
    else
      System.out.println("character is present in"+(i+1) position);
    }
  }
