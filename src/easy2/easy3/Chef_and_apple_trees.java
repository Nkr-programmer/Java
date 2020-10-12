package easy2.easy3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Chef_and_apple_trees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0) {
			
			int n =sc.nextInt();


			Set<Integer>ac=new HashSet<Integer>();
			
		
			for(int i=0;i<n;i++) {
ac.add(sc.nextInt());
			}
			
			System.out.println(ac.size());
			
			t--;}
			}
			

		}