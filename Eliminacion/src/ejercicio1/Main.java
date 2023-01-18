package ejercicio1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int aleat[] = new int[20];
		int indiceBorrar = 0;

		RellenarArray.rellenar(aleat);

		Arrays.sort(aleat);

		for (int i = 1; i < 100; i++) {
			if (Arrays.binarySearch(aleat, i) > 0 && i % 2 != 0) {
				indiceBorrar = +Arrays.binarySearch(aleat, i);
				System.arraycopy(aleat, indiceBorrar + 1, aleat, indiceBorrar, aleat.length - indiceBorrar - 1);
				aleat = Arrays.copyOf(aleat, aleat.length - 1);
			}
		}
			
	
	}

}
