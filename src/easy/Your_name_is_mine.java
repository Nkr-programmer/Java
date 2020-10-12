package easy;
//                                        WRONG ANSWER
import java.util.Scanner;

public class Your_name_is_mine {

	public Your_name_is_mine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    while(t>0) {

	    		String j=sc.next();
	    		String k=sc.next();
	    		int v=0,m=0,o=0,h=-1;
	
	    		char g;
	    		if(j.length()>=k.length()) {
	    			while(v<j.length()) {
	    			
	    			g=j.charAt(v++);
	    			if(g==j.charAt(m)) {m++;}
	    			
	    			}
	    			if(m==k.length())System.out.println("YES");
	    			else
	    		System.out.println("NO");	
	    		}else
	    			 {
	    				while(v<k.length()) {
	    	    			
	    	    			g=k.charAt(v++);
	    	    			if(g==k.charAt(m)) {m++;}
	    	    			
		    		}if(m==j.length())System.out.println("YES");
	    			else
	    		System.out.println("NO");	
	    		   }t--;
	  

	    	
	
	 //	System.out.println(j+" "+k);
	    	
	    	}
	  
		}
			
			catch(Exception e){}

	}

}
