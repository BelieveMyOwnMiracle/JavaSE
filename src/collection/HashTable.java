package collection;

import java.util.Arrays;

/// <h1>简单哈希表</h1>
/// 使用链地址法解决哈希冲突
public class HashTable<E> {
    private final int TABLE_SIZE = 10;
    private final Node<E>[] TABLE = new Node[TABLE_SIZE];

    public HashTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            TABLE[i] = new Node<>(null);
        }
    }

    public void insert(E element){
        int index = hash(element);
        Node<E> head = TABLE[index];
        Node<E> node = new Node<>(element);
        node.next = head.next;
        head.next = node;
    }

    public boolean contains(E element){
        int index = hash(element);
        Node<E> node = TABLE[index].next;
        while(node != null){
            if(node.element == element)
                return true;
            node = node.next;
        }
        return false;
    }

    private int hash(Object object){
        int hashCode = object.hashCode();
        return hashCode % TABLE_SIZE;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < TABLE_SIZE; i++) {
            Node<E> node = TABLE[i].next;
            while(node != null){
                builder.append(node.element).append(" -> ");
                node = node.next;
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }
}
