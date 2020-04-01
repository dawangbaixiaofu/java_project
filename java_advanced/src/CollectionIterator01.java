import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

//iterator对象
public class CollectionIterator01 {
    public static void main(String[] args)
    {
        Collection c = new HashSet();
        c.add("abc");
        c.add(100);
        c.add("def");
        System.out.println(c);
        String s1 = new String("abc");
        String s2 = new String("def");
        String s3 = new String("abc");
        System.out.println(s1.equals(s3));

        ArrayList arr = new ArrayList();
        arr.add(s1);
        arr.add(s2);
        System.out.println(arr.contains(s3));

        //获取iterator对象
        Iterator ite = c.iterator();
        while (ite.hasNext())
        {
            System.out.println(ite.next());
            //可以使用迭代器进行删除，如果集合对象结构发生变化，需要重新生成一个迭代器
            ite.remove();
        }
        System.out.println(c);

    }

}
