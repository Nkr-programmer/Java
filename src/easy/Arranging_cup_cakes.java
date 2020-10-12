package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Arranging_cup_cakes {

	public Arranging_cup_cakes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		   int t=0;
		
		int n=0,m=Integer.MAX_VALUE,b=0;
		int total=0;
		double nac=0;
			n=sc.nextInt();
			int [] aa = new int[n];
for(int i=0;i<(n);i++) {
	m=Integer.MAX_VALUE;
	total=sc.nextInt();
	nac= Math.sqrt(total);
	for(int j=1;j<=nac;j++) {
		if(total%j==0) {
			b=total/j;
			b=b-j;
			if(m>b) {
				m=b;
			}
		}
	}
	aa[t]=m;
	t++;
}


for(int i=0;i<t;i++) {
	System.out.println(aa[i]);
}


}

}
