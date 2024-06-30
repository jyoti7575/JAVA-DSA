import java.util.Scanner;

class findOccurence
{
    public static int first=-1;
    public static int last=-1;
    public static void FindOccurence(String str, int idx, char element)
    {
        if(idx==str.length())
        {
            System.out.print("First time "+element+" occured in "+str+" at index "+first);
            System.out.print("\nLast time "+element+" occured in "+str+" at index "+last);
            return;
        }
        char currentChar=str.charAt(idx);
        if(currentChar==element)
        {
            if(first==-1)
            {
                first=idx;
            }
                last=idx;
        }
        FindOccurence(str,idx+1,element);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String str=sc.next();
        System.out.print("Enter element to find:");
        char element=sc.next().charAt(0);
        FindOccurence(str,0,element);
    }
}