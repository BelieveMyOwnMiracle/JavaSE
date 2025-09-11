public class Person {
    String name;
    int age;
    String sex;

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
