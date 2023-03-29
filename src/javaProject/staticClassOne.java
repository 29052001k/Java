package javaProject;

public class staticClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		vehicle veh=new vehicle();
//		System.out.println(veh.color);
//		
//		veh.createInstance();
//		
		
		vehicle.createInstance();
		vehicle.createInstance();
		vehicle.createInstance();
		vehicle.createInstance();
	}

}


class vehicle{
	String color="Black";
	static vehicle v1;
	
  private vehicle() {
//		System.out.println("sedane");
	}
	
	static public vehicle createInstance () {
		
		if(v1==null) {
			System.out.println("tata");
			v1=new vehicle();
		}
		return v1;
		
	}
}