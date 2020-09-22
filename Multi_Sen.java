import java.util.*;
class Multi_Sen
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s= sc.nextLine();
        s= s.toLowerCase();
        s=(s.trim())+" ";
        int l= s.length();
        int n=0;
        for(int i=0; i<l; i++)
        {
            if(s.charAt(i)==' ')
            {
                n=n+1;
            }
        }
        String a[]= s.split(" ");
        for(int i=0; i<n ; i++)
        {
            for(int j=i+1; j<n; j++)
            { 
                if(a[i].compareTo(a[j])>0) 
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Length is "+n);
        print_matrix.main3(a,n);
    }
}