package javaProject;

public class Methods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// charAt()
		String city="Pune";
		
		for(int i=0;i<city.length();i++) {
			System.out.println(i);
			System.out.println(city.charAt(i));
		}
		
		String city2="nagpur";
		char q1=city2.charAt(1);
		System.out.println(q1);  //a
		
		// length()
		int len=city.length();
		System.out.println(len); //4
		
		int len1=city2.length();
		System.out.println(len1);  //6
		
		for(int i=0;i<len ;i++) {
			System.out.println(city.charAt(i));
		}
		
		for(int i=0;i<len1;i++) {
			System.out.println(city2.charAt(i));
		}
		
		//reverse the string
		
		String city3="Mumbai";
		String rev=" ";
		
		for(int i=0;i<city3.length();i++){
			System.out.println(city3.charAt(i));
			rev=city3.charAt(i)+ rev;
		}
		System.out.println(rev);
		
		String name="Prathmesh";
		rev="";
		
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
			rev=name.charAt(i)+rev;
		}
		System.out.println(rev);
		
		
		//program
		
		String Fruits="apple mango banana papaya";
		String userInput="mango";
		
		if(Fruits.contains(userInput)) {
			System.out.println("fruit available");
		}else {
			System.out.println("fruit is not available");
		}
		
		
		// program4
		String nameE = "kalyani";
		String vowels = "aeiou";
		int count = 0;
		for(int i = 0 ; i < nameE.length() ; i++) {
			if(nameE.charAt(i) == 'a' || nameE.charAt(i) == 'e'||nameE.charAt(i) == 'i' ||nameE.charAt(i) == 'o'|| nameE.charAt(i) == 'u') {
				count = count + 1;
			}

		}
		System.out.println(count);
		
		
		//subString()
		String h = "Javascript";
		String j = h.substring(1,5); // end value is not included
		String jq = h.substring(2); 
		System.out.println(j);
		System.out.println(jq);

	}

}
