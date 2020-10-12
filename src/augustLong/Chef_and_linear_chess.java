package augustLong;

import java.util.Scanner;

public class Chef_and_linear_chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int t= sc.nextInt();
while(t-->0) {


	
int h=0,c=0;
h= sc.nextInt();
c= sc.nextInt();
boolean che=false;
int s=Integer.MAX_VALUE;
for(int i=0;i<h;i++) {
	int g=sc.nextInt();
	if(c%g==0) {
		
		int y=c/g;
		if(s>y) {s=y;}
		che=true;
	}
}
if(!che) {System.out.println(-1);}
else {System.out.println(c/s);}

	
}


	}

}
