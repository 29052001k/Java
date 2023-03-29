package javaProject;

import java.util.Arrays;

public class MultipleArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// program 1 
		int [] num= new int[5];
		num[0]=11;
		num[1]=22;
		num[2]=33;
		num[3]=44;
		num[4]=55;

		int []num1= {12,23,34,45,56,67};
		
		for(int i=0;i<num1.length;i++) {
			System.out.println(i);  //0,1,2,3,4,5
			System.out.println(num1[i]);    //12,23,34,45,56,67
		}
		
		for(int s:num1) {
			System.out.println(s);
		}
		
		// program 2
		
		
		int [] [] numbers=new int [3][4];
		
		numbers[0][0]=11;
		numbers[0][1]=22;
		numbers[0][2]=33;
		numbers[0][3]=44;

		
		numbers[1][0]=11;
		numbers[1][1]=22;
		numbers[1][2]=33;
		numbers[1][3]=44;

		
		numbers[2][0]=11;
		numbers[2][1]=22;
		numbers[2][2]=33;
		numbers[2][3]=44;
		
		
		
//		for(int i=0;i<numbers.length;i++) {
//			int r[]=numbers[i];
//			for(int j=0;j<r.length;j++) {
//				System.out.println(r[j]);
//			}
//		}
		
		int [][] numberA={
			{11,22,33},
			{44,55,66},
			{77,88,99}
		};
		
//		for(int i=0;i<numberA.length;i++) {
//			System.out.println(Arrays.toString(numberA[i]));
//			int []row =numberA[i];
//			for(int j=0;i<row.length;j++) {
//				System.out.println(row[j]);
//			}
//		}
//		
		
		//For each()

		
		for(int []row:numbers) {
			for(int col:row) {
				System.out.println(col);
			}
		}
	
		for(int []row:numberA) {
			for(int col1:row) {
				System.out.println(col1);
			}
		}
		
		
		
		int [][][] numberB= {
				{
					{1,2,3},
					{4,5,6},
					{7,8,9}
				},
				{
					{11,22,33},
					{44,55,66},
					{77,88,99}
				},
				{
					{111,222,333},
					{444,555,666},
					{777,888,999}
				}
		};
		
		System.out.println(numberB[1][1][1]);
		for(int [][] rrs:numberB) {
			for(int [] rrr:rrs) {
				for(int r : rrr) {
					System.out.println(r);
				}
			}
		}

		for(int i = 0 ; i < numberB.length ; i++) {
			int [][] rrr = numberB[i];
			for(int k = 0 ; k < rrr.length ; k++) {
				int ccc [] = rrr[k];
				for(int j = 0 ; j < ccc.length ; j++) {
					System.out.println(ccc[j]);
				}
			}
		}
		
		
		
		
		
		
		
	}

}
