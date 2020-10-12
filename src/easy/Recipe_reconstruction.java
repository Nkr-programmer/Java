package easy;

import java.util.Scanner;

public class Recipe_reconstruction {

	public Recipe_reconstruction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {long to=1,toe=0;
	String s= sc.next();
	
	
	if(s.length()%2==1) {
		if(s.charAt(s.length()/2)=='?') {to=to*26;}
	}
	
	
for(int i=0;i<s.length()/2;i++){
if(s.charAt(i)=='?'&&s.charAt(s.length()-1-i)=='?') {to=to*26;
to=to%10000009;}
else
	if(s.charAt(i)!='?'&&s.charAt(s.length()-1-i)!='?') {
if(s.charAt(i)-s.charAt(s.length()-1-i)!=0) {to=0;toe=0; break; }
else
	if(s.charAt(i)-s.charAt(s.length()-1-i)==0) {
		
	}
	}
	else {
		
	}
	
}
System.out.println(to);
	t--;
}
	}
	}