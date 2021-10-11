public class Pattern5 {
    public static void main(String[] args)
    {
        int i, j, num = 1;
        for(i = 5; i >= 1; i--)
        {
            for(j = 1; j <= i; j++)
            {
                System.out.print(j +"  ");
                num++;
            }
            num=1;
            System.out.println();
        }
    }
}
