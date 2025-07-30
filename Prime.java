import java.util.*;
public class Prime
{
public static void main(String args[])
{
int num;
Scanner s=new Scanner (System.in);
System.out.println("Enter number");
num=s.nextInt();
for(int i=2;i<=num;i++){
if(num%i==0){
System.out.println("Number is not prime");
break;
}else{
System.out.println("Number is Prime");
break;
}
}
}
}
