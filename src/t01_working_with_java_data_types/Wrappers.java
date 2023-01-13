package t01_working_with_java_data_types;

//Los Wrappers son clases que representa a a los primitivos
public class Wrappers {
	
	public static void main(String[] args) {
		//---------------------------------------------------------------------------------------------------------------------------
		//El constructor admite un argumento y pude ser de su tipo primitivo o un String representando su valor;
		int pi0 = new Integer(1);
		Integer wi1 = new Integer(1);
		//Integer wi2 = new Integer("2r"); //Compila, pero lanza una excepcion en tiempo de ejecucion de tipo NumberFormatException
		
		//La clase Character solo admite el valor caracter 
		Character c1 = new Character('@');
		
		Boolean wb1 = new Boolean(true);
		Boolean wb2 = new Boolean("false");
		Boolean wb3 = new Boolean("asdasd"); //Compila pero asigna el valor false por defecto
		
		Long wl12 = (long)new Integer("5"); //Compila
		//Long wl13 = (Long)new Integer("5"); //Esto no compila
		
		//Esta forma de crear wrappers ya esta deprecada y en un futuro dejara de funcionar
		//Se recomienda utilizar el metodo Estatico valueOf
		
		//---------------------------------------------------------------------------------------------------------------------------
		//Metodo Estatico valueOf: Convierte un String o su valor correspondiente a Wrapper o Primitivo
		//Al igual que su contructor admite un argumento y pude ser de su tipo primitivo o un String representando su valor;
		//Este metodo Estatico con un argumento esta diponible para los Wrapper Byte; Short Intger, Long, Float y Double
		int pi1 = Integer.valueOf(1);
		Integer wi3 = Integer.valueOf(1);
		
		Byte wb12 =Byte.valueOf((byte)3); //Compila
		Integer wi4 = (int)Byte.valueOf((byte)3); //Compila
		int pi11 = Byte.valueOf((byte)3); //Compila
		//Byte wb13 =Byte.valueOf(3); //Esto no compila, por que el 3 es un entero
		Long wl3 = (long)Integer.valueOf(1); //Compila
		
		//Integer wi5 = Integer.valueOf("1r"); //Compila, pero lanza una excepcion en tiempo de ejecucion de tipo NumberFormatException
		
		//La clase Caracter solo admite el valor caracter 
		Character c2 = Character.valueOf('@');
		
		//El metodo estatico valueOf con dos argumentos en el tipo de base del primer argumento
		//Solo esta disponible para Wapers numericos enteros (Byte, Short, Intger y Long)
		//El primer argumento siempre tiene que ser un string
		Integer wi6 = Integer.valueOf("11",2); 	//Binario, no se indica el prefijo "OB"
		Integer wi7 = Integer.valueOf("10",8); 	//Octal, no se indica el prefijo "0"
		Integer wi8 = Integer.valueOf("7F",16); 	//Hexadecimnal, no se indica el prefijo "0X"
		//Integer wi9 = Integer.valueOf(10101,2); // Esto no compila, el primer argumento tiene que ser un string
		
		System.out.println(wi6);
		System.out.println(wi7);
		System.out.println(wi8);
		
		//---------------------------------------------------------------------------------------------------------------------------
		//El metodo xxxValue: Convierte un Wrapper a otro tipo de Wrapper o Primitivo
		Byte 	pb1 = wi3.byteValue();
		short 	ps1 = wi3.byteValue();
		Float 	pf1 = wi3.floatValue();
		double 	pd1 = wi3.doubleValue();
		
		System.out.println(pb1);
		System.out.println(ps1);
		System.out.println(pf1);
		System.out.println(pd1);
		
		//---------------------------------------------------------------------------------------------------------------------------
		//Metodo Estatico parseXXX: Convierte un String a Wrapper o Primitivo, y solo admite un solo argumento de tipo String
		//Este metodo Estatico con un argumento esta diponible para los Wrapper Byte; Short Intger, Long, Float y Double
		Integer wi10 = Integer.parseInt("5");
		int pi2 = Integer.parseInt("5");
		//Integer wi11 = Integer.parseInt(5); //Error de compilacion, solo admite String como valor
		//Integer wi12 = Integer.parseInt("Hola"); //Compila, pero lanza una excepcion de tipo NumberFormatException
		//Short ws1 = (short)Byte.parseByte("128"); //Compila. pero lanza una excepcion de tipo NumberFormatException, Byte solo admite el valor 127
		short ws1 = Byte.parseByte("-128"); //Compila
		
		//Integer compila = Integer.parseInt("44.55");	//Compila. pero lanza una excepcion de tipo NumberFormatException
		//Integer error = Integer.parseInt(44.55); //No compila, 
		
		
		//El metodo estatico parseXXX con dos argumentos indica en el tipo de base del primer argumento
		//Solo esta disponible para Wapers numericos enteros (Byte, Short, Intger y Long)
		//El primer argumento siempre tiene que ser un string
		Short wd1 = Short.parseShort("11",2); 	//Binario, no se indica el prefijo "OB"
		short pd2 = Byte.parseByte("10",8); 	//Octal, no se indica el prefijo "0"
		Long wl1 = Long.parseLong("7F",16); 	//Hexadecimnal, no se indica el prefijo "0X"
		
		//Autoboxing
		Double wd5 = new Double(5);
		wd5++;
		System.out.println(wd5);
	
		//---------------------------------------------------------------------------------------------------------------------------
		//Metodo Estatico toString: Convierte un  Wrapper o Primitivo a String, y solo admite valores tipo Wrapper o primitivo
		//Este metodo Estatico acepta las 8 clases Wrapper
		String s1 = Byte.toString((byte)3);
		//String s2 = Short.toString(3); // Error de compilacion
		String s3 = Integer.toString(new Integer(1)); //Compila
		String s4 = Short.toString(Short.valueOf((short)2)); //Compila
		
		//El metodo estatico toString con dos argumentos indica en el tipo de base del primer argumento
		//Este metodo Estatico con un argumento esta diponible para los Wrapper Integer y Long
		String s5 = Integer.toString(11, 2); //Compila
		String s6 = Integer.toString(10, 8); //Compila
		//String s7 = Integer.toString(7f, 16); //No Compila
		
		System.out.println(s5);
		System.out.println(s6);
	}

}

//What is the result of compiling and running the following program?
class Test {
	static public void main(String[] args) {
		try {
			//int k = Integer.parseInt(55.58); //Error de compilacion, el metodo estatico parseInt solo acepta como angumento un String
			//System.out.println(k);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

/*
Choose one:
A) 55
B) 56
C) NumberFormatException.
D) ArrayIndexOutofBoundsException.
E) Compile Error --> Respuesta
*/
