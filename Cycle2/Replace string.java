import javs.util.*;
class Replace string
  {
  public static void main (String args[])
    {
      int i;
     Scanner obj=new Scanner (System.in);
    System.out.println("enter the string");
    int n=obj.nextInt();
    System.out.println("enter the string element:");
    char a[]=new char[20];
    for(i=0;i<n;i++)
      a[i]=obj.nextInt().charAt[0];
    System.out.println("enter the position of the character to be replaced:");
    int x=obj.nextInt();
    System.out.println("enter the new characters to be placed:");
    char ch=obj.next().charAt[0];
    for(i=1;i<=n;i++)
      a[x]=ch;
    System .out.println("replaced string is:");
    for(i=0;i<n;i++)
      System.out.println (a[i]);
    }
  }
