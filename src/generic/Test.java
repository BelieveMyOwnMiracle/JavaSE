package generic;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        String test = a.<String>test();
    }

    static class A {
        public <T> T test(){
            return null;
        }
    }
}
