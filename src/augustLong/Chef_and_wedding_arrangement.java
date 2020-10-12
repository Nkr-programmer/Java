package augustLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Chef_and_wedding_arrangement {


	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			int		m = Integer.parseInt(st.nextToken());
			 st = new StringTokenizer(br.readLine());
			 HashMap<Integer,Integer>a= new HashMap();

			 int z=1;
			 for(int i=0;i<n;i++) {
int y= Integer.parseInt(st.nextToken());
			if(a.containsKey(y)) {
				a.put(y, a.get(y)+1);
				
				if(z<a.get(y)) {z=a.get(y);}
				
			}
			else {
				a.put(y,1);
			}
		}
		System.out.println();
			int g=Integer.MAX_VALUE;
			
			if(m==1){
			    System.out.print(z);
			}
			else{
		for(int i=1;i<=z;i++) {
			Iterator h= a.entrySet().iterator();
		int total=0,mark=0;	
		while(h.hasNext()) {
	Map.Entry maps=(Map.Entry)h.next();
	if((int)maps.getValue()>1) {
		total=total+(int)maps.getValue();
	 maps.setValue((int)maps.getValue()-1);
	}
		}
		if(g>=(m*i)+total){g=(m*i)+total;}
		
		}
		System.out.print(g);
			}
			
			
			T--;
			}
		
			

		}
	}