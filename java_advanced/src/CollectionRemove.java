import java.util.ArrayList;
import java.util.Collection;

public class CollectionRemove {
    public static void main(String[] args)
    {
        Collection cc = new ArrayList();
        String s1 = new String("abc");
        String s2 = new String("abc");
        cc.add(s1);
        System.out.println(cc);
        cc.remove(s2);
        System.out.println(cc);

        User user1 = new User("jack");
        User user2 = new User("jack");
        cc.add(user1);
        System.out.println(cc);
        cc.remove(user2);
        System.out.println(cc);

    }

}
class User{
    public String name;

    public User(String name)
    {
        this.name = name;
    }
}