//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    /// # Markdown格式注释
    /// - ads
    /// - dgsd
    public static void main(String[] args) {
        String content1 = "红楼梦\n水浒传";
        String content2 = "三国演义\r西游记";

        System.out.println(content1);
        System.out.println("=====");
        System.out.println(content2);

        byte b = 12;
        short s = 1345;
        var v = b + s; //int

        int c = -1;
        c <<= 2;    //直接运算符连上等号即可，跟上面是一样的
        System.out.println(c);
    }
}