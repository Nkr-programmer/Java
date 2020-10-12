package easy;

import java.util.Scanner;

public class Counting_preety_numbers {

	public Counting_preety_numbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {
	int n=0,k=0,m=0,x=0,lo=0;
    n= sc.nextInt();
    k= sc.nextInt();
for(int i=n;i<=k;i++){
    if(i%10==2){m++;}
    else
     if(i%10==3){m++;}
     else 
     if(i%10==9){m++;}
}

		System.out.println();
	System.out.print(m);
	
			t--;
		}
				
				
	}
}

