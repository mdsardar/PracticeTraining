package org.threading.edu;

public class Reserve implements Runnable {

	int available = 1;
	int wanted;

	Reserve(int i) {
		wanted = i;
	}

	@Override
	public void run() {

		synchronized (this) {

			System.out.println("Available Berths=" + available);

			if (available >= wanted) {
				String name = Thread.currentThread().getName();
				System.out.println(wanted + " Berths reserved for " + name);
				try {
					Thread.sleep(2000);
					available = available - wanted;
				} catch (InterruptedException e) {
				}
			} else
				System.out.println("Sorry  No Berths ");

		}

	}

}

