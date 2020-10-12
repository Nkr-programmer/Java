package easy;

import java.util.Scanner;

public class Little_chefs_and_sums {

	public Little_chefs_and_sums() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {
		long n=0,q=1,k=0,c=0,lo=Long.MAX_VALUE;
		long hh=0;
		n=sc.nextLong();
		Long[] a=new Long[(int)n];
		long min=0;
	for(int j=0;j<n;j++) {
 a[j]=sc.nextLong();
 hh=hh+a[j];
	}
	
	for(int i=1;i<=n;i++) {
          k=prefix(a,i,k);
		hh=suffix(a,i,hh);
		c=k+hh;
		if(lo>c) {lo=c;min=i;}
	}
	

System.out.println(min);

	t--;
}
	}

	private static long suffix(Long[] a,long i, long hh) {
		// TODO Auto-generated method stub
	
		long total=0;
		if(i>1)
		hh=hh-a[(int) (i-2)];
		
		return hh;
	}

	private static long prefix(Long[] a, int n, long k) {
		long total=0;
		
		k=k+a[n-1];
		
		
		return k;
	}
	
	}