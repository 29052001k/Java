package javaProject;

public class innerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Grocery gr=new Grocery();
		
		Grocery.fruits fr=gr.new fruits();
		
		fr.city();
		
		Grocery.vegetables vg=gr.new vegetables();
		
		vg.city();
	}

}


class Grocery{
	
	int price=10;
	
	class fruits{
		
		String supplier="mappo";
		String vendor="adani";
		
		public void city() {
			System.out.println("supplier from pune");
		}
	}
	
	protected class vegetables{
		String supplier="mappo1";
		String vendor="adani1";

		public void city() {
			System.out.println("vendors from pune");
		}
	}
}