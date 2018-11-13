public class Hangar {

	public static void main(String[] args) {

		Vehicle car= new Car("Seat", 101075);

		Vehicle boat=new Boat("Le Phocea", 260575);

		System.out.println(car.doStuff());

		System.out.println(boat.doStuff());
	}

}
