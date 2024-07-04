package methods_with_parameters;

//methods with multiple parameter passing
public class sample12 {
	public static void main(String[] args) {

		cardetails("Hrundai", "I20", 140, 2999, 22.5f, 'A');
		System.out.println("-------------------------");
		cardetails("Maruti", "Ertiga", 120, 9999, 19.3f, '5');

	}

	public static void cardetails(String Brand, String carmodel, int maxspeed, int totalkmrun, float averagerun,
			char rating) {
		System.out.println("Brand: " + Brand);
		System.out.println("model: " + carmodel);
		System.out.println("speed: " + maxspeed);
		System.out.println("totalkmrun: " + totalkmrun);
		System.out.println("averagerun: " + averagerun);
		System.out.println("rating: " + rating + "*");

	}

}
