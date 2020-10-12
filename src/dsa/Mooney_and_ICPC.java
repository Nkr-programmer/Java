package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Mooney_and_ICPC {

	public Mooney_and_ICPC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int t=0;
		t=sc.nextInt();
		while(t>0) {
			long n=0,k=0,total=0,code=0,temp=0,temptotal=0;
			int l1=0;
			int l=0;
			ArrayList<Long> a=new ArrayList<Long>();
			ArrayList<Long> b=new ArrayList<Long>();
			n=sc.nextLong();
			for(int i=0;i<n;i++) {
				if(k==5) {k--;
				code=a.get(0);
				a.remove(0);
				total=b.get(4)+b.get(3)+b.get(2);
				
		if(temptotal<total) {temptotal=total;}
				b.remove(new Long (code));
				l--;
				l1--;
				}
				if(k<5) {
					temp=sc.nextLong();
				a.add(l++, temp);
				b.add(l1++, temp);
				Collections.sort(b, new comparator());
				
				k++;
				}
			}
			
			System.out.println(temptotal);
			
			
			t--;
		}
		
		
	}


}

 class comparator implements Comparator<Long>
{

@Override
public  int compare(Long o1, Long o2) {
	
return  (int) (o1-o2);
}

}
