package easy;

import java.util.Scanner;

public class Stone {

	public Stone() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc =new Scanner(System.in);
		
		long n=0,q=1,k=0,c=0;
		long hh=0;
		n=sc.nextLong();
		k= sc.nextLong();
		k=k%2;
		if(k==0) {k=2;}
		
		
		long[] a=new long[(int)n];
		long min=Long.MIN_VALUE;
	for(int j=0;j<n;j++) {
 a[j]=sc.nextLong();
 if(min<a[j]) {min=a[j];}
}

long nt=n;
	for(int j=0;j<k;j++) {
 long mint=Integer.MIN_VALUE;
 
		while(n>0) {
			a[(int)n-1]=min-a[(int)n-1];
			
			if(mint<a[(int)n-1]) {mint=a[(int)n-1];}
			n--;}
		min=mint;
		n=nt;
}


for(int i=0;i<n;i++) {
	System.out.print(a[i]+" ");
}
	}

	
	}