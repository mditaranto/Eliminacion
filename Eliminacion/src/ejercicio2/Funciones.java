package ejercicio2;

public class Funciones {
	static int[] rellenar(int array[]) {
		int relleno[] = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = (int)(Math.random()*100+1);
		}
		return relleno;
	}
	
	static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
