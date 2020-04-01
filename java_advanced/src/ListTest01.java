import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args)
    {
        List myList = new ArrayList();
        myList.add(0, "abc");
        myList.add("abc");
        System.out.println(myList);
        System.out.println(myList.get(0));
        System.out.println(myList.indexOf("abc"));
        System.out.println(myList.lastIndexOf("abc"));
        System.out.println(myList.remove(0));
        System.out.println(myList.set(0,"def"));
        System.out.println(myList);


    }
}
