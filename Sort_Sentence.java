import java.util.*;
class Sort_Sentence
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sen= sc.nextLine();
        sen= sen.toLowerCase();
        sen=(sen.trim())+" ";
        int l= sen.length();
        int n=0;
        for(int i=0; i<l; i++)
        {
            if(sen.charAt(i)==' ')
            {
                n=n+1;
            }
        }
        String a[]= sen.split(" ");
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
        System.out.println("Sorted sentence is: ");
        print_matrix.main3(a,n);
    }
}