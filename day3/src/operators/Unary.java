package operators;

public class Unary {

	public static void main(String[] args) {
		int post = 10;
		System.out.println(post); //10
		System.out.println(post++); //10
		System.out.println(post);
		
		System.out.println("Before:" + post++ + ", After:" + post);
		
		System.out.println(true);
		System.out.println(!true);
		System.out.println(false);
		System.out.println(!false);
	}
}
