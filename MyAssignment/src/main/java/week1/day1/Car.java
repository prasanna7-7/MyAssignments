package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("car = "+"apply break");
	}
	public void applyGear() {
		System.out.println("apply gear");
	}
	public void switchOnAc() {
		System.out.println("switch on ac");
	}
	public void applyAcclerate() {
		System.out.println("apply acclerate");
	}
	public static void main(String[] args) {
		Car Mycar=new Car();
		Mycar.applyBreak();
		Mycar.applyGear();
		Mycar.switchOnAc();
		Mycar.applyAcclerate();
		
	}
}
