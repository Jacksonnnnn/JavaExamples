/*
 * 																			PAGE 245
 */

package me.Jackson.JavaExamples2;

class NewThread extends Thread {
	
	NewThread() {
		super("Demo Thread");
		System.out.println("Child thread: " + this);
}
	
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
public class ExtendThread {

	public static void main(String[] args) throws InterruptedException {
		NewThread nt = new NewThread();
		
		nt.start();
		
		for(int i = 5; i > 0; i--) {
			System.out.println("Main Thread: " + i);
		}
		System.out.println("Main thread exiting.");
	}

}
