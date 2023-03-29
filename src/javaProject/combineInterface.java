package javaProject;

public class combineInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D dd=new D();
		dd.one();
		dd.two();
		dd.three();
		dd.four();
		dd.five();
		dd.six();
		dd.seven();
		dd.eight();
		dd.nine();
		
	}

}


interface A{
	public void one ();
	public void two ();
	public void three ();
	
}

interface B{
	public void four ();
	public void five ();
	public void six ();
}


interface C{
	public void seven ();
	public void eight ();
	public void nine ();
}

class D implements A,B,C {

	@Override
	public void seven() {
		// TODO Auto-generated method stub
		System.out.println(8);
	}

	@Override
	public void eight() {
		// TODO Auto-generated method stub
		System.out.println(7);
	}

	@Override
	public void nine() {
		// TODO Auto-generated method stub
		System.out.println(9);
	}

	@Override
	public void four() {
		// TODO Auto-generated method stub
		System.out.println(4);
	}

	@Override
	public void five() {
		// TODO Auto-generated method stub
		System.out.println(5);
	}

	@Override
	public void six() {
		// TODO Auto-generated method stub
		System.out.println(6);
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub
		System.out.println(1);
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println(2);
	}

	@Override
	public void three() {
		// TODO Auto-generated method stub
		System.out.println(3);
	}
	
}



