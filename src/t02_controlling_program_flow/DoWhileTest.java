package t02_controlling_program_flow;

public class DoWhileTest {
	
	public static void main(String[] args) {
		
		boolean b = false;
		
		do {
			System.out.print("print");
		} while (b); // Es necesario que termne en ; si no maca error de  compilacion
		
	}
	
	

}
//Pregunta 1
//What is the result of compiling and running the following program?
class TestDoWhile1 {
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.print(++i);
		} while (i < 3)
	}
}
/*
Choose one:
A) Runtime Exception 
B) Compile Error --> Respuesta
C) 012
D) 123
*/

//Pregunta 2
//What is the result of compiling and running the following program?
class TestDoWhile2 {
	public static void main(String[] args) {
		do {
			System.out.print("Hello");
		} while (false);
	}
}
/*
Choose one:
A) Runtime Exception
B) Hello --> Respuesta
C) No print
D) Compile Error
*/