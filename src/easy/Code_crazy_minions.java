package easy;

import java.util.Scanner;

public class Code_crazy_minions {

	public Code_crazy_minions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {
	String s= sc.next();
	int k=1;
	//97 122
for(int i=1;i<s.length();i++){
	int a=s.charAt(i)-s.charAt(i-1);
	if(a<0)a=a+26;
	k=k+a;

}

if(k>(s.length()*10))
System.out.println("NO");
else
	System.out.println("YES");
	t--;
}
	}
	}