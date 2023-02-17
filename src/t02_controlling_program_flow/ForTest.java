package t02_controlling_program_flow;

public class ForTest {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i is " + i);
		}
		
		for (int x = 10, y = 3; y > 3; y++) {
		}
		
		for (int x = 0, y = 0; ((((x < 10) && (y-- > 2)) | x == 3)); x++) {
		}
		
		/*
		for (; ;) {
		}
		*/
		
		int i = 0;
		for (; i < 10;) {
			i++;
		}
		
		for (int a = 0, j = 0; (a < 10) && (j < 10); a++, j++) {
			System.out.println("i is " + a + " j is " + j);
		}
		
		//Casos en los que no compila
		
		for (int x = 1; x < 2; x++) {
		System.out.println(x); // Legal
		}
		System.out.println(x); // No Compila, x es ahora fuera de este ámbito y no puede ser accesado
		
		for (int x = 0; (x > 5), (y < 2); x++) { } // No compila, hay mas de 1 expresion boolean
		
		// Variables
		int x;
		long x2;
		int [] ia = {4, 5, 6};
		Long [] La = {4L, 5L, 6L};
		long [] la = {7L, 8L, 9L};
		int [][] twoDee = {{1,2,3}, {4,5,6}, {7,8,9}};
		String [] sNums = { "one", "two", "three"};
		Animal [] animals = { new Dog(), new Cat()};
		// DECLARACIONES LEGALES DE for
		for(long a : ia); // Una  variable log  puede ser declarada para un arreglo de enteros
		for(int ia2 : la); // Una  variable entera  puede ser declarada para un arreglo de longs
		for(long y : la ) ; // Variable long para un arreglo long
		for(long lp : La) ; // Autoboxing, variable de tipo long para un arreglo de una clase Long
		for(int[] n : twoDee) ; // Recorrer un arreglo de arreglos
		for(int n2 : twoDee[2]) ; // Recorre el ultimo elemento
		for(String s : sNums) ; // Recorre un arreglo de Sttrings
		for(Object o : sNums) ; // Un tipo Objet puede recorrer una arreglo de Strings
		for(Animal a : animals) ; // set an Animal reference to each element
		
		
		// DECLARACIONES ILEGALES DE for
		for(x2 : la) ; // No compila, x2 no esta declarada
		for(int x2 : twoDee) ; // No compila, no se puede meter una matriz en un tipo int
		for(int x3 : la) ; // No compila, un int no puede recorrer un arreglo de long
		for(Dog d : animals) ; // No compila, un  objeto tipo Gato no puede recorrer un areglo de Animales
		
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal {}

//What is the result of compiling and running the following program?
class TestFor {
	public static void main(String[] args) {
		for (int x = 1; x < 2; x++) {
			System.out.print(x);
		}
		System.out.print(x);
	}
}
/*
Choose one:
A) 11
B) 12
C) Compile Error --> Respuesta
D) Runtime Exception
*/

//What is the result of compiling and running the following program?
class TestFor2 {
	public static void main(String[] args) {
		int y = 1;
		for (int x = 0; (x < 5), (y < 2); x++) {
		System.out.print(x);
		}
	}
}
/*
Choose One:
A) 01234
B) Compile Error --> Respuesa
C) No print
D) Runtime Exception
*/