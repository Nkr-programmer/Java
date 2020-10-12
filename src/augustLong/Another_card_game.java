package augustLong;

import java.util.Scanner;

public class Another_card_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int t= sc.nextInt();
while(t-->0) {


	
int h=0,c=0;
h= sc.nextInt();
c= sc.nextInt();
boolean che=false;

int x=(h+8)/9,y=(c+8)/9;

if(x>=y) {System.out.println("1 "+y);}
else
	if(x<y) {System.out.println("0 "+x);}

	
}


	}

}
