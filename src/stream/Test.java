package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");

        list = list
                .stream()
                .filter(str -> !str.equals("B"))
                .filter(str -> !str.equals("A"))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
