package Thread;

public class RunThread {
	public static void main(String args[]) {
		new HelloThread().start();// Crea y arranca un nuevo hilo de ejecucion
		try {
			HelloThread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println ("Hola desde el hilo principal!");
		System.out.println ("Proceso acabando.");
		}

}
