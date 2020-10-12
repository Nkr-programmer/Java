package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Reversing_directions {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int t= sc.nextInt();
while(t>0) {
	int n=sc.nextInt();
	String []se= new String[n+1];
	
	for(int i=0;i<=n;i++) {
		se[i]=sc.nextLine();
	}

	
	int l=0,r=0;
	String y="Begin";

	for(int i=n;i>=0;i--) {
		
	
			
			if(se[i].startsWith("Left")) {
			System.out.println(y+""+se[i].substring(4));y="Right";}
			else
				if(se[i].startsWith("Begin")) {
					System.out.println(y+""+se[i].substring(5));y="Right";}
			else
				if(se[i].startsWith("Right")) {
					System.out.println(y+""+se[i].substring(5));y="Left";}
		
		
	}
	
	t--;}
	}
	

}