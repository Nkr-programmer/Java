package easy;

import java.util.Scanner;

public class Chef_and_kings_ship {

	public Chef_and_kings_ship() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
long n=0,x=0,min=Long.MAX_VALUE,total=0;
n=sc.nextLong();
for(int i=0;i<n;i++) {
	x=sc.nextLong();
	
	total=total+x;
	if(min>x) {min=x;}
}			
			total=total-min;
			
			System.out.println(total*min);
			
			
			
			t--;
		}
		
		
	}

}
