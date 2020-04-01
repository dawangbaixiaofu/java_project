package com.huwei;
import java.util.*;
public class printTaskSort {
    public static void main(String[] args)
    {
        //输入各个打印任务的优先级

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the priority of tasks:");
        String str1 = input.nextLine();
        String[] result = str1.split(",");

        //a用来接收优先级 b表示各个任务
        LinkedList<Integer> a = new LinkedList<Integer>();
        LinkedList<Integer> b = new LinkedList<Integer>();
        for (int i = 0 ; i < result.length; i++)
        {
            a.add(Integer.valueOf(result[i].trim()));
            b.add(i);

        }
        //sort函数对任务优先级进行排序，给出排序后的任务列表

        System.out.println("原先的任务优先级："+a);
        System.out.println("原先的任务标号："+b);
        sort(a,b);
        System.out.println("排序后的任务优先级："+a);
        System.out.println("排序后的任务标号："+b);


    }

    public static void sort(LinkedList<Integer> a, LinkedList<Integer> b)
    {
        for(int i =0 ; i<a.size();i++)
            for(int j = i+1 ; j<a.size();j++)
            {
                if(a.get(i)<a.get(j))
                {
                    a.add(a.remove(i));
                    b.add(b.remove(i));
                    i--;
                    break;
                }
            }
    }
}
