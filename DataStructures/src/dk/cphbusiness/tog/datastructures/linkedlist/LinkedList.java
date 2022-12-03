package dk.cphbusiness.tog.datastructures.linkedlist;

public interface LinkedList<T> extends Iterable<T>
{
	int size();
	T peekFirst();
	T get(int index);

	void addFirst(T data);
	T removeFirst();
}
