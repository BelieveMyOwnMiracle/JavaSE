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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Person person) {
            return this.name.equals(person.name) &&
                    this.age == person.age &&
                    this.sex.equals(person.sex);
        }
        return false;
    }

    void swapInteger(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
