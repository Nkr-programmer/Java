package easy2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Good_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0) {
			
			String se=sc.next();
			
int k=0;
k=sc.nextInt();
int x=1;
x=sc.nextInt();
int y=0;
			HashMap<Character,Integer>ac=new HashMap<Character,Integer>();
			
			for(int i=0;i<se.length();i++) {
				if(ac.containsKey(se.charAt(i))){
					
					
					if(ac.get(se.charAt(i))<x) {
					ac.put(se.charAt(i),ac.get(se.charAt(i))+1);
					y++;}
					else {
						if(k==0)break;
						
						ac.put(se.charAt(i),ac.get(se.charAt(i))+1);
						k--;}
				
			}
				
				
				else {
					
					
					ac.put(se.charAt(i),1);
			y++;
				}
			}
			
			System.out.println(y);
			
			t--;}
			}
			

		}