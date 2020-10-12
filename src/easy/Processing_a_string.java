package easy;

import java.util.Scanner;

public class Processing_a_string {

	public Processing_a_string() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc  =new Scanner(System.in);
		
		int t=0;
				t= sc.nextInt();
		while(t>0) {
			
			String y="";
			y=sc.next();
			
			int x=y.length()-1;
			int o=0;
			while(x>=0) {
	
				if(y.charAt(x)>='0'&&y.charAt(x)<='9') {
						
					o=(int)(o+y.charAt(x))-48;		
		
				}
				x--;
			}
			
			System.out.println(o);
			
			
			
			t--;}
		
		
	}

}
