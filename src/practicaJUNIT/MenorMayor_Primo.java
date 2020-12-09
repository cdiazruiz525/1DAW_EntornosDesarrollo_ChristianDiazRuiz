package practicaJUNIT;

public class MenorMayor_Primo {

	public static void main(String[] args) {
		int numero = 12; // Variable de la que quiero saber los 3 ultimos numeros
		
		System.out.println("El numero es " + numero); // Muestro en consola
		
		int array[] = primos(numero); // Guardo en el array el metodo primos
		
		mostrarArrayPantalla(array); // Muestro el array en pantalla
		
	}
	
	/**
	 * Metodo que pide un numero y guarda en un array los 3 ultimos numeros primos del mismo.
	 * El metodo devuelve un array de 3 elementos.
	 * @param numero
	 * @return
	 */
	public static int[] primos(int numero) {
		int array[] = new int [3]; // Creo array de 3 elementos
		
		int i = 0; // Posicion del array
		
		for (int j = numero -1; j > 1 && i < 3; j--) { // Recorro el array a partir del numero en decremento
			if (esPrimo(j) == true) { // Comparo si el numero es primo 
				array[i] = j; // En caso de serlo, se guardara en la posicion i
				i++; // i se incrementa
			}
		}	
		
		invertirArray(array); // Llamo a el metodo que invierte el array
		
		return array; // Devuelvo el array con los 3 numeros
	}
	
	/**
	 * Metodo que devuelve un boolean, dependiendo de si el numero introducido es primo o no.
	 * @param numero
	 * @return
	 */
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
	
	/**
	 * Metodo con 3 numeros de entrada, calcula el mayor y el menor de los 3. Devuelve un array, indicando en la posicion 0
	 * el valor menor y en la posicion 1 el valor mayor.
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static int[] menorMayor(int num1, int num2, int num3) {
		int array[] = new int [2];
		
		if (num1 > num2 && num1 > num3) { // Num1 mayor de todos
			array[1] = num1;
		}
		if (num1 < num2 && num1 < num3) { // Num1 menor de todos
			array[0] = num1;
		}
		if (num2 > num1 && num2 > num3) { // Num2 mayor de todos
			array[1] = num2;
		}
		if (num2 < num1 && num2 < num3) { // Num2 menor de todos
			array[0] = num2;
		}
		if (num3 > num1 && num3 > num2) { // Num3 mayor de todos
			array[1] = num3;
		}
		if (num3 < num1 && num3 < num2) { // Num3 menor de todos
			array[0] = num3;
		}		
		
		return array; // Devuelvo el array
	}
	
	/**
	 * Metodo que recibe un array e intercambia las posiciones del mismo invirtiendolas
	 * @param array
	 */
	public static void invertirArray(int[] array) {
		
		int aux=0; // Creo la variable
		
		// Bucle for que recorre el array
		for(int i = 0; i < array.length / 2; i++){
			aux = array[i]; // Guardo en auxiliar array[i]
			
			array[i] = array[array.length-1-i]; // Guardo en array[i] el valor de array[array.length-1-i] 
			
			array[array.length-1-i] = aux; // Guardo en array[array.length-1-i] la variable aux
		}
		
	}
	
	/**
	 * Metodo que muestra el array por consola
	 * @param array
	 */
	public static void mostrarArrayPantalla (int[] array) {
		System.out.println("El contenido del array es: ");
		for(int i = 0; i < array.length; i++) {//Con el comando length me permite que i compare con la longitud del array
			System.out.print(array[i] + " ");//Saca por pantalla cada indice del array
		}
		System.out.println();//Este syso me permite hacer un salto de linea despues del bucle for
	}
}
