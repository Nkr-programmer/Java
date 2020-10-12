package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dividing_stamps {

	public Dividing_stamps() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Scanner sc = new Scanner(System.in);

	   
		
			int n=0,m=0,b=0;
			int total=0,nac=0;
				n=sc.nextInt();
	
				int [] aa = new int[n];
	for(int i=0;i<(n);i++) {
		
		total=sc.nextInt();
		nac=nac+total;
	}
	b=(n*(n+1))/2;
	System.out.println(nac);

	if(b==nac) {System.out.println("YES");}
	else {System.out.println("NO");}
		

		
	}

}
