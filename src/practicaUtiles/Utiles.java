package practicaUtiles;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Utiles {
	
	/*	LISTA DE UTILES
	PedirValor
	Obtener Entero por Scanner
	ValorMayor
	ValorMenor
	Suma
	Resta
	Multiplicacion
	Division
	Potencia
	Raiz
	Modulo de divison
	Hipotenusa de un triángulo
	Superficie de una circunferencia.
    Perímetro de una circunferencia.
    Área de un rectángulo.
    Área de un triángulo.
    Generar numero al azar.
    Comprobar numero Primo.
	*/
	
	public static int pedirValor() {
		
		String str = JOptionPane.showInputDialog("Introzduca el valor:");
		int valor = Integer.parseInt(str);
		return valor;
	}
	
	public static int obtenerEnteroPorScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static int valorMayor(int valor1, int valor2) {
		
		int valormax;
		if(valor1>valor2) {
			valormax = valor1;
		}else {
			valormax = valor2;
		}
		
		return valormax;
		
	}
	
	
	public static int valorMenor(int valor1, int valor2) {
		
		int valormin;
		if(valor1<valor2) {
			valormin = valor1;
		}else {
			valormin = valor2;
		}
		
		return valormin;
		
	}
	
	
	public static int suma(int valor1, int valor2) {
		
		int resSuma = valor1 + valor2;
		
		return resSuma;
		
	}

	
	public static int resta(int valor1, int valor2) {
		
		int resResta = valor1 - valor2;
		
		return resResta;
		
	}
	
	
	public static float division(float numerador, float denominador) {
		
		float resDiv = (float) numerador / denominador;
		
		return resDiv;
		
	}
	
	
	public static int potencia(int valor1, int valor2) {
		
		int resPoten = (int) Math.pow(valor1, valor2);
		
		return resPoten;
		
	}
	
	
	public static float raiz(float valor1) {
		
		float resRaiz = (float) Math.sqrt(valor1);
		
		return resRaiz;
		
	}
	
	
	public static float moduloDivision(float valor1, float valor2) {
		
		float resMDiv = (float) valor1 % valor2;
		
		return resMDiv;
		
	}
	
	
	public static float hipotenusaTriangulo(float cateto1, float cateto2) {
		
		float resHTri = (float) Math.sqrt((float) Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		return resHTri;
		
	}
	
	
	public static float superficieCircunferencia(float radio) {
		
		float resSCir = (float) (Math.PI * Math.pow(radio, 2));
		
		return resSCir;
		
	}
	
	
	public static float perimetroCircunferencia(float radio) {
		
		float resPCir = (float) (2 * Math.PI * radio);
		
		return resPCir;
		
	}
	
	
	public static float areaRectangulo(float base, float altura) {
		
		float resARec = (float) base * altura;
		
		return resARec;
		
	}
	
	
	public static float areaTriangulo(float base, float altura) {
		
		float resATri = (float) (base * altura)/2;
		
		return resATri;
		
	}
	
	
	public static int numeroAzar(int min, int max) {
		 int resAzar = (int) Math.round(Math.random() * (max - min)) + min;
		 return resAzar;
	}
	
	public static boolean comprobarPrimo(int numero) {
		// Recorro los distintos divisores posibles del numero
		for (int j = 2; j <= numero / 2; j++) {
			if (numero % j == 0) { // j es divisor de numeros[i]
				return false;
			}
		}
		// Si salimos del bucle con la bandera arriba, el nÃºmero es primo
		return true;
	}
	
	
	
	
	
	
	
}