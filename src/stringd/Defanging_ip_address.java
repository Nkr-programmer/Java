package stringd;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


//Character.getNumericValue(ch);



public class Defanging_ip_address {
//1
	
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		
//		
//		
//		
//Scanner sc=new Scanner(System.in);
//String h;
//h= sc.nextLine();
//h=h.replace(".", "[.]");
//System.out.println(h);
//	}
//
//}
//
//public class Splitting_a_string_in_a_balanced_ {
//
//	public static void main(String[] args) {
//		
//		
//		
//		
//		
//Scanner sc=new Scanner(System.in);
//String h;
//h= sc.nextLine();
//int g=0,n=0;
//boolean v=true;
//for(int i=0;i<h.length();i++) {
//	if(g==0) {
//	n++;
//		if(h.charAt(i)=='L') {
//			v=true;
//		}
//		else
//			if(h.charAt(i)=='R') {
//				v=false;
//			}
//	}
//	 
//		if(v) {
//			
//			if(h.charAt(i)=='L') {g++;}
//			else 
//				if(h.charAt(i)=='R') {g--;}
//			
//		}
//		else {
//			
//			if(h.charAt(i)=='R') {g++;}
//			else 
//				if(h.charAt(i)=='L') {g--;}
//		
//	}
//	
//	
//}
//System.out.println(n);
//
//
//	}
	//public class Unique_morse_code_words {
	
	
	//2
	
	
	
	
//
//		public static void main(String[] args) {
//		
//			Scanner sc= new Scanner(System.in);
//	HashSet<String>a=new HashSet<String>();
//	String[]a1=new String[4];
//	for(int i=0;i<4;i++) {
//	a1[i]=sc.nextLine();}
//	
//	for(int i=0;i<a1.length;i++) {
//		
//		String d=a1[i];
//		d=d.replace("a", ".-");
//		d=d.replace("b", "-...");
//		d=d.replace("c", "-.-.");
//		d=d.replace("d", "-..");
//		d=d.replace("e", ".");
//		d=d.replace("f", "..-.");
//		d=d.replace("g", "--.");
//		d=d.replace("h", "....");
//		d=d.replace("i", "..");
//		d=d.replace("j", ".---");
//		d=d.replace("k", "-.-");
//		d=d.replace("l", ".-..");
//		d=d.replace("m", "--");
//		d=d.replace("n", "-.");
//		d=d.replace("o", "---");
//		d=d.replace("p", ".--.");
//		d=d.replace("q", "--.-");
//		d=d.replace("r", ".-.");
//		d=d.replace("s", "...");
//		d=d.replace("t", "-");
//		d=d.replace("u", "..-");
//		d=d.replace("v", "...-");
//		d=d.replace("w", ".--");
//		d=d.replace("x", "-..-");
//		d=d.replace("y", "-.--");
//		d=d.replace("z", "--..");
//	a.add(d);
//	}
//
//	System.out.println(a.size());
//			
//	
//		}
//	
//
//	public static void main(String[] args) {
//	
//		Scanner sc= new Scanner(System.in);
//	List<List<String>>a=new ArrayList<>();
//	for(int i=0;i<4;i++){
//	List<String>b=new LinkedList<String>();
//	
//	for(int j=0;j<2;j++) {
//		b.add(sc.next());
//	}
//	a.add(b);
//	}
//
//
//	 HashSet<String> at=new HashSet<String>();
//     for(List<String> p:a) {
//     	at.add(p.get(0));
//     }
//     for(List<String> p:a) {
//     	if(!at.contains(p.get(1))) {
//     		System.out.println( p.get(1));
//     	break;
//     	}
//     }
//
//	
//	}
	
//3
	
	
	
	
//	public static void main(String[] args) {
//	
//		Scanner sc= new Scanner(System.in);
//String s= sc.next();
//s= nott(s);
//
//System.out.println(s);
//	
//	}
//    public static String nott(String s) {
//    	ArrayList<Character>a=new ArrayList<Character>() ;
//    	for(int i=s.length()-1;i>=0;i--) {
//    		if(s.charAt(i)=='#') {
//    			if(s.charAt(i-2)=='1') {
//    				a.add((char)((int)s.charAt(i-1)+48+10));
//    				i=i-2;
//    			}
//    			else
//    			{
//    				a.add((char)((int)s.charAt(i-1)+48+20));
//    				i=i-2;
//    			}
//    			
//    		}else{
//a.add((char)((int)s.charAt(i)+48));
//    	}
//    		}
//    	String h="";
//    for(int i=a.size()-1;i>=0;i--) {
//    	h=h+(a.get(i));
//    }
//
//return h;
//    }

//4
//	public static void main(String[] args) {
//		
//		Scanner sc= new Scanner(System.in);
//String s= sc.next();
//boolean g= judgeCircle(s);
//
//System.out.println(g);
//	
//	}
//	
//    public static boolean judgeCircle(String moves) {
//        int u=0,l=0;
//    	for(int i=0;i<moves.length();i++) {
//    		
//    		if(moves.charAt(i)=='U'||moves.charAt(i)=='D') {
//    			if(moves.charAt(i)=='U') {u++;}
//    			if(moves.charAt(i)=='D') {u--;}
//    		}
//    		else
//    	 		if(moves.charAt(i)=='L'||moves.charAt(i)=='R') {
//        			if(moves.charAt(i)=='L') {l++;}
//        			if(moves.charAt(i)=='R') {l--;}
//    	 		}
//    		
//    	}
//    	if(l==0&&u==0) {
//    		return true;
//    	}
//    	else {
//    		return false;
//    	}
//    	
//    }
	
	
	
//5	
	
//	public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//String s= sc.nextLine();
// s=reverseWords(s);
//System.out.println(s);
//}
//
//	
//	  public static String reverseWords(String s) {
//	      String[]d=s.split(" ");
//	      
//		int i=0;
//	      StringBuilder g=new StringBuilder();
//	for(String word:d)
//	{g.append(new StringBuffer(word).reverse().toString()+" ");
//	}
//	      return g.toString().trim();}
//	    
//	    public void reverseString(char[] s) {
//	        
//	        int left = 0, right = s.length - 1;
//	         while (left < right) {
//	             char tmp = s[left];
//	             s[left++] = s[right];
//	             s[right--] = tmp;
//	         }
//	     }	
//	public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//String s= sc.nextLine();
//String p= sc.nextLine();
// boolean sm=buddyStrings(s,p);
//System.out.println(sm);
//}
//    public static boolean buddyStrings(String a, String b) {
//        if(a.length()!=b.length()) {return false;}
//    	int ghj=0,a1=0,b1=0;
//    	HashSet<Character> c= new HashSet<Character>();
//        for(int i=0;i<a.length();i++) {
//        	if(a.charAt(i)==b.charAt(i)) {
//        		c.add(a.charAt(i));
//        	}else {
//        	
//        		ghj++;
//        		if(ghj==1) {a1=i;}
//        		if(ghj==2) {b1=i;}
//        	}
//        }
//    	if(ghj==0) {
//    		if(a.length()>c.size()) {return true;}
//    	}
//    	if(ghj!=2) {return false;}
//    	
//    	
//    	if((a.charAt(a1)==b.charAt(b1))&&a.charAt(b1)==b.charAt(a1)) {return true;}
//    	
//    	return false;
//    }
//abaababa
//abaabaa
	
	//5
	
	
//	
//	public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//String s= sc.nextLine();
//String p= sc.nextLine();
// int sm=repeatedStringMatch(s,p);
//System.out.println(sm);
//}
//    public  static int repeatedStringMatch(String a, String b) {
//    	 if(a.contains(b)) { return 1;}   
//    	    int g=0,m=0,v=1;
//    	      String x=a;
//    	      x=x+a;
//    	      System.out.println(x);
//    	     while(v<=b.length()&&x.contains(b.substring(0, v))) {g=x.indexOf(b.substring(0, v));v++;}
//    	  
//    	     m=g;
//    	    char[] c= a.toCharArray();
//    	    char[] d= b.toCharArray();
//    	    for(int i=0;i<d.length;i++) {
//    	    	if(g==c.length) {g=0;}
//    	    	if(c[g]==d[i]) {
//    	   
//    	    	}
//    	    	else {return -1;}
//    	    	g++;
//    	    }
//    	    int r=0;
//    	    if((c.length-m)>0)r=1;
//    	   r=r+ (d.length-(c.length-m))/c.length;
//    	    if((d.length-(c.length-m))%c.length!=0) {r=r+1;}
//    	   
//    	    return r;
//    	    }

	
	
	//6
	
//	public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//String s= sc.nextLine();
//int sm=lengthOfLastWord(s);
//System.out.println(sm);
//}
//    public static int lengthOfLastWord(String s) {
//    	
//    	
////     	s=s.trim();
////        int y=	s.length()-s.lastIndexOf(" ")-1;
////         
////            return y;
//    	
//    	
//        char []t= s.toCharArray();
//         int e=0,n=t.length,j=0;
//      for(int i=n-1;i>=0;i--) {
//    	  if(t[i]==' ') {
//    		if(e==0) {  
//    		  e=0;continue;}
//    		if(e==1) {break;}
//    		  
//    	  }
//    	  
//    	  
//    	  
//    	  if(t[i]!=' ') {e=1;j++;}
//    	  
//    	  
//      }
//      
//        return j;
//    }
//    
    
    
    //6
//	public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//String s= sc.nextLine();
//String p= sc.nextLine();
//int sm=strStr(s,p);
//System.out.println(sm);
//}
	
//	
//    public  static int strStr(String haystack, String needle) {
//
//    	if(needle=="")return 0;
//    	
//    	return haystack.indexOf(needle);
//    	
//    	
//    }
    
    
    //7
//    
//    
//	public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//String []h=new String[5];
//for(int i=0;i<5;i++)
//h[i]= sc.nextLine();
//
//String sm=longestCommonPrefix(h);
//System.out.println(sm);
//}
//    
//    
//    public  static String longestCommonPrefix(String[] strs) {
//       
//        if(strs.length==0)return "";
//        if(strs[0].equals(""))return "";  
//      int a=0,b=Integer.MAX_VALUE;
//      for(int i=1;i<strs.length;i++) {
//   	   int j=0;a=0;
//   	  while(j<strs[i].length()&&j<strs[0].length()) {
//   		  if(j>b) {break;}
//   	if(strs[i].charAt(j)==strs[0].charAt(j)) {a++;}
//   	else {break;}
//   		  
//   		  
//   		  j++;
//   	  }
//   	  if(b>a) {b=a;}
//      }
//      
//      StringBuffer v= new StringBuffer();
//    if(b==0){return "";}
//    if(b==Integer.MAX_VALUE) {
//        
//        if(strs.length==1){return strs[0];}
//        else
//        return "";}
//     {v.append(strs[0].substring(0, b));
//   	  return v.toString();}
//   }
    
    //7
    
    
    
//	public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//
//String h= sc.next();
//boolean  sm=validPalindrome(h);
//System.out.println(sm);
//}
//    
//    //"ebcbbececabbacecbbcbe"
//    public static boolean validPalindrome(String s) {
//        char [] a= s.toCharArray();
//        int b=0,c=a.length-1;
//        int mistakes=0;
//        boolean x=true;
//        for(int i=0;i<a.length/2;i++) {
//        
//        	
//        	
//        	if(a[b+i]==a[c-i]) {
//        		System.out.println(a[b+i]+" "+a[c-i]);
//        		x=true;
//        	}
//        	else {
//        		mistakes++;
//        			if(a[b+i+1]==a[c-i]) {
//        				
//        				b++;}else
//        		if(a[b+i]==a[c-i-1]) {c--;}
//        		else {mistakes++;}
//        	}
//        	
//        	if(mistakes>1) {x= false;break;}
//        }
//         b=0;c=a.length-1;
//         mistakes=0;
//       
//        boolean y=true;
// for(int i=0;i<a.length/2;i++) {
//        
//        	
//        	
//        	if(a[b+i]==a[c-i]) {
//        		System.out.println(a[b+i]+" "+a[c-i]);
//        		y=true;
//        	}
//        	else {
//        		mistakes++;
//        		if(a[b+i]==a[c-i-1]) {c--;}else
//        			if(a[b+i+1]==a[c-i]) {b++;}else {mistakes++;}
//        	}
//        	
//        	if(mistakes>1) {y= false;break;}
//        }
//       
// if(x||y) {
//	 return true;
// }
// return false;
// 
//       
//    }
//    
//8
	
	
//	public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//
//String h= sc.next();
//String  sm=reverseVowels(h);
//System.out.println(sm);
//}
//    
//    public static String reverseVowels(String s) {
//    
//    	StringBuffer a= new StringBuffer();
//    	a.append(s);
//    	int left=0,right= s.length()-1;
//        while(left<right) {
//        	if((s.charAt(left)=='a'||s.charAt(left)=='e'||
//        			s.charAt(left)=='i'||s.charAt(left)=='o'||s.charAt(left)=='u'||
//        			s.charAt(left)=='A'||s.charAt(left)=='E'||
//        			s.charAt(left)=='I'||s.charAt(left)=='O'||s.charAt(left)=='U')
//        			&&(s.charAt(right)=='a'||s.charAt(right)=='e'||
//        			s.charAt(right)=='i'||s.charAt(right)=='o'||s.charAt(right)=='u'||
//        			s.charAt(right)=='A'||s.charAt(right)=='E'||
//        			s.charAt(right)=='I'||s.charAt(right)=='O'||s.charAt(right)=='U')) {
//        		char h= a.charAt(right);
//        		a.setCharAt(right, a.charAt(left));
//        		a.setCharAt(left, h);left++;right--;
//        	}else
//        	if((s.charAt(left)=='a'||s.charAt(left)=='e'||
//        			s.charAt(left)=='i'||s.charAt(left)=='o'||s.charAt(left)=='u'||
//        			s.charAt(left)=='A'||s.charAt(left)=='E'||
//        			s.charAt(left)=='I'||s.charAt(left)=='O'||s.charAt(left)=='U')
//        			||(s.charAt(right)=='a'||s.charAt(right)=='e'||
//        			s.charAt(right)=='i'||s.charAt(right)=='o'||s.charAt(right)=='u'||
//         			s.charAt(right)=='A'||s.charAt(right)=='E'||
//        			s.charAt(right)=='I'||s.charAt(right)=='O'||s.charAt(right)=='U')){
//        		
//        		if(s.charAt(left)=='a'||s.charAt(left)=='e'||
//            			s.charAt(left)=='i'||s.charAt(left)=='o'||s.charAt(left)=='u'||
//            			s.charAt(left)=='A'||s.charAt(left)=='E'||
//            			s.charAt(left)=='I'||s.charAt(left)=='O'||s.charAt(left)=='U')
//        		{right--;}
//        		else
//        			if(s.charAt(right)=='a'||s.charAt(right)=='e'||
//                			s.charAt(right)=='i'||s.charAt(right)=='o'||
//                			s.charAt(right)=='u'||
//                 			s.charAt(right)=='A'||s.charAt(right)=='E'||
//                			s.charAt(right)=='I'||s.charAt(right)=='O'||s.charAt(right)=='U')
//        			{left++;}
//        			
//        		
//        		
//        	}else {left++;right--;}
//        }
//        System.out.println(a.toString());
//        return a.toString();
//    }
//  
	
    

}