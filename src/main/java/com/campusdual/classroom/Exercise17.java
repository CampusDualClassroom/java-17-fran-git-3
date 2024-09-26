package com.campusdual.classroom;

public class Exercise17 {

	// Método para crear un array de enteros vacío (sin inicializar)
	public static int[] createEmptyIntArray(int positions) {
		return new int[positions]; // Devuelve un array de enteros de la longitud especificada
	}

	// Método para crear y devolver un array de String inicializado con números como cadenas
	public static String[] createInitializedStringArray() {
		return new String[] {"1", "2", "3"}; // Devuelve un array de String con "1", "2", "3"
	}

	// Método para asignar un valor a un índice específico en un array de enteros
	public static void populateArray(int[] array, int index, int value) {
		if (index >= 0 && index < array.length) { // Comprobar que el índice está dentro de los límites
			array[index] = value; // Asigna el valor al índice especificado
		}
	}

	// Método para obtener la longitud de un array de enteros
	public static int arrayLength(int[] array) {
		return array.length; // Devuelve la longitud del array
	}

	// Método para mostrar el valor en un índice específico de un array de enteros
	public static void showValue(int[] array, int index) {
		if (index >= 0 && index < array.length) { // Comprobar que el índice está dentro de los límites
			System.out.println(array[index]); // Muestra el valor en el índice especificado
		} else {
			System.out.println("Índice fuera de límites"); // Mensaje si el índice está fuera de límites
		}
	}

	// Método main para probar la funcionalidad
	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
		String[] stringArray = createInitializedStringArray();

		// Poblamos el array de enteros
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);

		// Mostramos el valor en el índice 0
		showValue(intArray, 0);

		// Mostramos la longitud del array
		System.out.println(arrayLength(intArray));
	}
}
