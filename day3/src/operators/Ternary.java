package operators;

public class Ternary {
	public static void main(String[] args) {
		int a = true ? 15 : 99;
		int b = false ? 15 : 99;
		
		String result = a > b ? "A was larger" : "B was larger";
		System.out.println(result);
	}

}
