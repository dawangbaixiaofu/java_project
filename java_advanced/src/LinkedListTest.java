import java.util.LinkedList;
import java.util.List;
public class LinkedListTest {
    public static void main(String[] args)
    {
        //链表数据结构，基本单元是node
        /**
         * 单链表
         * node：一个属性是存储数据，另一个属性是下一个节点的内存地址
         *链表优缺点：随机的增删效率高，缺点是查询效率低
         *
         */
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add(1);
        for (int i=0; i<list.size();i++)
        {
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }
}
