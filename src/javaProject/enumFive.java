package javaProject;

enum FruitsW{
	
	APPLE ("red"),
	MANGO("yellow"),
	PAPAYA("orange");

	private String fruit ;
	
	private FruitsW (String D1) {
		this.fruit=D1;
	}
	
	public String displayColor(){
		return this.fruit;
	}
	
}

enum Names{
	KALYANI("may"),
	ARYAN ("dec"),
	SAMRUDHHI("march"),
	VAISHANAVI("april"),
	ANSHUL("nov");
	
	private String names;
	
	private Names(String nam) {
		this.names=nam;
	}
	public String displayName() {
		return this.names;
	}
}


public class enumFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
FruitsW [] aa = FruitsW.values();
		
		for(FruitsW a :aa) {
			System.out.println(a.displayColor());
		}

		
		// program2
		
		Names[] nm=Names.values();
		
		for(Names n:nm) {
			System.out.println(n.displayName());
		}
		
	}

}
