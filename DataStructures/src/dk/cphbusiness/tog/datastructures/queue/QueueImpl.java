package dk.cphbusiness.tog.datastructures.queue;

import dk.cphbusiness.tog.datastructures.linkedlist.DoubleLinkedList;
import dk.cphbusiness.tog.datastructures.linkedlist.DoubleLinkedListImpl;

import java.util.Iterator;

public class QueueImpl<E> implements Queue<E>
{
	private final DoubleLinkedList<E> list;

	public QueueImpl()
	{
		list = new DoubleLinkedListImpl<>();
	}

	@Override
	public int size()
	{
		return list.size();
	}

	@Override
	public void enqueue(E element)
	{
		list.addLast(element);
	}

	@Override
	public E dequeue()
	{
		return list.removeFirst();
	}

	@Override
	public E peek()
	{
		return list.peekFirst();
	}

	@Override
	public Iterator<E> iterator()
	{
		return list.iterator();
	}
}
