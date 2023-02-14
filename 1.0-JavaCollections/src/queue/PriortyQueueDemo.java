package queue;

import java.util.PriorityQueue;

public class PriortyQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue();
		
		// adding in pq : 
		pq.add(12);
		pq.add(56);
		pq.add(35);
		pq.offer(19);
		pq.offer(45);
		
		System.out.println(pq);

		// remove : 
		pq.remove(56);
		System.out.println("after removing 56 : "+pq);
		
		System.out.println("remove : "+pq.remove());
		
		// deleting first element of the queue : 
		System.out.println("first element of queue is : "+pq.poll());
		
		// getting first element of queue
		System.out.println(pq);
		System.out.println(pq.element()+"--"+pq.peek());
		
		for(Object o:pq) {
			System.out.println(o);
		}
	}

}
