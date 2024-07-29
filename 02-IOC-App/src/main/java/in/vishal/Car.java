package in.vishal;

public class Car {

	Car() {
		System.out.println("Car constructor ......");
	}

	private Engine eng;

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	public void runCar() {
		int status = eng.start();

		if (status == 1) {
			System.out.println("Car started .....");
		} else {
			System.out.println("Problem to start Car ....");
		}
	}

}
