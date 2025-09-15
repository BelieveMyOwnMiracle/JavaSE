public class Teacher extends Person implements C, Cloneable{

    @Override
    public void study() {
        System.out.println("实现接口的study方法");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
