package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] array = {4, -3, -5, 9, 1, 11};
        int m = 1;
        int s_counter = 0;
        int l_counter = 0;
        int[] smaller = new int[array.length];
        int[] larger = new int[array.length];

        for (int a : array)
        {
            if (a < m)
            {
                smaller[s_counter] = a;
                s_counter++;
            }
            if (a > m)
            {
                larger[l_counter] = a;
                l_counter++;
            }
        }

        System.out.println("Smaller: ");
        for (int s : smaller)
        {
            if (s != 0)
                System.out.print(s + "  ");
        }
        System.out.println(" ");
        System.out.println("Larger: ");
        for (int l : larger)
        {
            if (l != 0)
                System.out.print(l + "  ");
        }
    }
}
