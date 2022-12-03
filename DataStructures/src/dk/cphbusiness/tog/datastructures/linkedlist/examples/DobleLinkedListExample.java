package dk.cphbusiness.tog.datastructures.linkedlist.examples;

import dk.cphbusiness.tog.datastructures.linkedlist.DoubleLinkedList;
import dk.cphbusiness.tog.datastructures.linkedlist.DoubleLinkedListImpl;

public class DobleLinkedListExample
{
	public static void main(String[] args)
	{
		DoubleLinkedList<String> list = new DoubleLinkedListImpl<>();
		list.addFirst("Str1");
		list.addLast("Str2");
		list.addFirst("Str3");
		for(String s : list)
		{
			System.out.println(s);
			//Str3
			//Str1
			//Str2
		}
		System.out.println("get(1): " + list.get(1)); //Str1
		System.out.println("Remove last: " + list.removeLast()); //Str2
		for(String s : list)
		{
			System.out.println(s);
			//Str3
			//Str1
		}
		int count = 0;
		while(count < 1000000000)
		{
			list.addFirst("Hello!" + count);
			++count;
			if(count % 100000 == 0)
			{
				System.out.println(count);
			}
		}
		for(String s : list)
		{
			System.out.println(s);
		}
	}
}
