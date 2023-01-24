package ejercicio2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int aleat[] = new int[20];
		int indiceBorrar = 0;
		
		Funciones.rellenar(aleat);
		
		Arrays.sort(aleat);

		for (int i = 0; i < aleat.length; i++) {
			indiceBorrar = Arrays.binarySearch(aleat, aleat[i]);
			while (indiceBorrar >= 0 && Funciones.esPrimo(aleat[i])) {
				System.arraycopy(aleat, indiceBorrar + 1, aleat, indiceBorrar, aleat.length - indiceBorrar - 1);
				aleat = Arrays.copyOf(aleat, aleat.length - 1);
				indiceBorrar = Arrays.binarySearch(aleat, aleat[i]);
			}
		}
		System.out.println(Arrays.toString(aleat));


	}

}
