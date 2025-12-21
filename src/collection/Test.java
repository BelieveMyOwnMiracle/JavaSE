package collection;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            arrayList.add(i+"",i);
        }
        System.out.println(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10,0);
        linkedList.add(20,1);
        linkedList.add(30,0);

        System.out.println(linkedList);
        System.out.println(linkedList.get(0));
    }
}
