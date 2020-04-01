package com.huwei;

import java.util.ArrayList;
import java.util.Arrays;

public class triedTest {
    public static void main(String[] args) {
        //tried树没有掌握，只能使用一种新的方法
        String[] word1 = {"abc","dec","fgabc","jfdec"};
        solution1 sol = new solution1(word1);
        System.out.println(sol.minumLengthEncoding());
    }
}

class solution1
{
    String[] words;
    int lengths = 0;
    public solution1(String[] words)
    {
        this.words = words;
        this.lengths = words.length;
    }
    public int minumLengthEncoding()
    {
        String[] reverse_word = new String[lengths];
        //对原先的单词进行翻转

        for (int i = 0; i<words.length;i++)
        {
            String word = words[i];
            String reword = new StringBuilder(word).reverse().toString();
            reverse_word[i] = reword;
        }
        //对字典进行排序
        Arrays.sort(reverse_word);
        int res = 0;
        for(int i =0; i<reverse_word.length; i++)
        {
            if(i+1<lengths&& reverse_word[i+1].startsWith(reverse_word[i]))
            {
                //删除第i个单词
            }
            else
            {
                res += reverse_word[i].length()+1;
            }
        }
        return res;

    }
}
