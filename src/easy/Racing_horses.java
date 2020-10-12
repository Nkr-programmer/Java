package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Racing_horses {

	public Racing_horses() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int t=0;
		t=sc.nextInt();
		while(t>0) {
			long n=0;
			long y=Long.MAX_VALUE;
				n=sc.nextLong();
				long []b=new long[(int) n];
			for(int i=0;i<n;i++) {
		b[i]=sc.nextLong();
			}
			Arrays.parallelSort(b);
			
			
			for(int i=0;i<n-1;i++) {
			
					if(y>(b[i+1]-b[i]))
				y= (b[i+1]-b[i]);
					}
			
			System.out.println(y);
			
			
			t--;
		}
		
		
	}


}

