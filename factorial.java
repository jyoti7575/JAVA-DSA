import java.util.Scanner;

class factorial
{
public static int printFact(int n)
{
if(n==0)
{
return 1;
}
return n*printFact(n-1);
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter number:");
int n=sc.nextInt();
int result=printFact(n);
System.out.print("Factorial of "+n+" is "+result);
}
}