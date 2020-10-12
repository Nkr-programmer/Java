package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Little_elephant_and_string {

	public Little_elephant_and_string() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =new Scanner(System.in);
		int k=0,n=0;
		k=sc.nextInt();
		n=sc.nextInt();
		String [] a= new String [k];
		String [] b= new String [n];
		for(int i=0;i<k;i++) {
			a[i]=sc.next();
		}
		
		for(int i=0;i<n;i++) {
			b[i]=sc.next();
		}	
		
		

		
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<k;j++) {
			if(b[i].contains(a[j])) {b[i]="Good";break;}
			else {
				
				if(b[i].length()>=47) {b[i]="Good";break;}
				
			}
			
			}if(b[i]!="Good")
			b[i]="Bad";
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}
		
		
	}
	}