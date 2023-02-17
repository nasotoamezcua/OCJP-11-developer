package t02_controlling_program_flow;

public class WhileTest {
	
	public static void main(String[] args) {
		
		boolean b = true;
		
		//-------------------------------------------------------------------------------------
		// Compila, pero es  un ciclo infinito
		while(b) {
			System.out.println("1");
		}
		System.out.println("2");
		
		//-------------------------------------------------------------------------------------
		// Error de compilacion, codigo inancalzable (Unreachable code), el valor de la varibae a no va a cambiar
		final boolean a =  true;
		while(a) {
			System.out.println("1");
		}
		System.out.println("2");
			
		//-------------------------------------------------------------------------------------
		// Error de compilacion, codigo inancalzable (Unreachable code)
		while(true) {
			System.out.println("1");
		}
		System.out.println("2");
		
		
		//-------------------------------------------------------------------------------------
		//while(int x = 3){} // No compila, espera que el resultado de la expresion sea  boolean
		
		//-------------------------------------------------------------------------------------
		//while(metodoSinRetorno()){} //No compila, espera que el metodo regrese  un resultado boolean
		
		
	}
	
	public static void metodoSinRetorno(){}
	

}

//What is the result of compiling and running the following program?
class Test1 {
	public static void main(String[] args) {
		float i = 0;
		final byte j = 5;
		final short s = 3;
		while (i < 2) {
			switch ((int) i + 5) { // 1
			default: // 2
			case j:
				System.out.print("1"); // 3
				break;
			case s + 1: // 4
			{
				System.out.print("2");
				break;
			}
			}
			i++;
		}
	}
}

/*
Choose one:
A) Print: 22
B) Print: 11	--> Respuesta
C) No print
D) Compile Error on line 4
*/

//What is the result of compiling and running the following program?
class Test2 {
	public static void main(String[] args) {
		int i = 0;
		while (i = 4) {
			System.out.print(++i);
		}
	}
}
/*
Choose one:
A) 1234
B) 11
C) Compile Error	--> Respuesta
D) Compiles and runs without errors
E) 5555
*/