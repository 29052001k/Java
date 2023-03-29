package javaProject;

public class IfconditionLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="kalyani";
		char[] e1=name.toCharArray();
		for(int aa:e1) {
			System.out.println(aa);
		}
		
		
		// conditional statement
		
	    // numT > 0 && numT <= 5   ===>  10 %discount
	     // numT > 5 && numT <= 10   ===> 20 %discount
	     // numT > 10   ===>  30 % discount
		
		int numT =5;
		if(numT>0 && numT<=5) {
			System.out.println("10% discount");
		}
		if(numT>5&& numT<=10) {
			System.out.println("20% discount");
		}
		if(numT>10) {
			System.out.println("30% discount");
		}
		
		//.......................
		
		int numT1=11;
		if(numT1>0 && numT1<=5) {
			System.out.println("10% discount");
		}else if(numT1>5&& numT1<=10) {
			System.out.println("20% discount");
		}else if(numT1>10) {
			System.out.println("30% discount");
		}else {
			System.out.println("please enter the correct number");
		}
		
		
		
		//....................................
		
		int marks=92;
		if(marks>90) {
			System.out.println("Grade A");
		}
		if(marks>75) {
			System.out.println("Grade B");
		}
		if (marks>60) {
			System.out.println("Grade c");
		}
		
		
		//....................................
		
		int marks1=77;
		if(marks1>90) {
			System.out.println("Grade A");
		}else if(marks1>75) {
			System.out.println("Grade B");  //Grade B
		}else if(marks1>60) {
			System.out.println("Grade c");
		}else {
			System.out.println("Grade D");
		}
		
		
		  // conditional statements 

//	     if(condition) {
//	    	 // statament
//	     }
//	     else {
//	    	 // statement
//	     }
		
		
		//...................................
		int a=10;
		int b=20;
		
		if( a >  b) {
			System.out.println("a is Greater");
		}else {
			System.out.println("b is Greater");  // b is Greater
		}
		
		
		String P=a>b?"a is Greater":"b is Greater";
		System.out.println(P);
		
		//.......................................
		
		int s1=100;
		int s2=200;
		int s3=10;
		
//		if(s1>s2 && s1>s3) {
//			System.out.println("s1 is Greater");
//		}
//		if(s2>s1 && s2>s3) {
//			System.out.println("s2 is Greater");  // s2 is Greater
//		}
//		if(s3>s1 && s3>s1) {
//			System.out.println("s3 is Greater");
//		}
//		
		
		
		if(s1>s2) {
			if(s1>s3) {
				System.out.println("s1 is Greater");	
			}else if(s2>s1) {
				if(s2>s3) {
					System.out.println("s2 is Greater");	// b is Greater
				}
			}else {
				System.out.println("s3 is Greater");
			}
		}
		
		
		// Switch Case
		
		

	    String city = "nagpur";


//	    switch(city){
//	    	case "pune":
//	    		System.out.println("MH");
//	    	case "indore":
//	    		System.out.println("MP");
//	    	case "jaipur":
//	    		System.out.println("RJ");
//	    	default:
//	    		System.out.println("Incorrect city name");
//	    }

//	    switch(city){
//    	case "pune":
//    		System.out.println("MH");
//    		break;
//    	case "indore":
//    		System.out.println("MP");
//    		break;
//    	case "jaipur":
//    		System.out.println("RJ");
//    		break;
//    	default:
//    		System.out.println("Incorrect city name");
//    }


	    switch(city){
    	case "pune":
    	case "nagpur":
    		System.out.println("MH");
    		break;
    	case "indore":
    	case "bhopal":
    		System.out.println("MP");
    		break;
    	case "jaipur":
    	case "udaipur":
    		System.out.println("RJ");
    		break;
    	default:
    		System.out.println("Incorrect city name");
    }


	   System.out.println(1);
	   System.out.println(2);
	   System.out.println(3);
	   System.out.println(4);
	   System.out.println(5);


	   // for and while


	   // for(initialization ; conditionCheck , increment/Decrement){

	   // statements



   for(int i = 1 ; i <=5 ; i++) { 
		   System.out.println(i); 
	   }
	   for(int i = 5 ; i >= 1 ; i--) { 
		   System.out.println(i); 
	   }
   for(int i = 4; i <= 40 ; i = i + 4) { 
	   System.out.println(i); 
   }


	   for(int i = 1 ; i <=5 ; i++) {  // 2 //3
	   if(i == 3) {
		   break;
	   }
	   System.out.println(i);  //1 // 2
  }


  for(int i = 1 ; i <=5 ; i++) {  
	   System.out.println(i);  
	   if(i == 3) {
			   break;
		   }
   }

	   for(int i = 1 ; i <=5 ; i++) {  
		   if(i == 3) {
			   continue;
  }
		   System.out.println(i); 
	   };
		
	
	  
		
		
		
		
		
		

	}

}
