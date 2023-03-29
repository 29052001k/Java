package javaProject;

public class Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Join()
		String str="I";
		String str1="learning";
		String str2="Java";
		String q1=String.join("@", str, str1, str2);
		System.out.println(q1);
		
		
		// indexOf()
		String city="Pune";
		int q2=city.indexOf("n");
		int q3=city.indexOf("e");
		System.out.println(q2);
		System.out.println(q3);
		
		
		String name="kalyani hadole";
		int e1=name.indexOf("a",5);
		System.out.println(e1);
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a') {
				System.out.println(i);
			}
		}
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='e') {
				System.out.println(i);
			}
		}
		
		
		// trim()
		
		String City1=" Gujrat ";
		System.out.println(City1.length()); //8
		String e2=City1.trim();  //remove the space
		System.out.println(e2);
		
		// replace()

		String Name="Kalyani";
		String e3=Name.replace("a", "P");
		System.out.println(e3);
		
		
		// isEmpty()

		String city1=" ";
		String city2="Maharashra";
		
		boolean e4=city1.isEmpty();
		System.out.println(e4);  //false(one Blank Space)
		
		boolean e5=city2.isEmpty();
		System.out.println(e5);  //False
		
		
		
		
		
		
		
		
		
		
		
	}

}
