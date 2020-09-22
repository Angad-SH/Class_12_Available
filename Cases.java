import java.util.Scanner;
class Cases
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        int a= Upper(str);System.out.println("Uppercase: "+a);
        int b= Lower(str);System.out.println("Lowercase: "+b);
    }
    public static int Upper(String n)
    {
        int a=0;
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(Character.isUpperCase(ch))
            a=a+1;
        }
        return a;
    }
    public static int Lower(String n)
    {
        int b=0;
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(Character.isLowerCase(ch))
            b=b+1;
        }
        return b;
    }
}