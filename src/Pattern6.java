public class Pattern6 {
    public static void main(String[] args)
    {
        int i, j, k,m=4;
        for(i = 0; i <= m; i++)
        {
            for(j=i; j < m; j++)
            {
                System.out.print("  ");
            }
            for(k = 0; k <= 2*i; k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
