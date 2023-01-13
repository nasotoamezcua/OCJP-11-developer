package t01_working_with_java_data_types;

public class Operadores {
	
	public static void main(String[] args) {
		//---------------------------------------------------------------------------------------------------------------------------
		//Operadores Compuestos: -=, +=, /=, *=
		
		int y = 10;
		int x = 10;
		
		y-= 6;		//y = y - 6		
		x*= 2 + 5;	// x = x * (2+5)
		
		System.out.println(y);
		System.out.println(x);
		
		//---------------------------------------------------------------------------------------------------------------------------
		//Operadores relacionales: <, <=, >, >=, ==, y !=.
		
		Boolean b2 = Boolean.valueOf("true");
		int x2 = 8;
		boolean b = 3 > 2;
		
		if(x2 < (9+1) * 2) {}
		if(b2 == true) {}
		if(b2 = false) {}
		
		//if(x2 = 80) {} //No compila
		if(3 < (x2 = 80)) {}
		
		//---------------------------------------------------------------------------------------------------------------------------
		//Operadores Aritmeticos +, -, *, /, %
		//Recordar que por defecto las expresiones son evaluadas de izquierda a derecha. Si se quiere condicionar se debe utilizar los paréntesis “( )”. 
		//Recordar también que el *, / y % tienen mayor precedencia que el + y -.
		
		//---------------------------------------------------------------------------------------------------------------------------
		//Operadores de incremento y decremento
		
			int jugadores = 0;
			System.out.println("Jugadores en linea: " + jugadores++);
			System.out.println("El valor de jugadores es " + jugadores);
			System.out.println("El valor de jugadores es ahora " + ++jugadores);
			
		//---------------------------------------------------------------------------------------------------------------------------
		//Operadores Logicos &, |, ^ (Binarios) y !, &&, || (Corto Circuito)
			int z = 5;
			if(++z > 5 || ++z > 6){ // || Si es true, no evalua la segunda expresion
				z++;
			}
			
			System.out.println(z);
			
			int zo = 5;
			if(++zo > 5 | ++zo > 6){ // | Si es true, evalua la segunda expresion
				zo++;
			}
			
			System.out.println(zo);
			
			int r = 5;
			if(++r > 20 && ++r > 6){ // && Si es false, no evalua la segunda expresion
				r++;
			}
			
			System.out.println(r);
			
			int ro = 5;
			if(++ro > 20 & ++ro > 6){ // && Si es false, evalua la segunda expresion
				ro++;
			}
			
			System.out.println(ro);
			
		
		//---------------------------------------------------------------------------------------------------------------------------
		//Operador Condicional o Ternari
			int nroDeMascotas = 3;
			int limiteDeMascotas = 10;
			String status = (nroDeMascotas < 4) ? "Límite de mascotas no excedido"
			: "Demasiadas mascotas";
			System.out.println("El estado es: " + status);
			
			//Es posible anidar el operador ternario
			String status2 = (nroDeMascotas < 5) ? "Cantidad de Mascotas OK"
													: (nroDeMascotas < limiteDeMascotas)
														? "Mascotas cerca al límite"
																: "Demasiadas mascotas";
			System.out.println("El estado es: " + status2);
		
		//---------------------------------------------------------------------------------------------------------------------------
		//Operador instanceOf
		Perro p = new Perro();
		boolean esTrue = p instanceof Animal;
		boolean esTrue2 = p instanceof Domesticable;
		System.out.println(esTrue);
		System.out.println(esTrue2);
		
		//No se puede usar el operador instanceof para evaluar dos diferentes jerarquías de clase
		/*
		class Cat {}

		class Dog {
			public static void main(String[] args) {
				Dog d = new Dog();
				System.out.println(d instanceof Cat); //Error de Compilacion
			}
		}
		*/
		
	}

}

class Animal {}
interface Domesticable {}
class Perro extends Animal implements Domesticable {}

//Pregunbta 1
//What is the result of compiling and running the following program?
class OpTest1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		a %= b; //a = a%b = 5%2 = 1
		a /= b; // a = a/b = 1/2 = 0.5 = 0
		b = a > 0 ? 0 : a; // b=0, a=0
		System.out.println(a + " " + b);
	}
}
/*
Choose one:
A) 1 0
B) 1 1
C) 2 2
D) 0 0 --> Respuesta
*/

//Pregunta 2
//What is the result of compiling and running the following program?
class OpTest2 {
	public static void main(String[] args) {

		int output = 10;
		boolean b1 = false;
		
		if ((b1 == true) & ((output += 10) == 20)) {
			System.out.println("We are equal" + output);
		} else {
			System.out.println("Not equal" + output);
		}

	}
}

/*
Choose one:
A) Compile Error
B) Print “We are equal 10”
C) Print “Not equal 20” --> Respuesta
D) Print “Not equal 10”
*/