/*
*	Clase: Ordenador
*--------------------------------------------------------------
*	Esta es la única clase del proyecto y tiene la función de
* de almacenar un monton de información aleatoria y ordenarla
* por los múltiples métodos de ordenamiento.
*
*/

import java.util.Scanner;
import java.util.Random;

public class Ordenador{

	//atributos de la clase
	private static int[]  vector;
	private static int[]	pasos;
	private static int[][]  tablaRes = new int[10][4];
	private static Scanner scanner = new Scanner(System.in);

	/*
	*	Método: main
	*----------------------------------------------------------
	* No tiene mayor función el método main que iniciar al menu
	*/
	public static void main(){
		menu();
	}	//fin del main


	/*
	*	Método: menu
	*----------------------------------------------------------
	* Éste método tiene la función de servir de menu para la
	* selección de las múltiples opciones del programa
	*/
	public static void menu(){

		int selector;
		boolean salir = false;

		do{
			imprimeOpciones();
			System.out.println("seleccione una opcion: ");
			selector = scanner.nextInt();

			switch(selector){
				case 1:
					crearVector();
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				case 6:

					break;
			}

		}while(salir == false); //fin del ciclo do while

	}//fin del ciclo salir

	/*
	*	Método: imprimeOpciones
	*----------------------------------------------------------
	* Tiene la función de imprimir las opciones del sistema
	* hecho así para aumentar la legibilidad del método menu
	*/
	private static void imprimeOpciones(){
		System.out.println("	Sistema de ordenamiento del vector		\n");
		System.out.println("--------------------------------------------\n");
		System.out.println("1.-crear vector de una longitud n   		\n");
		System.out.println("2.-ordenar por bubble sort  				\n");
		System.out.println("3.-ordenar por selection sort 				\n");
		System.out.println("4.-ordenar por inserction sort 				\n");
		System.out.println("5.-ordenar por inserction Sort 				\n");
		System.out.println("6.-salir del programa						\n");
		System.out.println("--------------------------------------------\n");

	} //fin de imprimeOpciones


	/*
	* Método: crearVector
	*----------------------------------------------------------
	* éste método crea el vector principal de trabajo
	*/
	private static void crearVector(){
		int longitud;
		int menor;
		int mayor;

		System.out.println("\nIntroduzca la longitud del vector: ");
		longitud = scanner.nextInt();
		System.out.println("\n\nIntroduzca el valor menor para la generación aleatoria: ");
		menor = scanner.nextInt();
		System.out.println("\n\nIntroduzca el valor mayor para la generación aleatorio: ");
		mayor = scanner.nextInt();

		vector = new int[longitud];

		for(int i=0; i<longitud; i++)
			vector[i] = generadorRand(menor, mayor);


	}//fin crearVector


	/*
	* Método: swap
	*-----------------------------------------------------------------------------
	* esta funcion tiene el objetivo de intercambiar valores entre sí
	*/
	private static void swap(int indiceActual, int indiceSiguiente){
		int auxiliar;

		auxiliar = vector[indiceActual];
		vector[indiceActual] = vector[indiceSiguiente];
		vector[indiceSiguiente] = auxiliar;

	}		//fin swap

	/*
	* Método: generadorRand
	*-----------------------------------------------------------------------------
	* ésta funcion tiene el objetivo de crear valores al azar y asignarselos al
	* vector de trabajo
	*/
	private static int generadorRand(int menor, int mayor){
		int valor;
		Random aleatorio = new Random(System.currentTimeMillis());

		valor = aleatorio.nextInt(400);

		return valor;
	} //fin generadorRand


}
