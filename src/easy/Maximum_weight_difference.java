package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_weight_difference {

	public Maximum_weight_difference() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
		int t=0;
		t=sc.nextInt();
		while(t>0) {
			int n=0,k=0,total=0,totall=0,fkinal=0;
			n=sc.nextInt();
			k=sc.nextInt();
			int [] a=new int[n];

			for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
	total=total+a[i];
		}
			Arrays.parallelSort(a);
			
			if(k<=n/2) {
			for(int i=0;i<k;i++){
				
				totall=totall+a[i];
					}
			fkinal=total-2*totall;
			}
			else {
				for(int i=0;i<n-k;i++){
					
					totall=totall+a[i];
						}
				fkinal=total-2*totall;
				
			}

	
			
		System.out.println();
		System.out.print(fkinal);
			
			t--;
		}
		

	}


}
