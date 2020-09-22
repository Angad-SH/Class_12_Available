import java.util.*;
class Sort_Inner
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the elements one by one: ");
        for(int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print("Enter element in ["+i+","+j+"]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n"+ "Entered array");
        print_matrix.main1(a,n,n);
        int b[]=new int [(n-2)*(n-2)];
        int f=0;
        for (int i = 1; i <n-1; i++)
        {
            for(int j=1; j<n-1; j++)
            {
                b[f++]=a[i][j];
            }
        }
        b=sort_matrix.main(b);
        f=0;
        for (int i = 1; i < n-1; i++)
        {
            for(int j=1; j<n-1; j++)
            {
                a[i][j]=b[f++];
            }
        }
        System.out.println("Matrix is: ");
        print_matrix.main1(a,n,n);
    }
}