package easy2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Largest_common_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0) {
			
			String se=sc.next();
			String se2=sc.next();
int h=0;
			HashMap<Character,Integer>ac=new HashMap<Character,Integer>();
			for(int i=0;i<se.length();i++) {
				if(ac.containsKey(se.charAt(i))){
					ac.put(se.charAt(i),ac.get(se.charAt(i))+1);	
			}
				else {
					ac.put(se.charAt(i),1);
				}
			}
			for(int i=0;i<se2.length();i++) {
				if(ac.containsKey(se2.charAt(i))){
					ac.put(se2.charAt(i),ac.get(se2.charAt(i))-1);
					h++;
					if(ac.get(se2.charAt(i))==0) {ac.remove(se2.charAt(i));}
			}
				else {
			
				}
			}	
			System.out.println(h);
			
			t--;}
			}
			

		}