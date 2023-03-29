package javaProject;

public class AbstractInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// program1
//		BarodaD baroda=new BarodaD("Pune","India",1234);
//		System.out.println(baroda.city);
//		System.out.println(baroda.Country);
//		System.out.println(baroda.pincode);
//		
//		baroda.Loan();
//		baroda.Save();
//		baroda.displayCountryName();
		
		
		// program 2
		SBIF a=new SBIF();
		a.Loan();
		a.Save();
		
		// program 3
		
		
		rbiA B=new rbiA();
		B.Loan();
		B.Save();
		B.Deposite();
		
	}

}

// abstract

//abstract class HDFC{
//	
//	String city;
//	String Country;
//	
//	public HDFC(String cty,String Cn){
//		this.city=cty;
//		this.Country=Cn;
//	
//	}
//	
//	abstract public void Loan();
//	abstract public void Save();
//	
//	
//	public void displayCountryName(){
//		System.out.println("India");
//	}
//	
//}

//class BarodaD extends HDFC{
//int pincode;
//	public BarodaD(String cty, String Cn,int pin) {
//		super(cty, Cn);
//		this.pincode=pin;
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public void Loan() {
//		// TODO Auto-generated method stub
//		System.out.println("loan");
//	}
//
//	@Override
//	public void Save() {
//		// TODO Auto-generated method stub
//		System.out.println("save");
//	}
//	
//}

// interface


interface  HDFCa {
	abstract public void Loan();
	abstract public void Save();
	
}


class SBIF implements HDFCa {
 public void Loan(){
	 System.out.println("loan");
 }
 public void Save(){
	 System.out.println("save");
 }
	
	
}



//interface two

interface hdfc{
	abstract public void Loan();
	abstract public void Save();
	
}

interface sbiR{
	abstract public void Deposite();
}



class rbiA implements hdfc , sbiR{
	public void Loan() {
		System.out.println("loan");
	}
	public void Save() {
		System.out.println("save");
	}
	public void Deposite() {
		System.out.println("deposite");
	}
}