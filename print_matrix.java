class print_matrix
{
    public static void main1(int n[][], int r, int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(n[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main2(int n[], int a)
    {
        for(int i=0;i<a;i++)
        {
            System.out.print(n[i]+"\t");
        }
    }
    
    public static void main3(String n[], int a)
    {
        for(int i=0;i<a;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}