package easy;

import java.util.Scanner;

public class Chef_jumping {

	public Chef_jumping() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int t=0,x=0;
		t= sc.nextInt();
		boolean ghj= false;
		
			x=t%6;
			if(x==0||x==1||x==3) {ghj=true;}
		
		if(ghj) {System.out.println("YES");}
		else {System.out.println("NO");}
	}

}
