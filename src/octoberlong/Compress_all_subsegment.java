package octoberlong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Compress_all_subsegment {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	
 /* Integer size in bits */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T = Integer.parseInt(br.readLine());
			long []a=new long[(int)T];
			StringTokenizer st = new StringTokenizer(br.readLine());
			HashMap<Long,Long>x=new HashMap<Long,Long>();
		        for(int i=0;i<T;i++) 
		        {int n1 = Integer.parseInt(st.nextToken());	a[i]=n1;
		        if(x.containsKey(a[i])) {x.put(a[i],x.get(a[i])+1);}
		        else{x.put(a[i],(long) 1);}
		        x.put(a[i],x.get(a[i])%2);}
		        Arrays.parallelSort(a);
long sum=0;
int h=(int)(T-1);
for(int k=0;k<T;k++)
 sum+=gethighestof(a[k]);

for(int i=0;i<T-1;i++)
{ long  g=a[i];
if(x.get(g)==0) {continue;}	
	for(int j=i+1;j<T;j++)
	{if(x.get(a[j])==0) {continue;}
		g=g^a[j];
	sum+=gethighestof(g);
x.put(a[j],x.get(a[j])-1);
	}	
}
System.out.println(sum);

}private static long gethighestof(long l) {
	// TODO Auto-generated method stub
    long num, order = -1, i;


   num=l;

    /* Iterate over each bit of integer */
    for(i=0; i<32; i++)
    {
        /* If current bit is set */
        if(((num>>i) & 1)!=0)
            order = i;
    }
long h=0;
    if (order != -1) {
    	if(order>0) h=(long) Math.pow(2, order);}
    else {}

	return h;
}
	}
	