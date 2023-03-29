package javaProject;

public class enumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test1 t=new test1(Day1.THUR);

// switch case
t.DisplayDaysName();


// using array
    Day1[] day=Day1.values();
    for(Day1 d1:day) {
	//System.out.println(d1);
	System.out.println(d1.ordinal());
	
	// if else statement
	t.displayDayFour(Day1.FRI);
}

	}
}



enum Day1{
	SUN,MON,TUES,WED,THUR,FRI,SAT;
}

class test1{
	Day1 day1;
	
	public test1(Day1 day1) {
		this.day1=day1;
	}
	public void DisplayDaysName() {
		switch(day1) {
		case SUN :
			System.out.println("A");
		break;
		case MON:
			System.out.println("B");
			break;
		case TUES:
			System.out.println("C");
			break;
		case WED:
			System.out.println("D");
			break;
		case THUR:
			System.out.println("E");
			break;
		case FRI:
			System.out.println("F");
			break;
		case SAT:
			System.out.println("G");
		break;
		}
	}
	
	public void displayDayFour(Day1 D1) {
		
		if(Day1.SUN==D1) {
			
			System.out.println("One");
		}
		else if(Day1.MON==D1) {
			System.out.println("Two");
		}
		else if(Day1.TUES==D1) {
			System.out.println("Three");
		}
		else if(Day1.WED==D1) {
			System.out.println("Four");
		}
		else if(Day1.THUR==D1) {
			System.out.println("Five");
		}
		else if(Day1.FRI==D1) {
			System.out.println("Six");
		}
		else if(Day1.SAT==D1) {
			System.out.println("Seven");
		}
	}
}