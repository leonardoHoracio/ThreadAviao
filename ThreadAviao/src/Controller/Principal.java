package Controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

import View.Aeroporto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int permissoes = 1;

		Semaphore semaforo = new Semaphore(permissoes);// do próprio java

		Aeroporto aviao1 = new Aeroporto("Aviao 1", semaforo);

		Aeroporto aviao2 = new Aeroporto("Aviao 2", semaforo);

		Aeroporto aviao3 = new Aeroporto("Aviao 3", semaforo);

		Aeroporto aviao4 = new Aeroporto("Aviao 4", semaforo);

		Aeroporto aviao5 = new Aeroporto("Aviao 5", semaforo);

		Aeroporto aviao6 = new Aeroporto("Aviao 6", semaforo);

		Aeroporto aviao7 = new Aeroporto("Aviao 7", semaforo);

		Aeroporto aviao8 = new Aeroporto("Aviao 8", semaforo);

		Aeroporto aviao9 = new Aeroporto("Aviao 9", semaforo);

		Aeroporto aviao10 = new Aeroporto("Aviao 10", semaforo);

		Aeroporto aviao11 = new Aeroporto("Aviao 11", semaforo);

		Aeroporto aviao12 = new Aeroporto("Aviao 12", semaforo);

	}

}
