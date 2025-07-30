import java.util.*;
public class Swap1
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number A");
a=sc.nextInt();
System.out.println("Enter number B");
b=sc.nextInt();
a = a + b;
b = a - b;
a = a - b;
System.out.println("A is:"+a);
System.out.println("B is:"+b);

}
}