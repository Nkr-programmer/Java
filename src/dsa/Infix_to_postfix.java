package dsa;

import java.util.Scanner;
import java.util.Stack;



public class Infix_to_postfix {

public static int prev(char c) {
			switch(c) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;

			}
			 return -1;
		} 
		
		

		public static String intopost(String expre) {
			
			Stack<Character> s= new Stack<Character>();
			String  temp= new String("");
		
			
			for(int i=0;i<expre.length();i++)
			{
				char c=expre.charAt(i);
			
				if(Character.isLetterOrDigit(c))
			{
				temp+=c;
				//System.out.println(temp);
			}
			else
				if(c=='(')
				{
					s.push(c);
					
					
				}
				else
					if(c==')')
					{
						
						while((!s.isEmpty())&&(s.peek()!='(')){
							temp+=s.pop();
							
						}
						//if(s.peek()=='(')
							s.pop();
							
					}
					else {
						
						while((!s.isEmpty())&&(prev(c)<=prev(s.peek()))) {
							temp+=s.pop();
						}
						
						s.push(c);
						
					}
			
			}
		
			while(!s.isEmpty())
			{
				temp+=s.pop();
		
			}
			return temp;
		} 
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			try{
				 int  t=0;
				
		    	Scanner sc = new Scanner(System.in);
		    	if(sc.hasNext())
		    	{   t = sc.nextInt();}
		    	while(t>0) {int n=0;
			    		if(sc.hasNext())
			    	{   n = sc.nextInt();} 
			    	String expre =sc.next();
			expre=intopost(expre);
			System.out.println(expre);

			    		t--;

		    	}
		 
				}
				catch(Exception e){}
		
		}

	}
	
