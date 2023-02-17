package t02_controlling_program_flow;

public class IfElseTest {
	
	public static void main(String[] args) {
		boolean b = false;
		Boolean  b2 = true;
		if(b2 = false) {} // Compila, el resultado de la asignacion es un booleano
		
		int x = 3;
		if(x=3) {} // No compila, el resultado es una asignacion a un entero
		
		if((x=9) > 8) {} // Comila,  el resultado de la expresion es un booleano
		
		if(test()) {} // Compila, el resultado del metodo retrona un booleano
		
		if(esvoid()) {} // No compila el resultado del metodo retorna es un int
		
		if(true) { //Compila, es un if anidado
			
		}else if(false) {
			
		}else if(true) {
			
		}else  {}
		
		//No compila,  esto no es un if anidado
		if(false) {
			
		}else {
			
		}else {}
		
		// No compila
		if(true)
			System.out.println("1");
			System.out.println("1");
		else if(false) 
			System.out.println("1");
		
		
		//El codigo anteriror equivale a esto:
		if(true) {
			System.out.println("1");
		}
			System.out.println("1");
		else if(false) 
			System.out.println("1");
		
		//Compila
		if(false);
		{
			System.out.println("FIN");
		}
		
		//El codigo anteriror equivale a esto:
		if(false)
		;
		{	//Bloque de codigo
			System.out.println("FIN");
		}
				
	}

	

	private static Boolean test() {
		return false;
	}
	
	private static int esvoid() {
		return 0;
	}

}

//Pregunta 1
//What is the result of compiling and running the following program?
class Hexy {
	public static void main(String[] args) {
		int i = 42;
		String s = (i < 40) ? "life" : (i > 50) ? "universe" : "all";
		System.out.println(s);
	}
}

/*
A) null
B) life
C) universe
D) all				--> Respuesta
E) Compile Error
F) Runtime Exception.
*/

//Pregunta 2
//What is the result of compiling and running the following program?
class Fork {
	public static void main(String[] args) {
		Boolean b = false;
		if (b = true) {
			System.out.println("true");
		} else {
			System.out.println("else1");
		} else {
			System.out.println("else2");
		}
	}
}

/*
Choose one:
A) true
B) else1
C) else2
D) Compile Error  --> Respuesta
E) Runtime Exception
*/