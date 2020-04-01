import java.util.HashMap;
import java.util.Map;
public class shoppingTest {
    /**
     * 使用hashMap作为购物车对象
     * 使用add(prodecut p)向购物车添加商品
     * add（product p ,int n)添加n个商品
     * remove（product p, int n)删除一个或者多个
     * 清空购物车
     *
     */
    public static void main(String[] args)
    {
        Map<product, Integer> shopping_cart = new HashMap<product, Integer>();

    //重写hashCode() (按照员工编号进行hash分组) 和equals()
    product p1 = new product("1001", "vegetables",3);
    product p2 = new product("1002", "bread",5);
    product p3 = new product("1003", "milk",3);
    product p4 = new product("1004","noodle",4);
    }

    public void add(product p, int i)
    {

    }



}

class product {
    String no;
    String name;
    double price;
    product(String no, String name, double price)
    {
        this.no = no;
        this.name = name;
        this.price = price;
    }
    public int hashCode()
    {
        return no.hashCode();
    }
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(o instanceof product)
        {
            product p = (product)o;
            if(p.no.equals(this.no)&&p.name.equals(this.name))
            {
                return true;
            }
        }
        return false;
    }
}
