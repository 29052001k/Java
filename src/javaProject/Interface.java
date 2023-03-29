package javaProject;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SBIB sb=new SBIB();
		sb.Loan();
		sb.Save();
		sb.Deposite();
	}

}

interface  WorldBankA{
	
	abstract public void Loan();
	abstract public void Save();
	abstract public void Deposite();
}

class SBIB implements WorldBankA{

	@Override
	public void Loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan SBI");
	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub
		System.out.println("save SBI");
	}

	@Override
	public void Deposite() {
		// TODO Auto-generated method stub
		System.out.println("Deposite SBI");
	}
	
}

