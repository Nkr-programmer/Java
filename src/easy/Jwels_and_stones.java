package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Jwels_and_stones {

	public Jwels_and_stones() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t=0;
		t=sc.nextInt();
		while(t>0) {
			int n=0,k=0,total=0;
			String h="",h1="";
			char ho=' ';

			h=sc.next();
			h1=sc.next();
			for(int ki=0;ki<h1.length();ki++){
			if(h.contains(String.valueOf(h1.charAt(ki)))){
		
				k++;
			}
		}
		System.out.println();
		System.out.print(k);
			
			t--;
		}
		

	}


}
