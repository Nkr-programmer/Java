package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Chef_and_feedback {

	public Chef_and_feedback() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

	    int t=0;
		t=sc.nextInt();
		while(t>0) {
			String n="";
			int m=0,b=0;
			int total=0,nac=0;
				n=sc.next();

if(n.contains("101")||n.contains("010")) {
	System.out.println("Good");
}else {
	System.out.println("Bad");
}
			t--;
		}
		


		
	}

}