package javaProject;

public class staticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		vehicleA V=new vehicleA();
		System.out.println(V.name);
		
		vehicleA.sedane SD=V.new sedane();
		SD.printType();
		
		vehicleA.SUV sv=new vehicleA.SUV();
		sv.printType();
		

	}

}

class vehicleA{
	
	String name="TATA";
	
	class sedane{
		public void printType() {
			System.out.println("Sedane");
		}
	}
		static class SUV{
			public void printType() {
				System.out.println("SUV");
			}
		}

}