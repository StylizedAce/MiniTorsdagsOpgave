package dk.cphbusiness.tog.datastructures.stack;

import dk.cphbusiness.tog.datastructures.linkedlist.LinkedList;
import dk.cphbusiness.tog.datastructures.linkedlist.LinkedListImpl;

import java.util.Iterator;

public class StackImpl<E> implements Stack<E>
{
	private final LinkedList<E> list;

	public StackImpl()
	{
		list = new LinkedListImpl<>();
	}

	@Override
	public int size()
	{
		return list.size();
	}

	@Override
	public void push(E element)
	{
		list.addFirst(element);
	}

	@Override
	public E pop()
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
