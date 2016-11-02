package Hilos;

public class CounterThread extends Thread {
	String name;

	public CounterThread(String name) {
		this.name = name;
	}

	public void run() {
		
		int count = 0;
		try {
			while (++count < 10000) {
				System.out.println(name + ": " + count);
				sleep(10);
			}
		} catch (InterruptedException e) {
			System.err.println(name + " interrumpido");
		}
	}


}
