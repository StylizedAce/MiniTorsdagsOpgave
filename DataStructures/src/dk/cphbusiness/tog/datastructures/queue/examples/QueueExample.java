package dk.cphbusiness.tog.datastructures.queue.examples;


import dk.cphbusiness.tog.datastructures.queue.Queue;
import dk.cphbusiness.tog.datastructures.queue.QueueImpl;

public class QueueExample
{
	public static void main(String[] args)
	{
		Queue<String> queue = new QueueImpl<>();
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("4");
		System.out.println("Queue content:");
		for(String s : queue)
		{
			System.out.print("  ");
			System.out.println(s);
		}

		while(!queue.isEmpty())
		{
			System.out.println(queue.dequeue());
		}
	}
}
