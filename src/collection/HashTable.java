package collection;
/// <h1>简单哈希表</h1>
/// 使用链地址法解决哈希冲突
public class HashTable<E> {
    private final int TABLE_SIZE = 10;
    private final Object[] TABLE = new Object[TABLE_SIZE];

    public void insert(E element){
        int index = hash(element);
        TABLE[index] = element;
    }

    public boolean contains(E element){
        int index = hash(element);
        return TABLE[index] == element;
    }

    private int hash(Object object){
        int hashCode = object.hashCode();
        return hashCode % TABLE_SIZE;
    }
}
