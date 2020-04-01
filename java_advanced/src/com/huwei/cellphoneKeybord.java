package com.huwei;

import java.util.Scanner;

public class cellphoneKeybord {
    public static void main(String[] args) {
        //九宫格按键输入
        cellphoneKeybord phone = new cellphoneKeybord();
        phone.solution();


    }
    public void solution()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the numbers from the phone:");
        //输入的字符长度不能超过500
        for (int i=0;input.hasNext()&&i<500;i++)
        {
            String str = input.next();
            int len = str.length();
            char charctor = str.charAt(0);
            //对字符和输入的次数开始进行判断
            switch (charctor)
            {
                case '0':
                    if (len%2==0) System.out.print(' ');
                    if (len%2==1) System.out.print('0');
                    break;
                case '1':
                    if (len%5==0) System.out.print('!');
                    if (len%5==1) System.out.print('1');
                    if (len%5==2) System.out.print(',');
                    if (len%5==3) System.out.print('.');
                    if (len%5==4) System.out.print('?');
                    break;
                case '2':
                    if (len%4==0) System.out.print('C');
                    if (len%4==1) System.out.print('2');
                    if (len%4==2) System.out.print('A');
                    if (len%4==3) System.out.print('B');
                    break;
                case '3':
                    if (len%4==0) System.out.print('F');
                    if (len%4==1) System.out.print('3');
                    if (len%4==2) System.out.print('D');
                    if (len%4==3) System.out.print('E');
                    break;
                case '4':
                    if (len%4==0) System.out.print('I');
                    if (len%4==1) System.out.print('4');
                    if (len%4==2) System.out.print('G');
                    if (len%4==3) System.out.print('H');
                    break;
                case '5':
                    if (len%4==0) System.out.print('L');
                    if (len%4==1) System.out.print('5');
                    if (len%4==2) System.out.print('J');
                    if (len%4==3) System.out.print('K');
                    break;
                case '6':
                    if (len%4==0) System.out.print('O');
                    if (len%4==1) System.out.print('6');
                    if (len%4==2) System.out.print('M');
                    if (len%4==3) System.out.print('N');
                    break;
                case '7':
                    if (len%5==0) System.out.print('S');
                    if (len%5==1) System.out.print('7');
                    if (len%5==2) System.out.print('P');
                    if (len%5==3) System.out.print('Q');
                    if (len%5==4) System.out.print('R');
                    break;
                case '8':
                    if (len%4==0) System.out.print('V');
                    if (len%4==1) System.out.print('8');
                    if (len%4==2) System.out.print('T');
                    if (len%4==3) System.out.print('U');
                    break;
                case '9':
                    if (len%5==0) System.out.print('Z');
                    if (len%5==1) System.out.print('9');
                    if (len%5==2) System.out.print('W');
                    if (len%5==3) System.out.print('X');
                    if (len%5==4) System.out.print('Y');
                    break;
                default:
                    break;

            }
        }
    }
}
