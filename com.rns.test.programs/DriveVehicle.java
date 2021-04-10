public class DriveVehicle {

	public static void main(String[] args) {
		TestVehicle t = new TestVehicle();
		TestVehicle.TwoWheeler v = t.new TwoWheeler();
		v.typeOfDrive(2);;
		t.new FourWheeler().typeOfDrive(4);

	}

}

interface Vehicle{
	public void typeOfDrive();
}

class TestVehicle implements Vehicle{
	public void typeOfDrive() {
		System.out.println("Select Type of Vehicle...");
		
	}
	class TwoWheeler{
		
		public void typeOfDrive(int tyre) {
			System.out.println("Ridding Two Wheeler");
			System.out.println("No of tyres:"+tyre);
		}
	}
	class FourWheeler{
		public void typeOfDrive(int tyre) {
			System.out.println("Driving Four Wheeler");
			System.out.println("No. of Tyres:"+tyre);
		}
	}
	
}
/*.........Output>>>>>>>
Ridding Two Wheeler
No of tyres:2
Driving Four Wheeler
No. of Tyres:4
*/
