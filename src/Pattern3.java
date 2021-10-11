package com.company;
public class Pattern3 {
    public static void main(String[] args)
    {
        int i, j;
        char alpha='A';
        for(i = 1; i <= 5; i++)
        {
            for(j = 1; j <= i; j++)
            {
                System.out.print((char) alpha + " ");
            }
            alpha++;
            System.out.println();
        }
    }
}
