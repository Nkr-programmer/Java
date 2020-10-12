package dsa;

import java.util.HashMap;
import java.util.Scanner;

public class Not_all_flavors {

	public Not_all_flavors() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int n = 0,k = 0;
	    	
	    	HashMap<Integer,Integer> ki=new HashMap<Integer,Integer>();
	    	
	    		if(sc.hasNext())
		    	{   n = sc.nextInt();}
	    		if(sc.hasNext())
		    	{   k = sc.nextInt();}
int [] a=new int[n];
	    		for(int i=0;i<n;i++)
	    		{
	    			a[i]=sc.nextInt();
	    		}
	    		
	    		int b=0,j=0,g=0,z=0,g1=0;
for(int i=0;i<n;i++)
{
if(ki.containsKey(a[i])){
	ki.put(a[i],ki.get(a[i])+1);
}
else
{
ki.put(a[i],1);

}
g=i;
while(ki.size()==k)
{
	int y=a[g1++];
	ki.put(y,ki.get(y)-1);
	if(ki.get(y)==0)
	{
		ki.remove(y);
	}
}


if(ki.size()!=k)
{
	z=Integer.max(g1-g+1 ,z);
}

}
	    		
	System.out.println(z);

	

t--;
	    	
	    	}
//	    	2
//	    	8
//	    	2
//	    	1 1 1 2 2 1 2 1
//	    	10 2
//	    	1 1 2 2 1 1 2 2 1 2
			}
			catch(Exception e){}
	}

}
