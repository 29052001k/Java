package javaProject;

public class combinationInterfaceAbsract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RBIo rbi=new RBIo("pune","India");
rbi.deposite();
rbi.loan();
rbi.save();
rbi.displayCountryName();
rbi.reneval();



	}

}


interface WorldBankJ{
	abstract public void loan();
	abstract public void save();
	abstract public void deposite();
}

abstract class SBIp{
	
	
	String City;
	String country;
	
	public SBIp(String cty,String cn){
		this.City=cty;
		this.country=cn;
	}
	
	abstract public void reneval();
	
	public void displayCountryName() {
		System.out.println("India");
	}
}



class RBIo extends SBIp implements WorldBankJ{

	public RBIo(String cty, String cn) {
		super(cty, cn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("loan Sbi");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("save sbi");
	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("deposite sbi");
	}

	@Override
	public void reneval() {
		// TODO Auto-generated method stub
		System.out.println("reneval sbi");
	}
	
}