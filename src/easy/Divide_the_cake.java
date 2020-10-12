package easy;

import java.util.Scanner;

public class Divide_the_cake {

	public Divide_the_cake() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {
			int n=0;
    n= sc.nextInt();
    System.out.println();
if(360%n==0) {System.out.print("y");}
else {System.out.print("n");}
if(n>360) {System.out.print("n");}
else {System.out.print("y");}
int h=0;
h=n*(n+1)/2;

if(h>360) {System.out.print("n");}
else {System.out.print("y");}

		
	
			t--;
		}
				
				
	}
	}