package practicaDebug;

public class FIXED_invertir_Array {

	public static void main(String[] args) {
		
		//declaramos array a invertir y la variable que nos va a servir para intercambiar los valores del array
		int array[] = {1,2,3,4,5,6,7,8,9};
		int aux=0;
		// imprimimos array para comprobar
		int longitud=array.length;
		/*Antiguo for (int i = 0; i<=longitud; i++)*/
		for (int i = 0; i<longitud; i++) {
		 System.out.print(array[i] + " ");
		}
		// invertimos array recorri�ndolo hasta la mitad e intercambiando valores
		/*Antiguo for(int i=0;i<=longitud/2; i++){*/
		for(int i=0;i<longitud/2; i++){
		//vamos guardando la posici�n que vamos a intercambiar desde el final
		/*Antiguo aux = array[longitud-i];*/
		 aux = array[longitud-i-1];
		 //como ya tenemos guardada la posici�n longiutd-i-1, ya podemos guardar en esa posici�n un valor
		 array[longitud-i-1] = array[i];
		 //guardamos en las posiciones iniciales el valor de aux que ya estaba guardado
		 array[i] = aux;
		 }
		// comprobamos que se ha invertido el array
		System.out.println();
		
		/*Antiguo for (int i = 0; i < longitud; i++)*/
		for (int i = 0; i < longitud; i++) {
		System.out.print(array[i] + " ");
		}
		
		
//		// CODIGO ORIGINAL
//		//declaramos array a invertir y la variable que nos va a servir para intercambiar los valores del array
//		int array[] = {1,2,3,4,5,6,7,8,9};
//		int aux=0;
//		// imprimimos array para comprobar
//		int longitud=array.length;
//		for (int i = 0; i<=longitud; i++)
//		 System.out.print(array[i] + " ");
//		// invertimos array recorri�ndolo hasta la mitad e intercambiando valores
//		for(int i=0;i<=longitud/2; i++){
//		//vamos guardando la posici�n que vamos a intercambiar desde el final
//		 aux = array[longitud-i];
//		 //como ya tenemos guardada la posici�n longiutd-i-1, ya podemos guardar en esa posici�n un valor
//		 array[longitud-i-1] = array[i];
//		 //guardamos en las posiciones iniciales el valor de aux que ya estaba guardado
//		 array[i] = aux;
//		 }
//		// comprobamos que se ha invertido el array
//		System.out.println();
//		
//		for (int i = 0; i < longitud; i++)
//		System.out.print(array[i] + " ");

	}

}
