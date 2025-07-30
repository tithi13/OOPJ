import java. util.*;
public class Evenodd
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner (System.in);
System.out.println("Enter the no. you want to check");
n=s.nextInt();
if(n%2==0)
{
System.out.println("Number is Even Number");
}else{
System.out.print("Number is odd Number");
}
}
}