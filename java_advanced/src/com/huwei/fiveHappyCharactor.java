package com.huwei;
import java.lang.System;
import java.util.Scanner;

public class fiveHappyCharactor {
    public static void main(String[] args) {
        //集五福
        fiveHappyCharactor group1 = new fiveHappyCharactor();
        int numbers = group1.fiveLuckCard();
        System.out.println("最终可以集齐"+numbers+"个五福！");

    }
    public int fiveLuckCard()
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("please enter the people who collection the fiveLuckCard:");
        int[] count = new int[5];
        int times=0;
        while (sca.hasNext())
        {
            String str = sca.next();
            System.out.println(str);
            for (int i =0 ; i<str.length();i++)
            {
                if (times>=5)
                    times=0;

                char c = str.charAt(i);
                if (c=='1')
                {
                    count[times++]++;
                }

            }
        }
        //遍历count寻找最小值，就是集齐的五福数量；
        int min = count[0];
        for (int i = 0; i<count.length;i++)
        {
            if (min>count[i])
            {
                min = count[i];
            }
        }
        return(min);

    }
}
