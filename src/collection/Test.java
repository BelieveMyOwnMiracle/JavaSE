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

        HashTable<Integer> hashTable = new HashTable<>();
        for (int i = 0; i < 70; i++) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
    }


}
