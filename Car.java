package assignment3;

class CarInfo {
	int yearModel;
	String make;
	int speed = 0;

	public CarInfo(int yearModel, String make) {
		this.yearModel = yearModel;
		this.make = make;
	}

	public int getYearModel() {
		return yearModel;
	}

	public String getMake() {
		return make;
	}

	public int getSpeed() {
		return speed;
	}

	public void accelarate() {
		speed += 5; // speed=speed+5 Increased by 5
	}

	public void Brake() {
		speed -= 5; // Decreased by 5
	}

}

public class Car {
	public static void main(String[] args) {
		CarInfo info = new CarInfo(111, "ndicnd");
		info.accelarate();

		System.out.println(info.getYearModel());
		System.out.println(info.getMake());
		System.out.println(info.getSpeed());
		info.getSpeed();
		System.out.println(info.getSpeed());
		info.getSpeed();
		System.out.println(info.getSpeed());
		info.Brake();
		System.out.println(info.getSpeed());
	}
}
