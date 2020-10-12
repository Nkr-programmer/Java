package easy;

import java.util.Scanner;

public class Decreasing_string {

	public Decreasing_string() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc  =new Scanner(System.in);
		
		int t=0;
				t= sc.nextInt();
		while(t>0) {
			
			int y=0;
			y=sc.nextInt();
			
			StringBuilder sb= new StringBuilder();
			int i=0;
			while(y-->=0) {
				sb.append((char)(i++%26+'a'));
				  if(i%26==0 && y!=-1) {
	                    y++;
	                }
				
			}
			System.out.println(sb.reverse());
			
			
			
			t--;}
		
		
	}

}
