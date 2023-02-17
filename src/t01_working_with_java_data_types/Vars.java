package t01_working_with_java_data_types;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Vars {
	//Apartir de Java 10 es  posible utilizar var
	
	//var lerta = ""; No compila, var no puede ser utilizadas para variables de instancia.
	//static vor alerte = "";  No compila, var no puede ser utilizadas para variables de clase.
	
	//var se puede  utilizara en un bloque de un constructor
	public Vars() {
		var saludo = "hola";
	}

	// var no puede ser utilizado como declaracion de constructores
	public Vars(var a) {
	}

	// var se puede utilizara en un bloque de inicializacion de instancia
	{
		var saludo = "hola";
	}

	// var se puede utilizara en un bloque de inicializacion de clase
	static {
		var saludo = "hola";
	}
	
	public static void main(String[] args) {
		
		//var solo es de uso local y tiene que ser declrada e inicializada en la misma sentencia.
		var saludo = "Hola";
		
		/*Tipado
		boolean ready = true;
		char ch = '\ufffd';
		long sum = 0L;
		String label = "wombat";
		*/
		
		// Con VAR
		var ready = true;
		var ch = '\ufffd';
		var sum = 0L;
		var label = "wombat";
		
		//NO ES JAVASCRIPT!!!!!
		var number = 7;
		number = 4;
		//number = "five"; // No compila, no se puede cambiar de un int a un string
		
		
		
		//
		var apples = (short)10;
		apples = (byte)5;
		//apples = 1_000_000; // No compila, se pede cambiar de un short a un int
		
		var n = "myData";
		n = null; 		// Se puede asignar null a un var, siempre y cuando este se haya deducido cómo objeto.
		var m = 4;
		m = null; 		// NO compila porque esta declarado como primitivo y no se le puede asignar un null
	}
	
	
	//Codigo mas Legible
	//Sin Var
	void removeMatches1(Map<? extends String, ? extends Number> map, int max) {
		for (Iterator<? extends Map.Entry<? extends String, ? extends Number>> iterator = map.entrySet()
				.iterator(); iterator.hasNext();) {
			Map.Entry<? extends String, ? extends Number> entry = iterator.next();
			if (max > 0 && matches(entry)) {
				iterator.remove();
				max--;
			}
		}
	}

	//Con var
	void removeMatches2(Map<? extends String, ? extends Number> map, int max) {
		for (var iterator = map.entrySet().iterator(); iterator.hasNext();) {
			var entry = iterator.next();
			if (max > 0 && matches(entry)) {
				iterator.remove();
				max--;
			}
		}
	}

	private boolean matches(Entry<? extends String, ? extends Number> entry) {
		return false;
	}
	
	// y 
	public void doesThisCompile(boolean check) {
		var question;	// Tiene que ser declrada e inicializada en la misma sentencia.
		question = 1;
		var answer;		// No compila ,porque no han sido inicializada
		if (check) {
			answer = 2;
		} else {
			answer = 3;
		}
		System.out.println(answer);
	}
	
	
	public void twoTypes() {
		var a = 2, b = 3; 	// El var no permite declaraciones multiples.
		int c, var d = 3; 	// No se puede mesclar declaraciones multiples con variables de tipado y var.
		var n = null; 		// El var no puede inicializar  en null
	}
	
	//var no puede ser utilizado como declaracion de metodos
	public int addition(var a, var b) { 
		return a + b;
	}

}
// var noes una palabra reservada, es un nombre de tipo reservado, quiere decir que no lo puedes usar para definir Clases, Interfaces o enum
//package var; 				// var puede ser utilizado para nombrar un paquete
class Var {
	public void var() {		// var puede serutilizado para nombrar un metodo
		var var = "var";	// var puedeser utilizado para nombrar una variable var
	}

	public void Var() {
		Var var = new Var();
	}
}

class var { 		// No compila,var no puede ser utilizado para declaracion de clases
	public var() { 
	}
}

interface var {} 	// No compila,var no puede ser utilizado para declaracion de interfaces

enum var {} 		// No compila,var no puede ser utilizado para declaracion de enum

//Pregunta 1

//Which of the following code snippets about var compile without issue when used in a method?
//Choose all that apply:
class Pregunta1 {
	public static void main(String[] args) {
		var spring = null;					//A, No compila
		var fall = "leaves";				//B, Compila
		var evening = 2; evening = null;	//C, No  compila
		var night = new Object();			//D, Compila
		var day = 1/0;						//E, Compila, pero lanara un  error en tiempo de ejecucion
	}
}

//Repuesta B D y E Compilan sin errores


//What is the result of compiling and running the following program?
class Varians {
	public static void main(String[] args) {
		int i = 1;
		i = 2;
		var v = i;
		v = 5;
		v = 5.5; 				//No compila por que quiere quiere asignar un double a un int de forma implicita
		System.out.println(v);
	}
}
/*
Choose one:
A) Compile Error --> Respuesta
B) Print “5.5”
C) Print “5”
D) Print “2”
*/
