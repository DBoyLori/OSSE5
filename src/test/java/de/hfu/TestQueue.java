package de.hfu;

import org.junit.Assert;
import org.junit.Test;

public class TestQueue {

	@Test
	public void test() {
		Queue queue = new Queue(3);
		for(int i = 0; i < 3; i++) {
			queue.enqueue(i);
		}
		Assert.assertEquals(0, queue.dequeue());
		Assert.assertEquals(1, queue.dequeue());
		Assert.assertEquals(2, queue.dequeue());
	}

}
