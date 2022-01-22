import java .util.*;
class Addition
  {
   public static void main(String args[])
     { 
     int a[][]=new int[20][20];
     int b[][]=new int[20][20];
     int i,j;
     Scanner num=new Scanner(System.in);
     System.out.println("enter the number of rows and columns");
     int r=num.nextInt();
     int c=num.nextInt();
     System.out.println("enter the element of matric:");
     for(i=0;i<r:i++)
       for(j=0;j<c;j++)
         {
           a[i][j]=num.nextInt();
         }
        for(i=0;i<r;i++)
          for(j=0;j<c;j++)
            b[i][j]=num.nextInt();
            int sum[][]=new int[][];
            for (i=0;i<r;i++)
              for (j=0;j<n;j++)
                {
                  sum[i][j]=a[i][j]+b[i][j];
                }
               System.out.println("Resultant matrics:");
     
               for(i=0;i<r;i++)
                 {
                  System.out.println("\n");
                 for(j=0;j<c;j++)
                   System.out.print(""+sum[i][j]);
                }
     
             }
  
           }
}
                   
                   
                   
                   
