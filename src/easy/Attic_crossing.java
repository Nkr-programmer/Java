package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Attic_crossing {

	public Attic_crossing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=0;
		t= sc.nextInt();
		while(t>0) {
			int n=0,q=0,c=1,lo=0;
			String s="";
			s=sc.next();
			
for(int j=0;j<s.length();j++) {
	if(s.charAt(j)=='.') {
		c++;
	}
	if(s.charAt(j)=='#'&&c>1) {
		if(lo<c) {
			lo=c;
			q++;
		}
		c=1;}
}		
System.out.println(q);
			
			t--;}
			}

		}