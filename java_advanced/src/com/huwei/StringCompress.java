package com.huwei;

public class StringCompress {
    public static void main(String[] args) {
        //字符串压缩
        String str = "ssssiodddd";
        StringCompress case1 = new StringCompress();
        String result = case1.solution(str);
        System.out.println(result);

    }
    public String solution(String str)
    {
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<str.length())
        {
            int j = i;
            while(j<str.length()&&str.charAt(i)==str.charAt(j))
            {
                j++;
            }
            sb.append(str.charAt(i));
            sb.append(j-i);
            i = j;
        }


        //判断压缩后字符串长度和原先字符串的长度
        String res= sb.toString();
        if(res.length()>str.length())
        {
            return str;
        }
        else
            return res;

    }
}
