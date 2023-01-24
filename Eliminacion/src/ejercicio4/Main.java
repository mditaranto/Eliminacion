package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int aleat[] = new int[20];
		int indiceBorrar;
		int indiceBusqueda = 0;
		
		RellenarArray.rellenar(aleat);

		Scanner sca = new Scanner(System.in);

		System.out.println("Introduzca un valor");
		indiceBorrar = sca.nextInt();

		for (int a = 0; a <= 10; a++) {
			for (int i = indiceBorrar + 1; i <= 10; i++) {
				while (indiceBusqueda < aleat.length && i != aleat[indiceBusqueda]) {
					indiceBusqueda++;
				}
				if (indiceBusqueda >= 0 && indiceBusqueda < aleat.length) {
					System.arraycopy(aleat, indiceBusqueda + 1, aleat, indiceBusqueda, aleat.length - indiceBusqueda - 1);
					
					aleat = Arrays.copyOf(aleat, aleat.length - 1);
				}
				indiceBusqueda = 0;
			}

		}
		System.out.println(Arrays.toString(aleat));

	}

}
