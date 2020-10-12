package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Shortes_tpath_in_binary_tree {

	public Shortes_tpath_in_binary_tree() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {int x1=0,y1=0;
	int x=sc.nextInt();
	int y= sc.nextInt();
	ArrayList<Integer> a=new ArrayList<Integer>();
	ArrayList<Integer> b=new ArrayList<Integer>();
	
	
	while(x!=1) {
				a.add(x);
				x=x/2;
	x1++;	
	}
	while(y!=1) {
		if(a.contains(y)) {break;}
		y=y/2;
	y1++;	
	}	
	
	
	if(y!=1) {System.out.println(y1+a.indexOf(y));}
	else
	System.out.println(x1+y1);
	t--;
}
	}
	}