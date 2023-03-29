package javaProject;

public class PracticeInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIt sbiA=new SBIt();
		sbiA.Loan();
		sbiA.Save();
		sbiA.DEBIT();
		sbiA.reneval();
	}

}

interface WorldBankG{
	public void Loan();
	public void Save();
}

interface WIRLDbANKfg{
	public void DEBIT();
	public void reneval();
}

class SBIt implements WorldBankG,WIRLDbANKfg{

	@Override
	public void Loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan sbi");
	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub
		System.out.println("save sbi");
	}

	@Override
	public void DEBIT() {
		// TODO Auto-generated method stub
		System.out.println("debit sbi");
	}

	@Override
	public void reneval() {
		// TODO Auto-generated method stub
		System.out.println("reneval sbi");
	}
	
}
