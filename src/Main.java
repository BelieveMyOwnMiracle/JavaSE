//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    /// # Markdown格式注释
    /// - ads
    /// - dgsd
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();

        int a = 10, b = 20;
        System.out.println("a = " + a + ", b = " + b);

        person.swap(a, b);
        System.out.println("a = " + a + ", b = " + b);

        Integer c = 30, d = 40;
        person.swapInteger(c, d);
        //Integer的对象是不可变对象，传入参数时已经创建副本了，交换的是副本
        //引用类型(非final)是可以实现交换的
        System.out.println("c = " + c + ", d = " + d);

        Person person1 = new Person();
        Person person2 = new Person();

        Teacher teacher = new Teacher();
        teacher.study();

        Teacher clone = (Teacher) teacher.clone();
        System.out.println("clone = " + clone);
        System.out.println("teacher = " + teacher);
        System.out.println(clone == teacher);   //Object类中的clone为浅拷贝
    }
}