package Controllo;

public class Main {
	public static int[] rollup(int[] inputArray) {
	    if (inputArray.length % 2 != 0) {
	        // Gestione errore per array di lunghezza non pari
	        throw new IllegalArgumentException("L'array di input non ha una lunghezza pari.");
	    }

	    int[] resultArray = new int[inputArray.length / 2];

	    for (int i = 0; i < inputArray.length / 2; i++) {
	        int currentIndex = 2 * i;
	        resultArray[i] = inputArray[currentIndex] + inputArray[currentIndex + 1];
	    }

	    return resultArray;
	}


}
