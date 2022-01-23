import java.util.*;
class Reversed string
{
  inti;
  Scanner obj=new Scanner (System.in);
  System.out.print("enter the string length:");
  int n=obj.nextInt();
  System.out.println("enter the string :");
  char a[]=new char[20];
  for(i=0;i<n;i++)
    {
    a[i]=obj.nextInt().charAt(0);
    }
  String obj1=new String();
  obj1.frequency(a,n);
  obj1.reverse(a,n);
  }
}
class String
{
void frequency (char a[],int n)
{
int i,c=o;
Scanner obj2=new Scanner (System.in);
System.out.print("entet the character whose frequency is to be found:");
char y=obj2.next().charAt(0);
for(i=0;i<n;i++)
if(a[i]==y)
c=c+1;
System.out.println("frequency of entered character:");
}
 void reverse(char a[],int n)
 {
  char[b]=new char[20];
  int i,m=n-1;
  for(i=0;i<n;i++)
  {
    b[i]=a[m];
    }
    System.out.println(" Reversed string");
    for(i=0;i<n;i++)
    {
    System.out.print("\t"+b[i]);
    }
    }
    }

    
