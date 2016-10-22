import java.io.*;
import java.util.*;
class natural1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0,n,wholesum=0;
System.out.println("Enter end of natural number:");
n=sc.nextInt();
if(n<=0)
{
System.out.println("Invalid data");
}
for(int i=1;i<=n;i++)
{
sum=sum+i;
}
wholesum=wholesum+sum;
System.out.println("Sum of N is:"+wholesum);
}
}
