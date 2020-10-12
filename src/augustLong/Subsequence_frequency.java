package augustLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Subsequence_frequency {
	 public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
	    { 
	        // Create a list from elements of HashMap 
	        List<Map.Entry<Integer, Integer> > list = 
	               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
	  
	        // Sort the list 
	        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
	            public int compare(Map.Entry<Integer, Integer> o1,  
	                               Map.Entry<Integer, Integer> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 
	          
	        // put data from sorted list to hashmap  
	        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
	        for (Map.Entry<Integer, Integer> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        return temp; 
	    }
	 
	 public static <K, V> K getKey(Map<K, V> map, V value) {
			for (Map.Entry<K, V> entry : map.entrySet()) {
				if (value.equals(entry.getValue())) {
					return entry.getKey();
				}
			}
			return null;
		}
	
    static void printSubsets(int[] a, HashMap<Integer, Integer> xz) 
    { 
        int n = a.length;  
        for (int i = 1; i < (1<<n); i++) 
        { 
  HashMap<Integer, Integer> occur= new HashMap<Integer, Integer> ();
  
            for (int j = 0; j < n; j++) 
            {
            	
            	
            	
            	
            	if ((i & (1 << j)) > 0) {
              //      System.out.print(a[j]+" ");
                    if(occur.containsKey(a[j])) {
                    	occur.put(a[j],occur.get(a[j])+1);
                    }
                    else {
                    	occur.put(a[j], 1);
                    }
                }
                
            
            
            
            }
        //    Map<Integer, Integer> hm1 = sortByValue(occur);
           int maxvalue= Collections.max(occur.values());
           int maxkey=getKey(occur, maxvalue)	;
     //      System.out.println(":"+maxkey);
           if(xz.containsKey(maxkey))
           {xz.put(maxkey,xz.get(maxkey)+1);}
           else
        	   {xz.put(maxkey,1);}
 
        } 
    }
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int	n = Integer.parseInt(st.nextToken());
int a[]=new int[n];
 st = new StringTokenizer(br.readLine());
for(int i=0;i<n;i++) {
	a[i]= Integer.parseInt(st.nextToken());
}
HashMap<Integer,Integer>xz= new HashMap<Integer,Integer>();

	Arrays.parallelSort(a);

	 printSubsets(a,xz); 
	 long c=1000000007;
	 for(int i=1;i<=n;i++) {
		 
		
			if(xz.get(i)==null) {
				System.out.print("0 ");
			}else {	 System.out.print(xz.get(i)%c+" ");
			}
	 }
	 System.out.println();

T--;

		}
	}
}