package practicaJUNIT;

public class MenorMayor_Primo {

	public static void main(String[] args) {
		int numero = 12;
		
		System.out.println("El numero es " + numero);
		
		int array[] = tresUltimosNum(numero);
		
		invertirArray(array);
		
		mostrarArrayPantalla(array);
		
	}
	
	public static int[] tresUltimosNum(int numero) {
		int array[] = new int [3];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = numero -1; j > 1 && i < 3; j--) {
				if (esPrimo(j) == true) {
					array[i] = j;
					i++;
				}
			}	
		}
		
		return array;
	}
	
	public static boolean esPrimo(int numero) {
		// Recorro los distintos divisores posibles del numero
		for (int j = 2; j <= numero / 2; j++) {
			if (numero % j == 0) { // j es divisor de numeros[i]
				return false;
			}
		}
		// Si salimos del bucle con la bandera arriba, el número es primo
		return true;
	}
	
	public static void invertirArray(int[] array) {
		
		int aux=0;
		
		for(int i = 0; i < array.length / 2; i++){
			aux = array[i];
			
			array[i] = array[array.length-1-i];
			
			array[array.length-1-i] = aux;
		}
		
	}
	
	public static void mostrarArrayPantalla (int[] array) {
		System.out.println("El contenido del array es: ");
		for(int i = 0; i < array.length; i++) {//Con el comando length me permite que i compare con la longitud del array
			System.out.print(array[i] + " ");//Saca por pantalla cada indice del array
		}
		System.out.println();//Este syso me permite hacer un salto de linea despues del bucle for
	}
}
