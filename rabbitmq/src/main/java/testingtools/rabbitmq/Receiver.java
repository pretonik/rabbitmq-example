/**
 * 
 */
package testingtools.rabbitmq;

import java.util.concurrent.CountDownLatch;

/**
 * @author pretonik
 *
 */
public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);

	public void receiveMessage(String message) {
		System.out.println("Received <" + message + ">");
		latch.countDown();
	}

	public CountDownLatch getLatch() {
		return latch;
	}
}
