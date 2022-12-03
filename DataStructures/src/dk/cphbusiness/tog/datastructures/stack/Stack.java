package dk.cphbusiness.tog.datastructures.stack;

public interface Stack<E> extends Iterable<E>
{
	int size();
	default boolean isEmpty()
	{
		return size() == 0;
	}
	void push(E element);
	E pop();
	E peek();
}
