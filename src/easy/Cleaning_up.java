package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Cleaning_up {

	public Cleaning_up() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner sc = new Scanner(System.in);
		
		int t=0;
		t=sc.nextInt();
		while(t>0) {
			int n=0,k=0;


			n=sc.nextInt();
			k=sc.nextInt();
			int[] b= new int[n];
			for(int i=0;i<k;i++) {
				b[sc.nextInt()-1]=1;
			}
			boolean check=true;
			System.out.println();
			for(int i=0;i<n;i++) {
	if(b[i]==0)
	{
		if(check) {
		System.out.print(i+1+" ");	
			b[i]=1;
			}
	check=!check;

	}
			}

			System.out.println();
			for(int i=0;i<n;i++) {
	if(b[i]==0)
	{
		System.out.print(i+1+" ");	
		
	}
			}
			
			
			
			t--;
		}
		
		
	}


}