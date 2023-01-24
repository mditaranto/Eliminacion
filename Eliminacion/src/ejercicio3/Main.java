package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int aleat[] = new int[20];
		int indiceBorrar = 0;
		int numeroaeliminar = 0;
		String letra;

		Scanner sca = new Scanner(System.in);

		Funciones.rellenar(aleat);

		Arrays.sort(aleat);

		do {
			System.out.println("Por favor elija: ");
			System.out.println("[a] Mostrar valores");
			System.out.println("[b] Eliminar un valor");
			System.out.println("[c] Salir");
			letra = sca.next();
			switch (letra) {
			case "a" -> {
				System.out.println(Arrays.toString(aleat));
			}
			case "b" -> {
				System.out.println("Introduzca el numero a eliminar");
				numeroaeliminar = sca.nextInt();

				indiceBorrar = Arrays.binarySearch(aleat, numeroaeliminar);

				if (indiceBorrar >= 0) {
					while (indiceBorrar >= 0) {
						System.arraycopy(aleat, indiceBorrar + 1, aleat, indiceBorrar, aleat.length - indiceBorrar - 1);
						aleat = Arrays.copyOf(aleat, aleat.length - 1);
						indiceBorrar = Arrays.binarySearch(aleat, numeroaeliminar);
					}
				} else {
					System.out.println("Ese numero no esta en los valores");
				}
			}
			case "c" -> {
				indiceBorrar = 30;
				System.out.println("Que tenga buen dia");
			}
			default -> {
				System.out.println("Introduzca un valor valido");
			}
			}

		} while (indiceBorrar != 30);

	}

}
