package Q1;

public interface SearchTree<E> {

    public boolean add(E item);
    public E find(E target);
    public E delete(E target);
    public boolean contains(E target);
    public boolean remove(E o);
}


