package ejercicio4;

public class RellenarArray {

	static int[] rellenar(int array[]) {
		int relleno[] = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = (int)(Math.random()*10+1);
		}
		return relleno;
	}
}

