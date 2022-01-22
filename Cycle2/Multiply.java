import java.util.*;
class multiply
  {
   public static void main (String args[])
    {
     int a[][]=new int[20][20];
     int b[][]=new int[20][20];
     inti,j,r1,c1,r2,c2;
     Scanner num=new Scanner  (System.in);
     System.out.println("enter the no of rows and columns of matrix a:");
     r1=num.nextInt();
     c1=num.nexrInt();
     System.out.println("enter the number of rows and columns of matrix b:");
     r2=num.nextInt();
     c2=num.nextInt();
     if(c1!=r2)
       {
       System.out.println("enter column of matrix should be equally  to matrix b");
       System.out.println("enter the rows and columns of matrix a:");
       r1=num.nextInt();
       c1=num.nextInt();
       System.out.println("enter the number of row and column of matrix b:");
       r2=num.nextInt();
       c2=num.nextInt();
       }
      System.out.println("enter the element of matrix a:");
      for (i=0;i<r;i++)
        for(j=0;j<c;j++)
          a[i][j]=num.nextInt();
        System.out.println("enter the element if matrix b:");
       for(i=0;i<r2;i++)
         for (j=0;j<c2;j++)
         {
           b[i][j[=num.nextInt();
          }
                  
        int result[][]=new.nextInt();
         for(i=0;i<r2;i++)
           for(j=0;j<c2;j++)
            for(i=0;i<r1;i++)
              for(j=0;j<c2;j++)
               for(k=0;j<c1;k++)
                  result=result[i][j]+a([i][k]*b[k][j]);
                  System.out.println("Result matrix is:");
                  for(i=0;i<r1;i++)
                  {
                    for(j=0;j<c2;j++)
                      
                      System.out.println("\t"+result[i][j[);
                        
                      System.out.println("\n");
                        }
                                                          
               }
               }                                           }
