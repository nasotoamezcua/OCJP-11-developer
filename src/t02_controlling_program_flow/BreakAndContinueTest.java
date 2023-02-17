package t02_controlling_program_flow;

public class BreakAndContinueTest {
	public static void main(String[] args) {
		for1:
		for (int i = 0; i < 2; i++) {
			System.out.println("for i");
			for2:
			for (int j = 0; j < 2; j++) {
				System.out.println("for j");
				for3:
				for (int k = 0; k < 2; k++) {
					System.out.println("for k");
					//continue for1;
					break for1;
					
				}
			}
		}
		System.out.println("FIN");
	}
}

//Which of the following code snippets can be inserted at the specified location 
//for the program to continue with the next iteration of the outer loop?

class TestFor1{
	public static void main(String[] args) {
		outer: for (int x = 0; x < 3; x++) {
			middle: for (int y = 0; y < 3; y++) {
				inner: for (int z = 0; z < 3; z++) {
					if (y == 1) {
						// insert here
					}
				}
			}
		}
	}
	
}

/*
Choose one:
A) break;
B) break middle; --> Respuesta
C) break outer;
D) continue;
E) continue middle;
*/


//What is the result of compiling and running the following program?
class Wind {
	public static void main(String[] args) {
		foreach: for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 3; k++) {
				System.out.print(" " + j);
				if (j == 3 && k == 1)
					break foreach;
				if (j == 0 || j == 2)
					break;
			}
		}
	}
}
/*
Choose one:
A) 0123
B) 11133
C) 0111233 --> Respuesta
D) 11133444
E) Compile Error
*/