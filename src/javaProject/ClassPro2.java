package javaProject;

public class ClassPro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sonF Nilesh=new sonF("Navnath","Hadole","Nilesh");
		System.out.println(Nilesh.fName);
		System.out.println(Nilesh.lastName);
		System.out.println(Nilesh.sName);
		
		Nilesh.displayName();
		Nilesh.displaySName();
		
		
		//multilevel
		
		sonG Darshan=new sonG("Dnyaneshwar","Hadole","Eknath","Darshan");
		
		System.out.println(Darshan.gName);
		System.out.println(Darshan.lastName);
		System.out.println(Darshan.fName);
		System.out.println(Darshan.sName);
		

		Darshan.displayName();
		Darshan.displayFName();
		Darshan.displaySonName();
		
		daughterOne vaishnavi=new daughterOne("vaishali","kumawat","vaishanvi");
		System.out.println(vaishnavi.MName);
		System.out.println(vaishnavi.lastName);
		System.out.println(vaishnavi.DNameOne);
		
		vaishnavi.displyaMname();
		vaishnavi.displayDName();
	
		
		daughterTwo samruddhi =new daughterTwo("vaishali","kumawat","samruddhi");
		System.out.println(samruddhi.MName);
		System.out.println(samruddhi.lastName);
		System.out.println(samruddhi.DNameTwo);
		
		samruddhi.displyaMname();
		samruddhi.displayDTwoName();
		
	}

}


class fatherD {
	String fName;
	String lastName;
	
	public fatherD(String fn, String ln) {
		this.fName=fn;
		this.lastName=ln;
	}
	
	public void displayName() {
		System.out.println(this.fName + this.lastName);
	}
}

class sonF extends fatherD{
	String sName;
	
	public sonF(String fn,String ln,String sn)
	{
		super (fn,ln) ;
		this.sName=sn;
	}
	public void displaySName() {
		System.out.println(this.sName+this.lastName);
	}
}


// multiLevel

class grandFather {
	String gName;
	String lastName;
	
	public grandFather(String gn, String ln) {
		this.gName=gn;
		this.lastName=ln;
	}
	
	public void displayName() {
		System.out.println(this.gName + this.lastName);
	}
}

class fatherE extends grandFather{
	String fName;

	
	public fatherE(String gn, String ln,String fn) {
		super(gn,ln);
		this.fName=fn;
		
	}
	
	public void displayFName() {
		System.out.println(this.fName + this.lastName);
	}
}

class sonG extends fatherE{
	String sName;
	
	public sonG(String gn,String ln,String fn,String sn){
		super (gn,ln,fn) ;
		this.sName=sn;
	}
	public void displaySonName() {
		System.out.println(this.sName+this.lastName);
	}
}


// hierarchical method

class Mother {
	String MName;
	String lastName;
	
	public Mother(String mn,String ln) {
		this.MName=mn;
		this.lastName=ln;
	}
	
	public void displyaMname() {
		System.out.println(this.MName+this.lastName);
	}
}


class daughterOne extends Mother{
	String DNameOne;
	public daughterOne (String mn,String ln,String Dn ) {
		super(mn,ln);
		this.DNameOne=Dn;
		}
	public void displayDName() {
		System.out.println(this.DNameOne +this.lastName);
	}
}


class daughterTwo extends Mother{
	String DNameTwo;
	public daughterTwo(String mn, String ln,String DnT) {
		super(mn, ln);
		this.DNameTwo=DnT;
	}
	
	public void displayDTwoName() {
		System.out.println(this.DNameTwo +this.lastName);
	}
}