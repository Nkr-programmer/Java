package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Uncle_john {

	public Uncle_john() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int t=0;
		t=sc.nextInt();
		while(t>0) {
			int n=0,k=0,x=0;
			
			n=sc.nextInt();
			ArrayList<Integer> b=new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
		b.add(sc.nextInt());
			}
			x=sc.nextInt();
			k=b.get(x-1);
			Collections.sort(b, new comparator());
			x=b.indexOf(k);
			System.out.println(x+1);
			
			
			t--;
		}
		
		
	}


}

class comparator implements Comparator<Integer>
{

@Override
public  int compare(Integer o1, Integer o2) {
	
return   (o1-o2);
}

}
