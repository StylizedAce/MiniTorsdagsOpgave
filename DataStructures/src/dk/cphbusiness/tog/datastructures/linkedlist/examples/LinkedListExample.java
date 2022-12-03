package dk.cphbusiness.tog.datastructures.linkedlist.examples;

import dk.cphbusiness.tog.datastructures.linkedlist.LinkedListImpl;

public class LinkedListExample
{
	public static void main(String[] args)
	{
		LinkedListImpl<Integer> myList = new LinkedListImpl<Integer>();
		myList.addFirst(1);
		myList.addFirst(2);
		myList.addFirst(3);
		System.out.println("List size: " + myList.size());
		for(Integer i : myList)
		{
			System.out.println(i);
		}
		System.out.println("List size: " + myList.size());
		for(Integer i : myList)
		{
			System.out.println(i);
		}
	}
}
