package augustLong;

import java.util.Scanner;

public class Chef_wars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
int t= sc.nextInt();
while(t-->0) {


	
int h=0,c=0;
h= sc.nextInt();
c= sc.nextInt();

while(h>0&&c>0) {
	h=h-c;
	c=c/2;
}
if(h<=0) {System.out.println(1);}
else {System.out.println(0);}


	
}


	}

}
