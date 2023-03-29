package javaProject;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]=new int[5];
		int [] num1 =new int[10];
		
		num[0]=12;
		num[1]=13;
		num[2]=14;
		num[3]=15;
		num[4]=16;
		
		System.out.println(num);
		//System.out.println(Array);
		//String e1= Arrays.toString(num);
		//System.out.println(e1);
		
		for(int i=0;i<num.length;i++) {
			System.out.println(i);
			System.out.println(num[i]);
		}
		
		int []num3= {11,22,33,4,45};
		
		for(int i=0;i<num3.length;i++) {
			System.out.println(i);         //0,1,2,3,4
			System.out.println(num3[i]);   //11,22,33,4,45
		}
		
		
		

	}

}
