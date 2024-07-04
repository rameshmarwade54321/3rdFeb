package methods_with_parameters;

public class sample10 {
	public static void main(String[] args) {
		sample10 S10 = new sample10();
		S10.twodigitadditionsquare(10, 10);
		S10.twodigitadditionsquare(20, 20);
	}

	public void twodigitadditionsquare(int a, int b) {
		System.out.println((a * a) + (2 * a * b) - (b * b));
	}
}
