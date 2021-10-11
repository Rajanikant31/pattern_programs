public class Pattern7
{
        public static void main(String[] args)
        {
            int i, j, k,m=5;
            for(i = m; i > 0; i--)
            {
                for(j=i; j < m; j++)
                {
                    System.out.print("  ");
                }
                for(k = 2*i; k >1; k--)
                {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
    }



