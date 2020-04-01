public class genericTest {
    //泛型的声明在返回值类型之前
    public static <E> void printArray(E[] args)
    {
        for (E element:args)
        {System.out.printf("%s ", element);}
        System.out.println("\n");
    }
    public static void main(String[] args)
    {
        Integer[] example1 = {1,2,3,4,5,9};
        Double[] example2 = {1.1,2.12,3.2};
        String[] example3 = {"abc","def","mnk"};
        printArray(example3);
        printArray(example1);
        printArray(example2);
    }
}
