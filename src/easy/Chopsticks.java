package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Chopsticks {

	public Chopsticks() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

	   
		
			int n=0,m=0,b=0;
			int total=0,nac=0;
				n=sc.nextInt();
				b=sc.nextInt();
				int [] aa = new int[n];
	for(int i=0;i<(n);i++) {
		
		aa[i]=sc.nextInt();
		
	}
	Arrays.parallelSort(aa);
	
for(int i=0;i<(n-1);) {
		
		if(aa[i+1]-aa[i]<=b) {
			m++;
			i=i+2;
		}else
		{
			i++;
		}
	}

System.out.println(m);

	}

}
