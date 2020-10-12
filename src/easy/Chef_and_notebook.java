
package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Chef_and_notebook {

	public Chef_and_notebook() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		int t=0;
		t=sc.nextInt();
		while(t>0) {
			int n=0,k=0,x=0,y=0,p=0,c=0;

			x=sc.nextInt();
			y=sc.nextInt();
			k=sc.nextInt();	
			n=sc.nextInt();
			boolean check =false;
			if(y<x) {
	
				while(n>0) {
					
				p=sc.nextInt();	
				c=sc.nextInt();
				
				if(p>=y) {
					if(c<=k) {
						check=true;
						
					}
				}
				n--;
				}
				
				
			}else
			{
				check= false;
			}
			
			System.out.println();
			if(check)
			System.out.print("LuckyChef");
			else
			{
				System.out.print("UnluckyChef");
			}
			
			t--;
		}
		
		
	}


}
