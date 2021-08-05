/**
 * 
 */
package se283.a1.t2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se283.a1.t1.Counter;

/**
 * Test class for Counter class
 * @author [YourName]
 * @version [Current Date]
 *
 */
class CounterTest {

	/**
	 * Test method for {@link se283.a1.t1.Counter#increment()}.
	 */
	@Test
	void testIncrement() {
		//fail("Not yet implemented");
		Counter counter = new Counter();
		int before = counter._ctr ;
		counter.increment();
		assertEquals(counter._ctr,before+1);
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#decrement()}.
	 */
	@Test
	void testDecrement() {
//		fail("Not yet implemented");
		Counter counter = new Counter();
		int before = counter._ctr;
		counter.decrement();
		assertEquals(counter._ctr,before-1);
	}


	/**
	 * Test method for {@link se283.a1.t1.Counter#reset()}.
	 */
	@Test
	void testReset() {
//		fail("Not yet implemented");
		Counter counter = new Counter();
		counter.reset();
		assertEquals(counter._ctr, 0);
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}.
	 */
	@Test
	void testMultiplyBy() {
//		fail("Not yet implemented");
		Counter counter = new Counter();
		int before = counter._ctr;
		counter.multiplyBy(2);
		assertEquals(counter._ctr,before*2);
	}


}
