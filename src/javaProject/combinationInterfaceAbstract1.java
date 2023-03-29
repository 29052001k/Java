package javaProject;

public class combinationInterfaceAbstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aa ff =new Aa();
		ff.L();
		ff.M();
		ff.N();
		ff.O();
		ff.P();
		ff.Q();
		ff.R();
		ff.G();
	}

}

interface Dd{
	
	public void L();
	public void M();
	public void N();
}

interface Ee{
	public void O();
	public void Q();
	public void P();
	
}


interface Ww extends Dd,Ee{

	public void R();
	public void G();
	
}

class Aa implements Ww{

	@Override
	public void L() {
		// TODO Auto-generated method stub
		System.out.println("this is L");
	}

	@Override
	public void M() {
		// TODO Auto-generated method stub
		System.out.println("this is M");
	}

	@Override
	public void N() {
		// TODO Auto-generated method stub
		System.out.println("this is N");
	}

	@Override
	public void O() {
		// TODO Auto-generated method stub
		System.out.println("this is O");
	}

	@Override
	public void Q() {
		// TODO Auto-generated method stub
		System.out.println("this is Q");
	}

	@Override
	public void P() {
		// TODO Auto-generated method stub
		System.out.println("this is P");
	}

	@Override
	public void R() {
		// TODO Auto-generated method stub
		System.out.println("this is R");
	}

	@Override
	public void G() {
		// TODO Auto-generated method stub
		System.out.println("this is G");
	}
	
}