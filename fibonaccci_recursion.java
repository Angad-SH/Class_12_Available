import java.util.*;
class fibonaccci_recursion
{
    static int n1=0,n2=1,n3=0;
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of terms: ");
        int c=sc.nextInt();
        System.out.print(n1+" "+n2);
        printFibo(c-2);
    }
    public static void printFibo(int count)
    {
        if(count>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printFibo(count-1);
        }
    }
}