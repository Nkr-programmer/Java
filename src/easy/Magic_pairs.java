package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Magic_pairs {

	public Magic_pairs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {
			int n=0;
    n= sc.nextInt();
	int  aa=0;
	int [] ad=new int[n];
			 
for(int i=0;i<n;i++) {
	ad[i]= sc.nextInt();
}
aa=(n*(n-1))/2;

System.out.println();
		System.out.print(aa);
	
	
			t--;
		}
				
				
	}
	}