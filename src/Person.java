public class Person {
    String name;
    int age;
    String sex;

    static String info;

    static {
        info = "Hello World";
        System.out.println("静态代码块被调用");
    }

    public Person() {}

    void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    void swapInteger(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
