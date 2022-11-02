import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PriorityQueueTest {

	/*
	 * Part 1: complete
	 */
	
	PriorityQueue pq;
	
	@Before
	public void setup(){
		pq = new PriorityQueue(20);
	}
	
	@Test
	public void insertTestMin() {
		pq.insert(1);
		pq.insert(21);
		assertEquals(1,pq.min());
	}
	
	@Test
	public void insertTestSize() {
		pq.insert(1);
		pq.insert(21);
		assertEquals(2,pq.size());
	}

	@Test
	public void removeMinTest() {
		// step 1: add a few numbers to pq
		pq.insert(1);
		pq.insert(21);
		pq.insert(5);
		pq.insert(11);
		// step 2: call pq.removeMin() a few times to check
		//         numbers are returned in ascending order 
		assertEquals(1,pq.removeMin());
		assertEquals(5,pq.removeMin());
	}
	
	
	@Test(expected=PriorityQueueException.class)
	public void removeMinEmptyTest() {
		pq.removeMin();
	}
}	
