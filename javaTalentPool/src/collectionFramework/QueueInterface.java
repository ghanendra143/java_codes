package collectionFramework;

import java.util.PriorityQueue;

public class QueueInterface {

	public static void main(String[] args) {
		// ============= Queue ================================
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("rahul");
		q.add("abhi");
		q.add("taj");
		q.add("shiva");
		q.remove();      // also removes first element
		//q.poll();      // removes first element
		System.out.println(q);
		for(String e:q)
		{
			System.out.println(e);
		}
			

	}

}
