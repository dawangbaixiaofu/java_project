//字节流操作汉字或特殊符号语言的时候容易乱码，因为汉字不止一个字节，
//为了解决这个问题，建议使用字符流。
import java.io.IOException;
import java.io.Writer;
import java.io.Reader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
/*
write(int c):向外写出一个字符
write(char[] buffer):向外写出多个字符 buffer
char[] a = "aA荷兰".toCharArray();将一个字符串转化为一个字符数组
write(char[] buffer,int off,int len)
write(String str):向外写出一个字符串
*/

