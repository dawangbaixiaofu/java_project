package com.huwei;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class josephCircle {
        public static void main(String[] args)
        {
            System.out.println("please enter the total :");
            Scanner sca = new Scanner(System.in);
            int total = sca.nextInt();
            System.out.println("please enter the number of outside of circle:");
            int x = sca.nextInt();
            System.out.println("the index of people going to outside of circle is :");
            List circle = new ArrayList();
            // insert into people of the circle
            for (int i = 0;i<total;i++)
            {
                circle.add(i+1);
            }
            int countx = 0;
            int index = -1;
            while (circle.size()!=0)
            {
                ++index;

                countx++;
                if (index== circle.size())
                {
                    index = 0;
                }

                if(countx == x)
                {
                    System.out.println(circle.get(index));
                    circle.remove(index);
                    countx = 0;
                    index--;
                }
            }


        }
}
