package collection;

public class LinkedStack<E> {
    private final Node<E> head = new Node<>(null);

    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }




}
