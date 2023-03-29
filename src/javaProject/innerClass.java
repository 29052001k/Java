package javaProject;

public class innerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program 1
		   
		car C=new car("Audi","SUV");
		C.getCarType();
		
		car.auto Au=C.new auto();
		
		Au.typeBased();
		Au.displayEngine();
		
		// program 2
		CarA cr=new CarA("audi","SUV");
		
		CarA.autto aut=cr.new autto();
		
		aut.tyeBased();
		
		aut.displayEnginename();
		
	}

}


class car{
	String name="Audi";
	String ty="SUV";
	
	
	
	public car(String name,String ty) {
		this.name=name;
		this.ty=ty;
	}
	
	public String getCarType() {
	return this.name;
	}
	
	class auto{
		String engine;
		
		public String  typeBased() {
			if(car.this.ty.equals("SUV")) {
				this.engine="Bigger";
			}else if(car.this.ty.equals("Audi")) {
				this.engine="Smaller";
			}else {
				this.engine="Default engine";
			}
			return this.engine;
		}
		public void displayEngine() {
			
			System.out.println(this.engine);
		}
	}
}
	
	
	class CarA {
		String Name="Audi";
		String Typ="SUV";
		
		public CarA(String nm,String  ty) {
			this.Name=nm;
			this.Typ=ty;
		}
		
		private String getCarName() {
			return this.Name;
			
		}
		class autto{
			String engine;
			
			public String tyeBased() {
				
				if(CarA.this.Typ.equals("SUV")) {
					this.engine="Bigger";
				}
				else if(CarA.this.Typ.equals("Audi")) {
					this.engine="smaller";
				}
				else {
					this.engine="default";
				}
				return engine;
				
				
			}
			public void displayEnginename() {
			System.out.println(this.engine);
			}
		}
		
		}
