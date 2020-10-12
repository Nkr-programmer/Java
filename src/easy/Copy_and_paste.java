package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Copy_and_paste {

	public Copy_and_paste() {
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
	int  aa=0;
			    HashSet <Integer> a=new HashSet<Integer>(n);
for(int i=0;i<n;i++) {
	aa= sc.nextInt();
	if(a.contains(aa))
		{}
		else {
			a.add(aa);
		}	
	}
		System.out.println();
		System.out.print(a.size());
	
			t--;
		}
				
				
	}

}