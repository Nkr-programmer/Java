package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Chef_and_subarray {

	public Chef_and_subarray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner sc =new Scanner(System.in);
		
		int n=0,q=0,c=1,lo=-1;
		n=sc.nextInt();
		
	for(int j=0;j<n;j++) {
 c =sc.nextInt();
 
 if(c!=0) {q++;}
 else
 q=0;
 

	 if(lo<q) {lo=q;}

	 
 }
	System.out.println(lo);


}		

	}
