package septemberLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divide_candies {

    public static void main (String[] args) throws IOException 
	    { 
    	
    	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		int k=Integer.parseInt(br.readLine());
    		    	int T = Integer.parseInt(br.readLine());
    			while(T > 0)
    			{
    				StringTokenizer st = new StringTokenizer(br.readLine());
    				int		n = Integer.parseInt(st.nextToken());
    				int h=n;
    				StringBuilder a= new StringBuilder();
    				if(k==1) {
    					int g=n%4;
    					if(g==1||g==2) {System.out.println("1");}
    					else {System.out.println("0");}
    					
    					if(g==1) {a.append("1"); }
    					else
    						if(g==2) {a.append("01");}else
    					if(g==3) {a.append("001");}
    					while(n>=4)
    					{a.append("1001");n=n-4;}
    					for(int i=h-1;i>=900000;i--)
    					{System.out.println(a.toString().charAt(i)+" "+i);}
    					
    					//System.out.print(a.toString());
    					System.out.println();
    				}
    					else
    				if(k==2) {
    					int g=n%8;
    					if(g==1||g==6) {System.out.println("1");}
    					else
    					if(g==2||g==5) {System.out.println("3");}
    					else
    					if(g==3) {System.out.println("4");}
    					else 
    					if(g==4) {System.out.println("2");}
    					else {System.out.println("0");}
    					
    					if(g==1) {a.append("1");}
    					else
    					if(g==2) {a.append("01");}
    					else
    					if(g==3) {a.append("001");}
    					else 
    					if(g==4) {a.append("0001");}
    					else
    					if(g==5) {a.append("01001");}
    					else
    					if(g==6) {a.append("101001");}
    					else
    					if(g==7) {a.append("1101001");}
    					while(n>=8)
    					{a.append("01101001");n=n-8;}	
    					for(int i=h-1;i>=900000;i--)
    					{System.out.println(a.toString().charAt(i)+" "+i);}
    					
    					//System.out.print(a.toString());
    			
    					System.out.println();
    				}
    				else
    				if(k==3) {
    					int g=n%16;
    					if(g==1||g==14) {System.out.println("1");}
    					else
    					if(g==2||g==6) {System.out.println("7");}
    					else
    					if(g==3) {System.out.println("18");}
    					else 
    					if(g==4) {System.out.println("28");}
    					else
    					if(g==5) {System.out.println("25");}
    					else
    					if(g==7) {System.out.println("26");}
    					else
    					if(g==8) {System.out.println("4");}
    					else 
    					if(g==9||g==13) {System.out.println("5");}
    					else
    					if(g==10) {System.out.println("17");}
    					else
    					if(g==11) {System.out.println("12");}
    					else
    					if(g==12) {System.out.println("2");}
    					else {System.out.println("0");}
    					
    					if(g==1) {a.append("1");}
    					else
    					if(g==2) {a.append("01");}
    					else
    					if(g==3) {a.append("001");}
    					else 
    					if(g==4) {a.append("0001");}
    					else
    					if(g==5) {a.append("00001");}
    					else
    					if(g==6) {a.append("010001");}
    					else
    					if(g==7) {a.append("1110001");}
    					else
    					if(g==8) {a.append("11001001");}
    					else
    					if(g==9) {a.append("100101001");}
    					else
    					if(g==10) {a.append("1110101001");}
    					else 
    					if(g==11) {a.append("00001101001");}
    					else
    					if(g==12) {a.append("001001101001");}
    					else
    					if(g==13) {a.append("0011001101001");}
    					else
    					if(g==14) {a.append("01011001101001");}
    					else
    				    if(g==15) {a.append("001011001101001");}
    					while(n>=16)
    					{a.append("1001011001101001");n=n-16;}
    					for(int i=h-1;i>=900000;i--)
    					{System.out.println(a.toString().charAt(i)+" "+i);}
    					
    					//System.out.print(a.toString());
    					System.out.println();
    				}
    				
    				else {
    	StringBuilder a9= new StringBuilder();
    	long a1=0,b1=0,diff=0;
    	long cons=0;
    				 for(int i=n;i>0;i--) {
    					 cons=(long) Math.pow(i, k);
    		if(a1==b1) {a1=a1+cons;a9.append('1');}
    		else
    			if(a1>b1) {b1=b1+cons;a9.append('0');}
    			else
    			{a1=a1+cons;a9.append('1');}
    					 }
    			 System.out.println(Math.abs(a1-b1));   
    		System.out.println(a9.reverse());
    				}
    				
    			T--;
    			}
    		    

 
    		    }
    		    }