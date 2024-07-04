package nonstaticmethods;

public class demo4 {
public static void main(String[] args) {
	demo4 S4=new demo4();
	S4.D5();
	S4.D6();
}
public void D5() {
	System.out.println("running nonstatic method D5");
}
public void D6() {
	System.out.println("running nonstatic method D6");
}
}
