package Hilos;

public class Prioridad {
	public static void main(String[] args) {
		CounterThread thread1 = new CounterThread("thread1");
		thread1.setPriority(Thread.MIN_PRIORITY);
		CounterThread thread2 = new CounterThread("thread2");
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
		thread1.start();
		try {
			Thread.sleep(1000);
			thread1.interrupt();
			thread2.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
