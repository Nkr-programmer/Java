package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Discrepancies_in_voter_list {

	public Discrepancies_in_voter_list() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

	    int t=0;
		
			int n=0,m=0,b=0;
			int total=0,nac=0;
				n=sc.nextInt();
				m=sc.nextInt();
				b=sc.nextInt();
			//	ArrayList<Integer> a= new ArrayList<Integer>();
				 Set<Integer> a = new HashSet<>();//between arraylist and hashset 
				                                //choose hashset bec o(n)and o(1)
				int [] aa = new int[n+m+b];
	for(int i=0;i<(n+m+b);i++) {
		
		total=sc.nextInt();
	   if(a.contains(total)) {		
		   a.remove(new Integer(total));
aa[nac]=total;
	   nac++;
	   }
	   else {
		   a.add(total);
	   }
		
	}
	Arrays.parallelSort(aa);
	System.out.println(nac);
	for(int i=n+m+b-nac;i<(n+m+b);i++) {
	//	if(aa[i]!=0)
     System.out.println(aa[i]);
	}
    
		

		
	}

}
