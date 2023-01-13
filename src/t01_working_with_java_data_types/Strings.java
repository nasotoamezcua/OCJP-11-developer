package t01_working_with_java_data_types;

import java.util.Iterator;

public class Strings {
	
	public static void main(String[] args) {
		
		//Los objetos String son inmutables, no se pueden cambiar su valor
		//Nota: la clase String es final por tanto no se puede extender de ella
		
		
		String s = "abc";					//Crea un Objeto String abc en la String Constant Pool y lo referencia a la variable s
		String s2 = s;						//s2 hace referencia al objeto s que se encuentra en la String Constant Pool
		s = s.concat("def");				//Crea un Objeto String abcdef en la String Constant Pool y lo referencia a la variable s
		System.out.println(s); 				// 	Impirme abcdef12345
		System.out.println(s2);				//	Impirme def		
		
		String x = "Java";					//Crea un Objeto String "Java" en la String Constant Pool y lo referencia a la variable x
		x.concat(" Rules! ");				//Crea un Objeto String Rules! en la String Constant Pool.
		System.out.println("x = " + x);		// Imprime Java, ya que x.concat(" Rules! "); no hace nuevamente una referencia a la variable x
		
		String s3 = "hola";					//Crea un nuevo objeto en la String Constant Pool y lo referencia a la variable s3
		String s4 = "hola";					// No crea un nuevo objeto, por que el literal "hola "ya existente en la String Constant Pool y lo referencia a la variable s4
		
		System.out.println(s3.equals(s4)); 	//Impirme true ambos contienen el mismo valor
		System.out.println(s3 == s4);		//Imprime true ambos hacen referencia al mismo objeto
		
		String s5 = "12345";				//Crea un objeto en la String en la String Constant Pool y lo referencia a la variable s5
		String s6 = new String("12345");	//Crea dos objetos uno en el heap new String() y el literal 12345 en la String Constant Pool.
		
		System.out.println(s5.equals(s6)); 	//Impirme true ambos contienen el mismo valor
		System.out.println(s5 == s6);		//Imprime false s4 y s5 hacen referencia a diferentes objetos
		
		
		//Metodo charAt
		System.out.println(s5.charAt(2));	//El numero Indica Indice (inicia en 0) no Pocision (inicia en 1)
		
		//Metodo Length
		//Nota: El metodo length() es para cadenas String, el length sin () es para arreglos
		System.out.println(s5.length());
		
		//Metodo substring
		System.out.println(s5.substring(2)); //Imprime 345: El numero Indica Indice (inicia en 0)
		System.out.println(s5.substring(1,4)); //Imprime 234: El primer parametro indica Indice, el segundo parametro Pocision.
		
		//Metodos Nuevos para Java 11
		
		//Metodo Repeat: repite la cadena tantas veces como lo proporciona el parámetro
		System.out.println(s5.repeat(3)); //Imprime tres veces el mismo valor de s5
		
		//Metodo Lines: Usa un Spliterator para proporcionar perezosamente líneas desde la cadena fuente
		String s7 = new String("Nestor\nAlejandro\nSoto\nAmezcua");
		
		//Forma tradicional
		Iterator<String> cadenas = s7.lines().iterator();
		while(cadenas.hasNext()) {
			System.out.println(cadenas.next());
		}
		
		//utilizando stream
		s7.lines().forEach(System.out::println);
		
		// Metodo isBlank(): Indica si la cadena está vacía o solo contiene caracteres de espacio en blanco
		System.out.println("".isBlank()); 		//Imprime true
		System.out.println("     ".isBlank());	//Imprime true
		
		//Metodo strip()- Elimina los espacios en blanco al principio y el final de la cadena, tambien reconoce caracteres unicode que representa un epacio en blanco: \u2001		
		System.out.println(" Hola ".strip());
		System.out.println(" \u2001Hola\u2001 ".trim());
		System.out.println(" \u2001Hola\u2001 ".strip());
		
		//Metodo stripLeading: Elimina los espacios en blanco desde el principio
		System.out.println(" Hola ".stripLeading());
		
		//Metodo stripTrailing: Elimina el espacio en blanco del final
		System.out.println(" Hola ".stripTrailing());
		
	}

}

//Pregunta 1
//Having the following code
class Hedges {
	public static void main(String[] args) {
		String s = "JAVA";
		s = s + "ocp11";		//	JAVAocp11
		s = s.substring(4, 8);	//	ocp1
		s.toUpperCase();		// OCP1 Pero este valor ya no queda refeenciado a s
		System.out.println(s);
	}
}
/*
Choose one
A) JAVA
B) JAVAOCP11
C) rocks
D) ocp1 --> Respuesta
E) OCP11
F) OCP1
G) Error de Compilación
*/

//Pregunta 2
//Having the following code
class Mounds {
	public static void main(String[] args) {
		String s = new String();			// 1 
		for (int i = 0; i < 1000; i++) {
			s = new String(" " + i);		// 1ra iteracion se crean  3 objetos
											// 2da iteracion se crean  2 objetos
											// 3ra iteracion se crean  2 objetos
		}
		//end of for loop
	}
}
/*
About how many objects will exist in memory when the for loop ends?
A) Less than 10
B) About 1000
C) About 2000 --> Respuesta
D) About 3000
E) About 4000
*/