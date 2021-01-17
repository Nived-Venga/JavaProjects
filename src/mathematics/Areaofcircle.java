package mathematics;

import java.util.Scanner;

class Area {

	Double area;

	Area(Double r) {
		area = ((22 * r * r) / 7);
	}
}

public class Areaofcircle extends AreaCal implements Areacalculation {
	static Double area;

	public static Double using_static_method(Double radius) {
		return area = (22 * radius * radius) / 7;
	}

	public static void main(String[] args) {
		Areaofcircle obj1 = new Areaofcircle();

		// Radius
		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		Double radius = s1.nextDouble();
		Area obj2 = new Area(radius);
		@SuppressWarnings("resource")
		Scanner s0 = new Scanner(System.in);

		System.out.println("Enter the option : ");

		int option = s0.nextInt();

		switch (option) {
		// 1. Using static method
		case 1:
			System.out.println("Area of the circle = " + using_static_method(radius));
			break;
		// 1. Using interface
		case 2:
			System.out.println("Area of the circle = " + obj1.using_interface(radius));
			break;
		case 3:
			System.out.println("Area of the circle = " + obj1.using_inheritance());
			break;
		case 4:
			System.out.println("Area of the circle = " + obj2.area);
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
	}

	@Override
	public Double using_interface(Double r) {
		return area = (double) ((22 * r * r) / 7);

	}

}

class AreaCal {
	Double area;
	Double r;

	Double using_inheritance() {
		return area = ((22 * r * r) / 7);
	}

	public Double using_interface(Double r) {
		// TODO Auto-generated method stub
		return null;
	}
}
