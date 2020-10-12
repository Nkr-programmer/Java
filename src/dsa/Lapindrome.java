package dsa;

import java.util.Scanner;

public class Lapindrome {

	public Lapindrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int n=0,k=0;
	String x="",y="",z="",q="";
	char u[] = null;
	    		if(sc.hasNext())
		    	{   x = sc.next();}


	    	n=x.length();
if(x.length()%2==0) {y=x.substring(0, n/2);z=x.substring((n/2),n);}
else {y=x.substring(0, n/2);z=x.substring((n/2)+1,n);}
char w,nx;
u=	z.toCharArray();
for(int i=0;i<y.length();i++) {
	w=y.charAt(i);
	 k=z.indexOf(w, i);
	 
	if(z.indexOf(w, i)!=-1)
	{
	if(k>=i) {
	u[k]=u[i];
	u[i]=w;
	}
	z=encode(u);
	}
	
	
	
}
boolean j=false;
	  if(u!=null) {
for(int i=0;i<y.length();i++) {
if(y.charAt(i)==u[i]) {j=true;

}
else {j=false;break;}
}
	  }
	  
	  if(j)System.out.println("YES");
	  else
		  System.out.println("NO");
	  
	 t--;
//	 6
//	 gaga
//	 abcde
//	 rotor
//	 xyzxy
//	 abbaab
//	 ababc
	    	}
	  
	
			}
			catch(Exception e){}

		
		
		
		
		
	}
	private static String encode(char[] u) {
		// TODO Auto-generated method stub
		String z="";
		for(int i=0;i<u.length;i++) {
			
			z+=	u[i];
			}
		
		return z;
	}
}
