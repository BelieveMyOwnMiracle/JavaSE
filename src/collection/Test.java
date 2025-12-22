package collection;

public class Test {
    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();

        stack.push("AAA");
        stack.push("BBB");
        stack.push("CCC");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.offer("AAA");
        queue.offer("BBB");
        queue.offer("CCC");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        HashTable<String> hashTable = new HashTable<>();
        String str = "AAA";
        System.out.println(hashTable.contains(str));
        hashTable.insert(str);
        System.out.println(hashTable.contains(str));
    }


}
