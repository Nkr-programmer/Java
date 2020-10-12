package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Buying_sweets {

	public Buying_sweets() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);

	    int t=0;
		t=sc.nextInt();
		while(t>0) {
			int n=0,m=0,b=0;
			int total=0,nac=0;
				n=sc.nextInt();
				m=sc.nextInt();
				int [] a=new int[n];		
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
total=total+a[i];
	}
     b=total%m;
     
     Arrays.parallelSort(a);
     
	if(b!=0) {
		
		if(a[0]<=b) {
			System.out.println("-1");
		}else {
			System.out.println(total/m);
		}
	}
	else {
		System.out.println(total/m);
	}
			t--;
		}
		


		
	}

}