package practicaJUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MenorMayor_PrimoTest {

	@Test
	public void testPrimos() {
		// Creo las variables
		int numero = 12;
		
		int esperado[] = {5, 7, 11}; // Creo el array con el resultado esperado
		
		int array[] = MenorMayor_Primo.primos(numero); // Llamo a el metodo
		
		assertArrayEquals(esperado, array); // Comparo los dos arrays
	}
	
	@Test
	public void testMenorMayor() {
		
		//Creo las variables
		int num1 = -10; 
		int num2 = 30;
		int num3 = 90;
		
		int esperado[] = {-10, 90}; // Creo el array con el resultado esperado
		
		int array[] = MenorMayor_Primo.menorMayor(num1, num2, num3); // Llamo a el metodo
		
		assertArrayEquals(esperado, array); // Comparo los dos arrays
	}
}
