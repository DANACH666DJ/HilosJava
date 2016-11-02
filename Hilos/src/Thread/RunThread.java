package Thread;

public class RunThread {
	public static void main(String args[]) {
		Thread t;
		
		t = new HelloThread();
		t.start();// Crea y arranca un nuevo hilo de ejecucion
		try {
			HelloThread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.stop();
		}

}
