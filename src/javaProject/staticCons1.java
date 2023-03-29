package javaProject;

public class staticCons1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Humans H=new Humans("Kalyani","Hadole");
System.out.println(H.fullName);
System.out.println(H.lastName);

H.countyObj();

	}

}


class Humans{
	static int count=0;
	String fullName;
	String lastName;
	
	public Humans(String Fn,String Ln){
		this.fullName=Fn;
		this.lastName=Ln;
//count=count+1;
		increseCount();
	}

	public static void countyObj()
	{
		System.out.println(Humans.count);
	}
	
	public static void increseCount() {
		
		count=count+1;
	}
}