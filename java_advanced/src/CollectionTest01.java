import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args)
    {
        Collection c = new ArrayList();
        c.add(1200);
        c.add("hello world");
        System.out.println(c);
        System.out.println(c.size());

        c.remove(1200);
        c.add(1200);
        Object[] obj = c.toArray();
        //c.clear();
        System.out.println(c);
        for (int i = 0 ; i < obj.length;i++)
        {
            System.out.println(obj[i]);
        }

    }
}
