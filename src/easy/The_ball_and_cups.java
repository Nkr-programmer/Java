package easy;

import java.util.Scanner;

public class The_ball_and_cups {

	public The_ball_and_cups() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int t=0;
t= sc.nextInt();
while(t>0) {
	
	int n=0,q=0,c=0,lo=0;
	n=sc.nextInt();
	c=sc.nextInt();
	q=sc.nextInt();
	lo=c;
	while(q>0) 
	{
		int in=0,fi=0;
		in=sc.nextInt();
		fi=sc.nextInt();
	int a=0,b=0;
	a=lo-in;
	b=fi-lo;
	
	if(in>lo||fi<lo) {}
	else {
	if(a<b) {fi=fi-a;lo=fi;}
	else if(b<a){in=in+b;lo=in;}
	}
		q--;
	}
			System.out.println(lo);

	
	
	t--;}
	}

}
