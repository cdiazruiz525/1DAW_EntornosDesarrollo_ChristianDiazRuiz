package practicaUtiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilesTest {

	@Test
	public void valorMayorTest() {
		int expected = 5;
		int actual = Utiles.valorMayor(1, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void valorMenorTest() {
		int expected = 1;
		int actual = Utiles.valorMenor(1, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void sumaTest() {
		int expected = 16;
		int actual = Utiles.suma(8, 8);
		assertEquals(expected, actual);
	}
	
	@Test
	public void restaTest() {
		int expected = 2;
		int actual = Utiles.resta(8, 6);
		assertEquals(expected, actual);
	}
	
	@Test
	public void divisionTest() {
		float expected = (float) 4.5;
		float actual = Utiles.division(9, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void potenciaTest() {
		int expected = 8;
		int actual = Utiles.potencia(2, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void raizTest() {
		float expected = (float) 8.0;
		float actual = Utiles.raiz(64);
		assertEquals(expected, actual);
	}
	
	@Test
	public void moduloDivisionTest() {
		float expected = (float) 1.0;
		float actual = Utiles.moduloDivision(9, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void hipotenusaTrianguloTest() {
		float expected = (float) 4.2426405;
		float actual = Utiles.hipotenusaTriangulo(3, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void superficieCircunferenciaTest() {
		float expected = (float) 28.274334;
		float actual = Utiles.superficieCircunferencia(3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void perimetroCircunferenciaTest() {
		float expected = (float) 18.849556;
		float actual = Utiles.perimetroCircunferencia(3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void areaRectanguloTest() {
		float expected = (float) 9.0;
		float actual = Utiles.areaRectangulo(3, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void areaTrianguloTest() {
		float expected = (float) 4.5;
		float actual = Utiles.areaTriangulo(3, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void numeroAzarTest() {
		boolean expected = true;
		int numero = Utiles.numeroAzar(0, 100);
		boolean actual = false;
		if (numero >= 0 && numero <= 100) {
			actual = true;
		}
		assertEquals(expected, actual);
	}
	
	@Test
	public void comprobarPrimoTest() {
		boolean expected = true;
		boolean actual = Utiles.comprobarPrimo(7);
		
		assertEquals(expected, actual);
	}

}
