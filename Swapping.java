import java.util.*;
public class Swapping
{
public static void main(String args[])
{
int temp,a,b;
Scanner sc=new Scanner (System.in);
System.out.println("Enter a 1st number");
a=sc.nextInt();
System.out.println("Enter 2nd number");
b=sc.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("A is:"+a);
System.out.println("B is:"+b);
}
}
