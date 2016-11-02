package Hilos;

public class Dormilon extends Thread {
	int siesta;
	int intervalo;

	public Dormilon(int siesta) {
		this.siesta = siesta;
	}

	public void run() {
		try {
			System.out.println("El ni�o se echa a dormir");
			Thread.sleep(siesta);
		} catch (InterruptedException e) {
			System.out.println("Siesta interrumida por mam�");
			return;
		}
		System.out.println("El ni�o se despierta solito");
	}

	public static void main(String[] args) {
		int siesta = 600;
		int despertador = 700;
		System.out.println("La mam� acueta al ni�o");
		Thread nene = new Dormilon(siesta);
		nene.start();
		try {
			Thread.sleep(despertador);
			nene.interrupt();
			nene.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fin de la historia");
	}
}
