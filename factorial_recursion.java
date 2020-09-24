import java.util.*;
class factorial_recursion
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("The number: ");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println("The factorial is: "+fact);
    }
    public static int factorial(int a)
    {
        if(a==0)
        return 1;
        else
        return(a*factorial(a-1));
    }
}