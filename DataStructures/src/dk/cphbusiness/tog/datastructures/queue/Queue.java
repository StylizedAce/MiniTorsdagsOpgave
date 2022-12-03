package dk.cphbusiness.tog.datastructures.queue;

public interface Queue<E> extends Iterable<E>
{
	int size();
	default boolean isEmpty()
	{
		return size() == 0;
	}

	void enqueue(E element);
	E dequeue();
	E peek();
}
