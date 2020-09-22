import java.util.*;
class Matrix
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Matrix size: ");
        System.out.print("m : ");
        int m=sc.nextInt();
        System.out.print("n : ");
        int n=sc.nextInt();
        System.out.println();
        int a[][]=new int[m][n];
        int b[]=new int[m*n];
        int f=0;
        int max=0; int min=0;
        System.out.println("Add elements one by one: ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j]=sc.nextInt();
                b[f]=a[i][j];
                f++;
                if(a[i][j]>max)
                    max=a[i][j];
                if(a[i][j]<min)
                    min=a[i][j];
            }
        }
        b=sort_matrix.main(b);
        f=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j]=b[f];
                f++;
            }
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);
        System.out.println("The array(sorted) is: ");
        print_matrix.main1(a,m,n);
    }
}