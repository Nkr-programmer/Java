package easy2.easy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Spoon_in_matrix {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

	Scanner sc =new Scanner(System.in);
	int T=sc.nextInt();
		outer:while(T > 0)
		{
		
			int		r = sc.nextInt();
			int		c =sc.nextInt();
			
	
			String []s=new String[r];
			ArrayList<Integer>a= new ArrayList<Integer>();
			boolean g=false;
			boolean f=false;
			for(int i=0;i<r;i++) {
				s[i]=sc.next();
				s[i]=s[i].toLowerCase();
				if(s[i].contains("spoon")) {g=true;}
				if(s[i].contains("s")) {a.add(i);}
			}

			if(g) {System.out.println("There is a spoon!");}
			else {
				
				int y=0;
			
			while(y<a.size()) {
				if(a.get(y)+4>(r-1)) {break;}
			
				int ss=s[a.get(y)].indexOf("s");
				for(int e=ss;e<c;e++) {
				

				if(s[a.get(y)].charAt(e)=='s'&&s[a.get(y)+1].charAt(e)=='p'&&
						s[a.get(y)+2].charAt(e)=='o'&&s[a.get(y)+3].charAt(e)=='o'&&
						s[a.get(y)+4].charAt(e)=='n')
				{
					
					f=true;break;}
				}
				if(f) {break;}
				
				
			y++;
			}
			
			if(f)System.out.println("There is a spoon!");
			else
				if(!f)
				System.out.println("There is indeed no spoon!");
			
			}
			
			
			T--;
			}
		
			

		}
	}
