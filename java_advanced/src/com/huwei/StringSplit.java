package com.huwei;

public class StringSplit {
    public static void main(String[] args) {
        //平衡字符串分割 平衡字符串是LR类似这种
        StringSplit str = new StringSplit();
        String balanceString = "LLLRRRLRRL";
        int result = str.solution(balanceString);
        System.out.println(result);
    }
    public int solution(String str)
    {
        int res=0;
        int num = 0;
        for (int i = 0;i<str.length();i++)
        {
            if (str.charAt(i)=='L')
            {
                num++;
            }
            else
                num--;
            if (num ==0)
                res++;
        }
        return res;
    }
}
