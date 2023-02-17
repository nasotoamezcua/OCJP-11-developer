package t02_controlling_program_flow;

public class SwirchTest {
	
	
	public static void main(String[] args) {
		
		//What is the result of compiling and running the following program?
		long val = 2;
		int in = 5;
		switch (val) {
		default:
			System.out.print("default ");
		case 1:
			System.out.print("1 ");
			break;
		case 2:
			System.out.print("2 ");
			break;
		}
		/*
		Choose one:
		A) Print: default
		B) Print: 1 2
		C) Print: default 1 2
		D) Print: default 1
		E) Compile Error --> Respuesta
		*/
		
	}

}


//What is the result of compiling and running the following program?
class Flipper {
	public static void main(String[] args) {
		var c = "RED".toLowerCase();
		String o = "-";
		switch (c) {
		case "yellow":
			o += "y";
		case "red":
			o += "r";
		case "green":
			o += "g";
		}
		System.out.println(o);
	}
}
/*
Choose one:
A) -
B) -r
C) -rg --> Respuesta
D) Compile Error
E) Runtime Exceptionx
*/