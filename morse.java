import java.util.*;
class morse
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the message: ");
        String a= sc.nextLine();
        a=a.toUpperCase();
        String b= morse(a);
        System.out.print("Encoded message: "+b);
    }
    public static String morse(String b)
    {
        String  x="";
        for(int i=0;i<b.length();i++)
        {
            String ch=b.substring(i,i+1);
            String t=change(ch);
            x=x+" "+t;
        }
        return x;
    }
    public static String change(String c)
    {
        switch(c)
        {
            case "A": return ".-";
            case "B": return "-...";
            case "C": return "-.-.";
            case "D": return "-..";
            case "E": return ".";
            case "F": return "..-.";
            case "G": return "--.";
            case "H": return "....";
            case "I": return "..";
            case "J": return ".---";
            case "K": return "-.-";
            case "L": return ".-..";
            case " ": return "/";
            case "M": return "--";
            case "N": return "-.";
            case "O": return "---";
            case "P": return ".--.";
            case "Q": return "--.-";
            case "R": return ".-.";
            case "S": return "...";
            case "T": return "-";
            case "U": return "..-";
            case "V": return ",,,-";
            case "W": return ".--";
            case "X": return "-..-";
            case "Y": return "-.--";
            case "Z": return "--..";
            
            case "1": return ".----";
            case "2": return "..---";
            case "3": return "...--";
            case "4": return "....-";
            case "5": return ".....";
            case "6": return "-....";
            case "7": return "--...";
            case "8": return "---..";
            case "9": return "----.";
            case "0": return "-----";
        }
        return " ";
    }
}