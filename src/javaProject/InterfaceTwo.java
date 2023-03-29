package javaProject;

public class InterfaceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Baroda a=new Baroda();
a.Loan();
a.Save();
a.Deposite();
	}

}

interface WorldbankC{
	abstract public void Loan();
	abstract public void Save();
	
}

interface SBIC{
	abstract public void Deposite();
	}


class Baroda implements WorldbankC,SBIC{

	@Override
	public void Loan() {
		// TODO Auto-generated method stub
		System.out.println("loan");
	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub
	System.out.println("Save");	
	}

	@Override
	public void Deposite() {
		// TODO Auto-generated method stub
		System.out.println("deposite");
	}
	
}