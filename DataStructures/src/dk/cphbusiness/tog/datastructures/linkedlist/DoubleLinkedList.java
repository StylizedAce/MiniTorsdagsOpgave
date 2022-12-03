package dk.cphbusiness.tog.datastructures.linkedlist;

public interface DoubleLinkedList<T> extends LinkedList<T>
{
	T peekLast();
	void addLast(T data);
	T removeLast();
}
