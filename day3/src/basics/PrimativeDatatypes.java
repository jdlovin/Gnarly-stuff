/*
 * The first line
 * is the package declaration 
 * More lines
 * And more lines and more Java projects
 */

package basics;

public class PrimativeDatatypes {
	
	public static void main(String[] args) {
		byte b = (byte)1000;
		System.out.println(b);
		
		short s = 1000;
		int i = 2000;
		long l = 3000000000L;
//		have to force floats
		float f = 4000.69F;
		double d = 5000.69;
		
		char c = 'd';
		
		boolean tru = true;
		boolean fal = false;
		
		
		/*
		 * When converting between a decimal point value and an
		 * integer/whole number
		 */
		double decimal = 99.999;
		System.out.println(decimal); //99.9999
		int number = (int)decimal;
		System.out.println(number); //99
	}

}
