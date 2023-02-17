package t02_controlling_program_flow;

public class ComparaBuclesTests {
	
	public static void main(String[] args) {}

}

//Pregunta 1
//What is the result of compiling and running the following  program?
class TestWhile{
	public static void main (String[] args){
		while(true){
			for (int x = 1; x < 2; x++) {
				System.out.println("hello");
			}
		}
		System.out.print("end");
	}
}
/*
Choose one:
A) Print end
B) Print the word hello infinite times
C) Print hello once and then end
D) Compile Error --> Respuesta
*/

//Pregunta 2
//What is the result of compiling and running the following program?
class TestDoWhile {
	public static void main(String[] args) {
		int i = 3;
		do {
			System.out.println("loop");
			i = i - 3;
		} while (i == 3);
		System.out.println("end");
	}
}
/*
Choose one:
A) Print loop and then end --> Respuesta
B) Print loop infinite times
C) Compile Error
D) Print only end
*/