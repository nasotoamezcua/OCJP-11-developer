package t03_java_object_oriented;


class Prueba{
	int x = 4; //Variable de Instancia
	static int  vS = 2; //Variable de clase o estatica
	
	{
		int i=3;
	}
	
	static {
		//static int e=4; // No compila
		int i=3;
	}
}

public class AmbitoVariableTest {
	
	
	public static void main(String[] args) {
		
		int _a;
		int $c;
		int ______2_w;
		int _$;
		int this_is_a_very_detailed_name_for_an_identifier;
		
		{ // Bloque de codigo
			var mensaje  = "Hola mundo";
			System.out.println(mensaje);
		}
		
		static { //No compila
			var mensaje  = "Hola mundo";
			System.out.println(mensaje);
		}
		
		Prueba _prueba = new Prueba();
		_prueba.vS =  3;
		Prueba.vS = 4;
		
		Prueba _prueba2 = new Prueba();
		_prueba2.vS = 5;
		
		System.out.println(_prueba.vS);
		System.out.println(_prueba2.vS);
			
		
	}
	
	

}
//Un metodo o bloque estatico no puede  acceder  a una variable o metodo de instancia
class ScopeTest {
	String name;
	
	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(this.name);
	}
	
	static {
		System.out.println(name);
		test();
	}
	
	public void test() {
		System.out.println(this.name);
	}
}

//Pregunta 1
//What is the result of compiling and running the following program?

class Pass {
	public int x;

	public static void main(String[] args) {
		x = 5;
		Pass p = new Pass();
		p.doStuff(x);
		System.out.print(" main x = " + x);
	}

	void doStuff(int x) {
		System.out.print(" doStuff x = " + x++);
	}
}

/*
A) Compile Error	--> Respuesta
B) Runtime Exception
C) doStuff = 6 main x = 6
D) doStuff = 5 main x = 5
E) doStuff = 5 main x = 6
F) doStuff = 6 main x = 5
*/

//Pregunta 2
//What is the result of compiling and running the following program?
class Iteration {
	public static void main(String[] args) {
		int x = 5;
		for (int y = 0; y < 1; y++) {
			System.out.print(" x = " + x);
		}
		System.out.print(" y = " + y);
	}
}

/*
A) Compile Error	--> Respuesta
B) Runtime Exception
C) Print: x = 5 y = 1;
D) Print: x = 5 y = 0;
E) Print: x = 5 y = 2;
*/