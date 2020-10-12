package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Chefs_and_right_triangles {

	public Chefs_and_right_triangles() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		   
		
		int n=0,x1=0,x2=0,x3=0,y1=0,y2=0,y3=0,k=0;
		double b=0;
		double m=0;
		int total=0;
		double nac=0;
			n=sc.nextInt();
				for(int i=0;i<(n);i++) {	
			
			x1=sc.nextInt();	
			y1=sc.nextInt();
			x2=sc.nextInt();
			y2=sc.nextInt();
			x3=sc.nextInt();
			y3=sc.nextInt();
	

		
			
m= (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
b=(x3-x2)*(x3-x2)+(y3-y2)*(y3-y2);
nac= (x1-x3)*(x1-x3)+(y1-y3)*(y1-y3);


if(m>b) {

	if(m>nac) {
		
		if(m==(b+nac))
		{k++;}		
	}
	else {
		//nac>m
		if(nac==(b+m))
		{k++;}		
	}
}else {
	
	if(b>nac) {
		if(b==(nac+m))
		{k++;}	
	}
	else {
		
		if(nac==(b+m))
		{k++;}	
	}
}
			
			
				}System.out.println(k);	






}

}
