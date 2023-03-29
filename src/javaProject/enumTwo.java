package javaProject;
public class enumTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test T= new test(Day.MON);
    	T.displayDay();
	    T.DisplayDayTwo(Day.WED);
	
	// using Array
	   Day[] day=Day.values();
	
	   for(Day d:day) {
		System.out.println(d);  // print the all Days
		System.out.println(d.ordinal());  // to get the index number of array
	}
		
		
	}

}


enum Day{
	SUN,
	MON,
	TUES,
	WED,
	THUR,
	FRI,
	SAT;
}

class test{
	
	Day day;
	
	public test(Day day) {
		this.day=day;
	}
	// using Switch Case
	public void displayDay() {
		switch(day) {
		case SUN:
			System.out.println("Day One");
			break;
		case MON:
			System.out.println("Day Two");
			break;
		case TUES:
			System.out.println("Day Three");
			break;
		case WED:
			System.out.println("Day Four");
			break;
		case THUR:
			System.out.println("Day Five");
			break;
		case FRI:
			System.out.println("Day Six");
			break;
		case SAT:
			System.out.println("Day Seven");
			break;
		
		}
		
		
	}
	
	// using if else statement
	
	public void DisplayDayTwo(Day D) {
		
		if(Day.SUN==D) {
			System.out.println("day One");
			}
		else if(Day.MON==D) {
			System.out.println("day Two");
		}
		else if(Day.TUES==D) {
			System.out.println("day three");
		}
		else if(Day.WED==D) {
			System.out.println("day four");
		}
		else if(Day.THUR==D) {
			System.out.println("day five");
		}
		else if(Day.FRI==D) {
			System.out.println("day six");
		}
		else if(Day.SAT==D) {
			System.out.println("day seven");
		}
	}
}