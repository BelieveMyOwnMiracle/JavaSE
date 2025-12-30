package iterator;

import java.util.*;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("CCC","AAA","BBB","DDD"));

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            int i = iterator.nextIndex();
            String next = iterator.next();
            System.out.println("当前元素: " + next + ", 位置: " + i);
        }

        while(iterator.hasPrevious()){
            int i = iterator.previousIndex();
            String next = iterator.previous();
            System.out.println("当前元素: " + next + ", 位置: " + i);
        }

        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        queue.offer(10);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        List<String> list1 = new ArrayList<>(Arrays.asList("BBB","AAA","CCC","DDD"));
        List<String> list2 = new ArrayList<>(Arrays.asList("XXX","","CCC",""));
        Collections.copy(list2,list1);
        System.out.println(list2);

        Predicate<Integer> lessThan10 = num -> num > 10;
        System.out.println(lessThan10.test(12));
        System.out.println(lessThan10.test(10));
        System.out.println(lessThan10.test(9));
    }
}
