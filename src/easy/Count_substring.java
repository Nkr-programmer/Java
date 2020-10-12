package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Count_substring {

	public Count_substring() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

	    int t=0;
		t=sc.nextInt();
		while(t>0) {
			int n=0,total=0,m=0;
			long fkinal=0;
			long k=0,totall=0;
			n=sc.nextInt();
		 String a="";

	a=sc.next();
	while(n>0) {
		
		
	if(a.charAt(n-1)=='1') {k++;}
	
	n--;
	}
			

for(int i=0;i<k;i++) {
	totall=totall+i;
}
fkinal=k*k-totall;
			
		System.out.println();
		System.out.print(fkinal);

			t--;
		}
		

	}


}



