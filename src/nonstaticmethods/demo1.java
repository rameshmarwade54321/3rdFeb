package nonstaticmethods;

public class demo1 {
public static void main(String[] args) {
	demo1 S1=new demo1();
	S1.D1();
	S1.D2();
}
public void D1() {
	System.out.println("running non static method d1");
}
public void D2() {
	System.out.println("running non static method d2");
}
}
