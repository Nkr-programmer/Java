package easy2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Distinct_character_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0) {
			
			String se=sc.next();
			

			Set<Character>ac=new HashSet<Character>();
		
			for(int i=0;i<se.length();i++) {
ac.add(se.charAt(i));
			}
			
			System.out.println(ac.size());
			
			t--;}
			}
			

		}