package dk.cphbusiness.tog.datastructures.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedListImpl<T> implements DoubleLinkedList<T>
{
	private DoubleLinkedListNode<T> first;
	private DoubleLinkedListNode<T> last;
	private int size;

	public DoubleLinkedListImpl()
	{
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public int size()
	{
		return size;
	}

	@Override
	public void addFirst(T data)
	{
		DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<>(data, first, null);
		if(first != null)
		{
			first.setPrev(newNode);
		}
		first = newNode;
		if(last == null)
		{
			last = newNode;
		}
		++size;
	}

	@Override
	public T removeFirst()
	{
		if(first == null)
		{
			throw new NoSuchElementException("The list is empty!");
		}
		T res = first.getData();
		first = first.getNext();
		if(first != null)
		{
			first.setPrev(null);
		}
		--size;
		return res;
	}

	@Override
	public T peekFirst()
	{
		if(first == null)
		{
			throw new NoSuchElementException("The list is empty!");
		}
		return first.getData();
	}

	@Override
	public T get(int index)
	{
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException("List size: " + size + " index: " + index);
		}
		DoubleLinkedListNode<T> current = first;
		for(int i = 0; i < index; ++i)
		{
			current = current.getNext();
		}
		return current.getData();
	}

	@Override
	public Iterator<T> iterator()
	{
		return new DoubleLinkedListIterator<T>(first);
	}

	@Override
	public T peekLast()
	{
		if(last == null)
		{
			throw new NoSuchElementException("The list is empty!");
		}
		return last.getData();
	}

	@Override
	public void addLast(T data)
	{
		DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<>(data, null, last);
		if(last != null)
		{
			last.setNext(newNode);
		}
		last = newNode;
		if(first == null)
		{
			first = newNode;
		}
		++size;
	}

	@Override
	public T removeLast()
	{
		if(last == null)
		{
			throw new NoSuchElementException("The list is empty!");
		}
		T res = last.getData();
		last = last.getPrev();
		if(last != null)
		{
			last.setNext(null);
		}
		--size;
		return res;
	}


	private static class DoubleLinkedListNode<T>
	{
		private final T data;
		private DoubleLinkedListNode<T> next;
		private DoubleLinkedListNode<T> prev;

		public DoubleLinkedListNode(T data, DoubleLinkedListNode<T> next, DoubleLinkedListNode<T> prev)
		{
			this.data = data;
			this.next = next;
			this.prev = prev;
		}

		public T getData()
		{
			return data;
		}

		public void setNext(DoubleLinkedListNode<T> next)
		{
			this.next = next;
		}

		public DoubleLinkedListNode<T> getPrev()
		{
			return prev;
		}

		public void setPrev(DoubleLinkedListNode<T> prev)
		{
			this.prev = prev;
		}

		public DoubleLinkedListNode<T> getNext()
		{
			return next;
		}
	}

	private static class DoubleLinkedListIterator<T> implements Iterator<T>
	{
		private DoubleLinkedListNode<T> cur;

		public DoubleLinkedListIterator(DoubleLinkedListNode<T> cur)
		{
			this.cur = cur;
		}

		@Override
		public boolean hasNext()
		{
			return cur != null;
		}

		@Override
		public T next()
		{
			T res = cur.getData();
			cur = cur.getNext();
			return res;
		}
	}
}
