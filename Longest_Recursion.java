import java.util.*;
class Longest_Recursion
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String in=sc.nextLine();
        String longest=" ";
        int size=0;
        System.out.println("The longest word is "+ recur(in,longest,size));
    }

    static String recur(String in,String longest,int size)
    {
        in=in.trim();
        int L=in.length();
        boolean last=true;
        for(int i=0; i<L;i++)
        {
            if(in.charAt(i)==' ')
            {
                if(i>size)
                {
                    longest=in.substring(0,i);
                    size=i;
                }
                in= in.substring(i).trim();
                last=false;
                break;
            }
        }
        if(last==false)
        {
            return recur(in,longest,size);
        }
        if(in.length() > longest.length())
            return in;
        return longest;
    }
}