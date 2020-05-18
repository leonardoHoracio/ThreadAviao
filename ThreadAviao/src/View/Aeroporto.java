package View;

import java.util.concurrent.Semaphore;

public class Aeroporto extends Thread {

	private String nomeAviao;
	private Semaphore semaforo;

	public Aeroporto(String nomeAviao, Semaphore semaforo) {
		this.nomeAviao = nomeAviao;
		this.semaforo = semaforo;
		start();//criar Thread
	}

	public void run() {//Executar
		int min = 0;
		int max = 2;
		int randomNum = min + (int) (Math.random() * (max - min));


			if (randomNum == 0) {
				System.out.println(nomeAviao + " Vai decolar na pista Norte");
				pistaNorte();
			} else {
				System.out.println(nomeAviao + " Vai decolar na pista Sul");
				pistaSul();
			}
		}

	

	private void pistaSul() {
		// TODO Auto-generated method stub
		manobrar();
		taxiar();

		try {
			semaforo.acquire();//passar
			decolar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// ----------V(release)----------//
			semaforo.release();//liberar
			

		}

		afastamento();
	}

	private void pistaNorte() {
		// TODO Auto-generated method stub

		manobrar();
		taxiar();

		try {
			semaforo.acquire();//passar
			decolar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// ----------V(release)----------//
			semaforo.release();//liberar
			

		}

		afastamento();

	}

	public void manobrar() {
		// entre 3 e 7 segundos
		try {
			sleep(3000, 7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nomeAviao + " Manobrou");
	}

	public void taxiar() {
		// entre 5 e 10
		try {
			sleep(5000, 10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nomeAviao + " Taxiou");

	}

	public void decolar() {
		// entre 1 e 4
		try {
			sleep(1000, 4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(nomeAviao + " Decolou ");

	}

	public void afastamento() {
		// entre 3 e 8

		try {
			sleep(3000, 8000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(nomeAviao + " se afastou");
	}

}
