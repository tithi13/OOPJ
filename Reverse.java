import java.util.*;
public class Reverse
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter n");
n=s.nextInt();
for(int i=0;i<=n;i++){
System.out.println(i);
}
System.out.println("Reversed String");
for(int i=n;i>=0;i--){
System.out.println(i);
}
}
}

