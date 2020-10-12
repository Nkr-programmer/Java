package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Anotheer_birthday_present {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub



		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			int		k = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
ArrayList<Long>a=new ArrayList<Long>();
			Long []ac = new Long[n];
	for(int i=0;i<n;i++){
		long t= Long.parseLong(st.nextToken());
		   a.add(t);
}
		boolean check=true;



for(int i=0;i<n;i++) {

	for(int j=i+k;j<n;j=j+k) {
		if(a.get(i)>a.get(j)) {
			
	       long temp=a.get(i);
            a.set(i,a.get(j));
            a.set(j,temp);}
	}

	}


for(int i=1;i<n;i++) {
	if(a.get(i)<a.get(i-1)) {check=false;break;}
	
}	
	
	
	
	
	//     while(s!=n) {
//    	 if(a.get(s)==ac[s]) {s++;continue;}
//    	 else {
//    		 int y=a.indexOf(ac[s])+1;
//    		 if((y-s+1)%k==0) {check=true;}
//    		 else {check=false;break;}
//    		 
//    	 }
//    	s++; 
//     }

	if(check) {System.out.println("yes");}
	else {System.out.println("no");}

		T--;
		}
	}
}