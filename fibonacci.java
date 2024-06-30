import java.util.Scanner;
public class fibonacci 
{
    public static int printFibbo(int n)
    {
    	if(n<=1)
    	{
    		return n;
    	}
    	else
    	return printFibbo(n-1)+printFibbo(n-2);
    }
    
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter number:");
    	int n=sc.nextInt();
    	int result=printFibbo(n);
    	//System.out.print("Fibbonacci Series of 1 to "+n+" is "+result);
    	for (int i=1;i<=n;i++)
    	{
    		System.out.print(printFibbo(i)+" ");
    	}
    }
}
