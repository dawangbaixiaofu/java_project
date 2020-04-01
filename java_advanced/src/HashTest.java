import java.util.function.Consumer;

public class HashTest {
    public static void main(String[] args)
    {
        //哈希表：数组和单向链表的结合
        /**
         * 哈希表本质是一个数组，只不过每一个数组元素
         * 又是一个单向链表
         *单向链表中元素包含的内容：object kye, object value
         * final int hash
         * entry next
         * 其中final int hash 是通过 key 调用 hashCode 方法得到的值，
         * 再次通过“哈希算法”得出的值。
         * hashCode（） java.lang.hashCode()
         *
         */
        String s = "abc";
        //s -> System.out.println(s);

    }
}
