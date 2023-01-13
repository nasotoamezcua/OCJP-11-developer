package t01_working_with_java_data_types;

public class Primitivos {
	
	private int i; 		
	private boolean b; 	
	private double d;	
	private String s;	
	private char c;		
	
	public static void main(String[] args) {
		
		Primitivos primitivo = new Primitivos();
		System.out.println(primitivo.i);		//Valor 0 por defecto
		System.out.println(primitivo.b);		//Valor false por defecto
		System.out.println(primitivo.d);		//Valor 0.0 por defecto
		System.out.println(primitivo.s);		//Valor null por defecto
		System.out.println(primitivo.c);		//Valor 'caracter en blanco' por defecto
		
		int x; 
		//System.out.println(x); //Error de compilñacion. Las variables locales siempre deben de ser inicializadas antes de ser utilizadas
		
		//Literales Enteros: Decimales, Binarios(Prefijo OB), Octales(prefijo 0), Hexadecimales (Prefijo 0X)
		//Por defecto los numeros decimales son int
		int decimal = 1223456;
		int binario = 0B11; 	//Solo acepta 0 y 1
		int octal = 010;		//Solo acepta del 0 al 7
		int hexadecimal = 0x7F;	//Solo acepta del 1 al 9 y de a al f (Pueden minusculas o mayusculas)
		
		System.out.println(decimal);	
		System.out.println(binario);	
		System.out.println(octal);	
		System.out.println(hexadecimal);	
		
		//formato underscore: solo se puede colocar en medio del valor y no al inicio ni al final
		int unMillon = 1_000_000;
		
		//Representar long: debes agregar la letra l o L al final
		long v1 = 493l;
		
		//Literales de punto flotante: Por defecto los numeros decimales son double
		double d1 = 2323.2323;
		double d2 = 2323.2323D;
		
		//float f1 = 2323.2323 // Error de compilacion. Los numeros decimales son double por defecto.
		float f1 = 2323.2323f;
		
		//Literales Boleanos: solo aceptan valores true y false
		boolean t = true;
		
		//Literales de Caracteres: Representa un solo caracter en comillas simples
		
		char letraA = 'a';
		char arroba = '@';
		
		//Puede escribir el valor Unicode del carácter con el prefijo correspondiente
		char letraN = '\u004E'; // es la letra N
		
		//Los caracteres son enteros sin signo de 16 bits está en el rango de 0 a 65535.
		char cDecimal = 921;
		char cOctal = 0x892;
		
		//Casteo Implicito 
		byte b = 9;
		int i = b;
		
		//Casteo Explicito
		double d = 100.01;
		int ii = (int)d; 
		
		//Compila 
		byte b1 = 3;
		b += 7;
		
		//No compila
		byte b2 = 3;
		//b2 = b2 + 7; //Esta operacion representa un int
		b = (byte) (b + 7); //Es necesario realizar un castep explicito
		
		//De entero a punto fotante admite  casteos impicitos y explcitios
		double dou = 1234565678987654355L;
		
		// De punto flotante a entero solo se admiten casteos explcitios
		int in = (int)12344.45f;
		
	}
}

//Pregunta 1
//What is the first line to throw compilation error?
class Fishing {
	byte b1 = 4;
	int i1 = 123456;
	long L1 = (long)i1; // line A
	short s2 = (short)i1; // line B
	byte b2 = (byte)i1; // line C
	int i2 = (int)123.456; // line D
	//byte b3 = b1 + 7; // line E
}
/*
A) Line A
B) Line B
C) Line C
D) Line D
E) Line E --> Respuesta
*/

//Pregunta 1
//What is the result of compiling and running the following program?
class Dark {
	int x =3;
	
	public static void main(String [] args){
		new Dark().go1();
	}
	
	void go1() {
		int x;
		//go2(++x); // Error de Compilacion, la variable local x no fue inicializada
	}
	
	void go2(int y) {
		int x = ++y;
		System.out.println(x);
	}
}

/*
A) 2
B) 3
C) 4
D) 5
E) Compile Error --> Respuesta
F) Runtime Exception
*/

//What is the result of compiling and running the following program?
class Boxing2 {
	static Integer x = 0;

	public static void main(String[] args) {
		x++;
		doStuff(x);
	}

	static void doStuff(int z) {
		int z2 = 4;
		System.out.println(z2 + z);
	}
}

/*
Choose an answer:
A) 0
B) 5 --> Respuesta
C) Arroja una excepción: NullpointerException.
D) El código no compila.
E) No imprime nada.
*/