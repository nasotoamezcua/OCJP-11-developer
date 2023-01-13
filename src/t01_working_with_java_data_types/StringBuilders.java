package t01_working_with_java_data_types;

public class StringBuilders {
	
	// StringBuilder es la version mejorada de StringBufer, StringBufer ya no se ve en la certificacion de Java 11
	// Estas clases no recargan la String Constant Pool por lo tanto sus cadenas son MUTABLES
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("A");
		sb.append("B");
		sb.append("C");
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		//sb.append(new String(new String("hola"))); //Compila OK
		
		sb.append(1999);
		System.out.println(sb);
		
		//Metodo Delete
		sb.delete(1, 3); //Borra valores de la cadena y recibe dos parametors: Indice, Pocision
		
		//Metodo Insert
		sb.insert(3, "1"); //Inserta valores a la cadena y recibe dos parametros: Indice, Valor a insertar
		System.out.println(sb);
		
		//Metofo Rverse: //Invierte el resultado de la cadena
		StringBuilder sb2 = new StringBuilder("hola");
		sb2.reverse();
		System.out.println(sb2);
		
		//Este metodo esta disponoible apartir de Java 11
		// Metodo compareTO: Este metodo regresa un valor int
		
		//Imprime 0, si el contenido de la comparacion es el mismo
		StringBuilder sb01 = new StringBuilder("Java"); 
		StringBuilder sb02 = new StringBuilder("Java");
		
		int comparacion = sb01.compareTo(sb02);
		System.out.println(comparacion);
		
		/* 
		  Imprime un numero positivo, Si elprimero es lexicograficamente mayor que el segundo
		  StringBuilder sb01 = new StringBuilder("Zava"); //sb01 es mayor lexicograficamente que sb02 Imprime 16
		  StringBuilder sb02 = new StringBuilder("Java");
		  
		  Imprime un numero negativo, Si elprimero es lexicograficamente menor que el segundo
		  StringBuilder sb01 = new StringBuilder("Aava"); //sb01 es menor lexicograficamente que sb02 Imprime -9
		  StringBuilder sb02 = new StringBuilder("Java");
		*/
		
		
		
	}

}

//What is the result of compiling and running the following program?
class Mutant {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");	//abc
		sb.reverse().append("d");						// cbad
		System.out.println("." + sb);					//.cbad
	}
}
/*
Choose one:
A) Compile Error
B) Print “.dbac”
C) Print “.bcad”
D) Print “.cbad” --> Respuesta
*/

//What is the result of compiling and running the following program?
class Theory {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = sb1;
		sb1.append("d");
		System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
	}
}
/*
Choose one:
A) Compile Error
B) Print “abcd abc false”
C) Print “abcd abcd true” --> Respuesta
D) Print “abcd abcd false”
*/

