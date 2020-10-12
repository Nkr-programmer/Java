package easy;

import java.util.Scanner;

public class Little_elephant__and_bombbs {

	public Little_elephant__and_bombbs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {
	int n=0,k=0,m=0;
    n= sc.nextInt();
	String s="";
	s=sc.next();
	int[] a=new int[n];
for(int i=1;i<n-1;i++) {
	
	if(s.charAt(i)=='1') {
		a[i-1]=1;
	a[i]=1;
	a[i+1]=1;
	}

}if(n>1) {
if(s.charAt(0)=='1') {a[0]=1;a[1]=1;}
if(s.charAt(n-1)=='1') {a[n-1]=1;a[n-2]=1;}
}else {
	if(s.charAt(0)=='1') {a[0]=1;}
}
for(int st=0;st<n;st++)
{
if(a[st]==0) {k++;}	
}
System.out.println();
System.out.print(k);
		
	
	
			t--;
		}
				
				
	}

}