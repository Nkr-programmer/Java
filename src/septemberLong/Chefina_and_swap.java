package septemberLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chefina_and_swap {

	public static void main (String[] args) throws java.lang.Exception
	{
	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int T = Integer.parseInt(br.readLine());
//int T=1;long n=4684659;
	while(T > 0)
	{
		//n=n+10;
		StringTokenizer st = new StringTokenizer(br.readLine());
long n= Long.parseLong(st.nextToken());
	//n=4684659  27304196  159140519 //127304196
		
if(n==1||n==2) {System.out.println("0");}
	else
		if(n>1000000) {
			
			if(n*(n+1)%4!=0) {System.out.println("0");}
			else {
				long mid =n*(n+1)/4;
				long fo=n-n/4;
				long x=0,b=fo;
				int h=0,v=100;
				while(b>0) {
					b=b/10;
					h++;
				}
				
				int hh=h-4;
				while(hh>0) {v=v*10;hh--;}

				//fo=257359311  n=343145748  v=100
				fo=fo-(6*v);

				x=checks(fo,mid,n,v);
				//System.out.println(n+" "+fo+" "+x+" "+mid+" "+(((x+1)*(x+2))/2)+" "+(((x)*(x+1))/2));
				System.out.println(x);
//				if(mid-(((x+1)*(x+2))/2)>=0) {System.out.println("jo");break;}
//				else
//					if(mid-(((x)*(x+1))/2)<=0) {System.out.println("jo");break;}
					
					}
		}
		else {
			
	if(n*(n+1)%4!=0) {System.out.println("0");}
	else {
		long mid =n*(n+1)/4;
		long fo=n-n/4;
		
		long x=0;
		x=check(fo,mid,n);
		System.out.println(x);
			}
		

	}
			
	T--;
	}
    

    }

	private static long checks(long fo, long mid, long n, int v) {
		// TODO Auto-generated method stub
		
		if(v==1) {return n-fo;}
		v=v/10;
		long h=(fo*(fo+1))/2;
		//System.out.println(n+"   "+fo+" "+mid+" "+(((fo+1)*(fo+2))/2)+" "+h);
		
		while(h<mid) {
			fo=fo+v;
			 h=(fo*(fo+1))/2;
			
		}
		 if(h==mid) {
				fo=(((n-fo)*(n-fo+1))/2)+((fo*(fo-1))/2);return fo;}
		 else {
		fo=fo-v;
		fo=checks(fo,mid,n,v);}
		return fo;
		
		
		
	}

	private static long check(long fo, long mid, long n) {
		// TODO Auto-generated method stub
		long g=fo;
		while((g*(g+1)/2)>mid) {g--;
		if((g*(g+1)/2)==mid) {
			g=(((n-g)*(n-g+1))/2)+((g*(g-1))/2);return g;
				}
		}
		
	return n-g;
		
	}
    }
    
    