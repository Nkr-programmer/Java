package stringd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Ispalindrone {
//1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		String a= sc.next();
	     
		
	boolean d=repeatedSubstringPattern(a); 
		System.out.println(d);
	}

//	private static boolean isPalindrome(String h) {
//		h= h.toLowerCase();
//		char[]a= h.toCharArray();
//		
//		for(int i=0;i<a.length;i++) {
//			if((a[i]>='a'&&a[i]<='z')||(a[i]>='0'&&a[i]<='9')) {}
//			else {
//				a[i]='+';
//			}
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]);
//		}
//		
//		int left=0,right=a.length-1;
//		boolean x= true;
//		while(left<right) {
//			if(a[left]=='+'&&a[right]=='+') {
//				
//				left++;right--;
//				
//
//			}
//			else
//				if(a[left]=='+'||a[right]=='+') {
//					if(a[left]=='+') {
//						left++;
//					}
//					else {right--;}
//				}
//				else {
//					if(a[left]==a[right]) {x= true;left++;right--;}
//					else {x= false;
//					return x;}
//				}
//		
//		}
//	return true;
//	}
	
	//2
//    public static int countSegments(String s) {
//    	s= s.trim();
//    	if(s.equals(""))return 0;
//   	      String[]d=s.split("\\s+");
//   	    
//   	    
//    return d.length;}
//    	    
// }
//	
//	//3
//    public  static boolean isLongPressedName(String name, String typed) {
//    	if(name.equals(""))return false;
//    	if(typed.equals("")) return false;
//    	int j=0,count=1;
//    	boolean x= true;
//       for(int i=0;i<typed.length();) {
//    	   
//             if(j>=name.length()&&i<typed.length()) {
//    		   x= false; return x;
//    	   }
//           
//           
//    	   if(name.charAt(j)==typed.charAt(i)) {
//        int initial=nosofsame(name,count,j);j=j+initial;
//       int fin= nosofsame(typed,count,i);i=i+fin;
//       
//        if(fin<initial) 
//         {x= false;return x;}
//        
//    	   }else
//    	   {
//    		   x= false ;return x;
//    	   }
//           
//           
//    	   if(i>=typed.length()&&j<name.length()) {
//    		   x= false; return x;
//    	   }
//       }
//        return true;
//    }
////4
//public static String countAndSay(int n) {
//	int i=1;
//	StringBuilder s=new StringBuilder("1");
//	StringBuilder t=recurse(n,i,s);
//	return t.toString();
//    
//}
//
//private static StringBuilder recurse(int n, int i,StringBuilder d2) {
//	// TODO Auto-generated method stub
//	if(i>=n) {return d2;}
//	int index=0;
//	StringBuilder d=new StringBuilder();
//	while(index<d2.length()) {
//	int r=nosofsames(d2,1,index);
//	//System.out.print(r);
//	
//	d.append(r);
//	d.append(d2.charAt(index));
//	index=index+r;
//	}
//	
//	d=recurse(n,i+1,d);
//	return d;
//}
//private static int nosofsames(StringBuilder d2,int count,int j) {
//	// TODO Auto-generated method stub
//	while(j<(d2.length()-1)&&d2.charAt(j)==d2.charAt(j+1)) {
//		j++;count++;
//	}
//	return count;	
//}
//5
//public static String mostCommonWord(String p, String[] banned) {
//	
//	p=p.toLowerCase();
//	p=containing(p);
//	String[] a=p.split("\\s+");
//	
//
//
//	HashMap<String ,Integer> na= new 	HashMap<String ,Integer>() ; 
//	for(int i=0;i<a.length;i++) {
//
//		if(na.containsKey(a[i])) {na.put(a[i], na.get(a[i])+1);}
//		else {
//			na.put(a[i], 1);
//		}
//	}
//System.out.println(na);
//	int g=0;String go="";
//	for(Entry<String ,Integer>aa:na.entrySet()) {
//		
//		if(!contained(banned,aa.getKey())) {
//		if(g<=aa.getValue()) {
//			g=aa.getValue();
//			
//		
//			 go=aa.getKey();}
//		}
//	}
//	
//    return go;
//}
//
//private static boolean contained(String[] banned, String go) {
//	// TODO Auto-generated method stub
//	for(int i=0;i<banned.length;i++) {
//		if(banned[i].equals(go)) {
//			
//			return true;
//		}
//	}
//	return false;
//}
//
//private static String containing(String a) {
//	StringBuilder v=new StringBuilder();
//	v=v.append(a);
//	// TODO Auto-generated method stub
//	for(int i=0;i<v.length();i++) {
//		if(v.charAt(i)>='a'&&v.charAt(i)<='z') {}
//		else if(v.charAt(i)=='!'||v.charAt(i)=='?'||
//               v.charAt(i)==','||v.charAt(i)==';'||v.charAt(i)=='.') {
//
//			v.deleteCharAt(i);
//			v.insert(i, ' ');
//		}else
//			if(v.charAt(i)==' ') {
//			
//		}
//		
//		
//		else{
//			
//			v.deleteCharAt(i);
//			v.insert(i, ' ');
//			
//		}	}
//	
//	
//	return v.toString();
//}
//6
//    public static String addBinary(String a, String b) {
//    	int v= a.length()-b.length();
//    	StringBuilder p=new StringBuilder();
//    	StringBuilder q=new StringBuilder();
//    	if(v>0) {
//    		
//    		q=q.append(b); q=q.reverse();
//    		while(v!=0) {
//    		q.append('0');v--;}
//    		q=q.reverse();
//    		p.append(a);
//    	}
//    	else
//    		if(v<0) {
//    			p=p.append(a); p=p.reverse();
//        		while(v!=0) {
//        		p.append('0');v++;}
//        		p=p.reverse();
//        		q=q.append(b);
//    		}
//    		else {
//    			p=p.append(a);
//    			q=q.append(b);
//    		}
//        StringBuilder d= new StringBuilder();
//        
//        int i=0;char c='0';
//        String t=binary(p,q,d,c,i);
//        StringBuffer q1=new StringBuffer();
//        q1.append(t);
//        q1=q1.reverse();
//		return q1.toString();
//    }
//
//private static String binary(StringBuilder a, StringBuilder b, StringBuilder d, char c, int i) {
//	// TODO Auto-generated method stub
//	
//	if(a.equals(""))return b.toString();
//	if(b.equals(""))return a.toString();
//	
//	if(i==a.length()) {
//		if(c=='1') {d.append('1');}
//		return d.toString();}
//	if(i==b.length()) {
//		if(c=='1') {d.append('1');}
//		return d.toString();}
//	
//	int z=0,x=0,y=0;
//	if(a.charAt(a.length()-1-i)=='1')
//	z=1;
//	if(b.charAt(b.length()-1-i)=='1')
//		y=1;
//	if(c=='1')
//		x=1;
//	x=x+y+z;
//	
//	if(x==0) {binary(a,b,d.append('0'),'0',i+1);}
//	else if(x==1){binary(a,b,d.append('1'),'0',i+1);}
//	else if(x==2) {binary(a,b,d.append('0'),'1',i+1);}
//	else if(x==3) {binary(a,b,d.append('1'),'1',i+1);}
//
//	
//	return d.toString();
//}
	//7
//    public static boolean checkRecord(String s) {
//        int left=0,right=0;
//       boolean x= true;
//     for(int i=0;i<s.length()-2;i++) {
//   	  if(s.charAt(i)=='A') {left++; if(left==2) {x= false;return x;}}
//   	  else {
//   		  if(s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L') {x= false;return x;}
//   	  } 
//     }
//     if(s.length()>=2&&s.charAt(s.length()-2)=='A') { left++;if(left==2) {x=false;return x;}}
//     if(s.length()>=1&&s.charAt(s.length()-1)=='A') { left++;if(left==2) {x=false;return x;}}
//       return true;
//   }
	
	//8
//	
//	
//    public String addStrings(String a, String b) {
//     	int v= a.length()-b.length();
//    	StringBuilder p=new StringBuilder();
//    	StringBuilder q=new StringBuilder();
//    	if(v>0) {
//    		
//    		q=q.append(b); q=q.reverse();
//    		while(v!=0) {
//    		q.append('0');v--;}
//    		q=q.reverse();
//    		p.append(a);
//    	}
//    	else
//    		if(v<0) {
//    			p=p.append(a); p=p.reverse();
//        		while(v!=0) {
//        		p.append('0');v++;}
//        		p=p.reverse();
//        		q=q.append(b);
//    		}
//    		else {
//    			p=p.append(a);
//    			q=q.append(b);
//    		}
//        StringBuilder d= new StringBuilder();
//        
//        int i=0;char c='0';
//        String t=binary(p,q,d,c,i);
//        StringBuffer q1=new StringBuffer();
//        q1.append(t);
//        q1=q1.reverse();
//		return q1.toString();
//    }
//
//private static String binary(StringBuilder a, StringBuilder b, StringBuilder d, char c, int i) {
//	// TODO Auto-generated method stub
//	
//	if(a.equals(""))return b.toString();
//	if(b.equals(""))return a.toString();
//	
//	if(i==a.length()) {
//		if(c!='0') {d.append((char)((int)(c)-48));}
//		return d.toString();}
//	if(i==b.length()) {
//		if(c!='0') {d.append((char)((int)(c)-48));}
//		return d.toString();}
//	
//	int z=0,x=0,y=0;
//	z=(int)(a.charAt(a.length()-1-i))-48;
//	y=(int)(a.charAt(a.length()-1-i))-48;
//	x=(int)(c)-48;
//	x=x+y+z;
//	
//	 y= x%10;
//	 z=x/10;
//	if(x>9) {binary(a,b,d.append((char)((int)(y)+48)),(char) (z+48),i+1);}
//	else {binary(a,b,d.append((char)((int)(x)+48)),'0',i+1);}
//
//
//	
//	return d.toString();
//}    
   //9

//    public static String reverseOnlyLetters(String s) {
//        char[]a = s.toCharArray();
//        
//        int left=0,right=a.length-1;
//
//     while(left<right) {
//     	if(isvalid(a[left])&&isvalid(a[right])) {
//     		char  temp=a[right];
//     	a[right]=a[left];
//     	a[left]=temp;
//     		left++;right--;
//     	}
//     	else
//     		if(isvalid(a[left])||isvalid(a[right])) {
//     			if(isvalid(a[left])) {right--;}
//     			else {left++;}
//     		}
//     		else {left++;right--;}
//     }
//     
//     StringBuilder a1= new StringBuilder();
//     for(char x:a)
//     a1.append(x);
//     
//     return a1.toString();
//       }
//
//
//   private static boolean isvalid(char c) {
//   	// TODO Auto-generated method stub
//   	if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
//   		return true;
//   	}
//   	return false;
//   }
//10
//   public  static String makeGood(String s) {
//    StringBuilder k= new StringBuilder();
//    k.append(s);
//   StringBuilder ki=removed(k);
//    return k.toString();
//   }
//
//private static StringBuilder removed(StringBuilder k) {
//	// TODO Auto-generated method st
//	
//	if(k.length()<=1) {return k;}
//	
//	for(int i=0;i<k.length()-1;i++) {
//		int cvv= (int)(k.charAt(i))-(int)(k.charAt(i+1));
//		
//	if(cvv==32||cvv==-32) {
//		
//		k.deleteCharAt(i);
//		k.deleteCharAt(i);
//		removed(k);
//	}
//		}
//	return  k;
//}
	
	//11
//    public static String reverseStr(String s, int k) {
//     StringBuilder a= new StringBuilder();
//     StringBuilder temp= new StringBuilder();
//     int h=0;
//     for(int i=0;i<s.length();i++) {
//    	 if(h!=k&&h!=2*k) {h++;
//    	 a.append(s.charAt(i));
//    	 if(h==k) {a.reverse();}
//    	 if(h==2*k) {temp.append(a);a.delete(0, a.length());h=0;}
//     	}
//    	 else
//    	 if(h==k) { a.append(s.charAt(i));h++;}
//    	 else
//    	 if(h==2*k) { a.append(s.charAt(i));h++;}
//    	
//    	 
//     } if(a.length()<k){a.reverse();}
//     temp.append(a);
//     System.out.println(temp.toString());
//     return temp.toString();
//     
//    }
	//12
//    public String gcdOfStrings(String s1, String s2) {
//         int n= s1.length();
//         int m= s2.length();
//         int gcd= gcd(n,m);
//         String can= s1.substring(0, gcd);
//         int j=0;
//         for(int i=0;i<n/gcd;i++,j+=gcd) {
//        	 if(!can.equals(s1.substring(j,j+gcd))) {return "";}	 
//         }j=0;
//         for(int i=0;i<m/gcd;i++,j+=gcd) {
//        	 if(!can.equals(s2.substring(j,j+gcd))) {return "";}	 
//         }
//    return can;
//    }
//    
//    private int gcd(int a, int b) {
//        if (a % b == 0) {
//            return b;
//        }
//        
//        return gcd(b, a % b);
//    }
	//13
//    public boolean canConstruct(String ransomNote, String magazine) {
//       HashMap<Character,Integer>a= new HashMap<Character,Integer>(); 
//    for(int i=0;i<magazine.length();i++) {
//    	if(a.containsKey(magazine.charAt(i))) {
//    		a.put(magazine.charAt(i), a.get(magazine.charAt(i))+1);
//    	}
//    	else {
//    		
//    		a.put(magazine.charAt(i), 1);
//    	}
//    }
//    
//    for(int i=0;i<ransomNote.length();i++) {
//    	if(a.containsKey(ransomNote.charAt(i))) {
//    		if(a.get(ransomNote.charAt(i))==0) {return false;}
//    		a.put(ransomNote.charAt(i), a.get(ransomNote.charAt(i))-1);
//    	}else {return false;}
//    }
//    a.clear();
//    return true;
//    }
	//14
//    public static int firstUniqChar(String s) {
//    	if(s.equals(""))return -1;
//      HashMap<Character,Integer>a= new HashMap<Character,Integer>(); 
//   for(int i=0;i<s.length();i++) {
//   	if(a.containsKey(s.charAt(i))) {
//   		a.put(s.charAt(i), -1);
//   	}
//   	else {
//   		
//   		a.put(s.charAt(i), 1);
//   	}
//   }
//   
//   if(a.size()==0) {return -1;}
//   System.out.println(a);
//int te=1000000;
//   for(Entry<Character,Integer>aa:a.entrySet()) {
//	   if(aa.getValue()!=-1) {
//	   int l=s.indexOf(aa.getKey());
//	   if(te>l) {te=l;}
//	   }
//   }
//   if(te==1000000) {te=-1;}
//   return te;
//    }
	//15
//    public static boolean detectCapitalUse(String word) {
//        int left= 0,right=word.length()-1;
// 
//    while(left<right) {
//    	if(word.charAt(left)>='a'&&word.charAt(left)<='z') {
//    		        if(word.charAt(right)>='A'&&word.charAt(right)<='Z') {return false;}
//    		      else {
//    			left++;right--;
//    			while(left<=right) {
//    			
//    				if(word.charAt(left)>='A'&&word.charAt(left)<='Z'||
//    						word.charAt(right)>='A'&&word.charAt(right)<='Z') {return false;}
//    	    		else {left++;right--;
//    				}}return true;}}else 
//    	if(word.charAt(left)>='A'&&word.charAt(left)<='Z')
//    	{
//    		
//    		
//	        if(word.charAt(right)>='A'&&word.charAt(right)<='Z') {
//	        	
//	        	
//
//	    		left++;right--;
//	    		while(left<=right) {
//	    		
//	    			if(word.charAt(left)>='A'&&word.charAt(left)<='Z'&&
//	    					word.charAt(right)>='A'&&word.charAt(right)<='Z') {left++; right--;}
//	        		else {return false;
//	    			}}return true;
//	        	
//	        }
//	      else {
//	    	  
//	    	  
//
//	  		left++;right--;
//	  		while(left<=right) {
//	  		
//	  			if(word.charAt(left)>='A'&&word.charAt(left)<='Z'||
//	  					word.charAt(right)>='A'&&word.charAt(right)<='Z') {return false;}
//	      		else {left++;right--;
//	  			}}return true;
//	      }
//    		
//    		
//    		
//    		
//    		
//    	}
//    }
//    return true;
//    }
//16
//    public static List<String> stringMatching(String[] words) {
//      
//    	  Set<String> set = new HashSet<>();
//
//          for (String word : words)
//              for (String s : words)
//                  if (!word.equals(s))
//                      if (word.contains(s))
//                          set.add(s);
//
//          return new ArrayList<>(set);
//      }
	//17
//    public int maxNumberOfBalloons(String s) {
//    	 HashMap<Character,Integer>a= new HashMap<Character,Integer>(); 
//       for(int i=0;i<s.length();i++) {
//       	if(a.containsKey(s.charAt(i))) {
//       		a.put(s.charAt(i), a.get(s.charAt(i))+1);
//       	}
//       	else {
//       		
//       		a.put(s.charAt(i), 1);
//       	}
//       }
//       int g=0;
//       if(a.containsKey('b')) {g=a.get('b');}else {return 0;}
//       if(a.containsKey('a')) {if(a.get('a')<=g) {g=a.get('a');}    }else{return 0;}
//       if(a.containsKey('n')){if(a.get('n')<=g) {g=a.get('n');}    }else{return 0;}
//       if(a.containsKey('o')){if((a.get('o')/2)<=g) {g=a.get('o')/2;}    }else{return 0;}
//       if(a.containsKey('l')){if((a.get('l')/2)<=g) {g=a.get('l')/2;}    }else{return 0;}
//       return g;
//    }
	//18
//    public static String reformatDate(String date) {
//        String []a= date.split("\\s+");
//        String temp=a[2];
//        a[2]=a[0];
//        a[0]=temp;
//        StringBuilder t=new StringBuilder();
//        t.append(a[2]);
//        t.deleteCharAt(t.length()-1);t.deleteCharAt(t.length()-1);
//        if(t.length()==1){t.insert(0, '0');}
//        if(a[1].equals("Jan")) {a[1]="01";}else
//        	 if(a[1].equals("Feb")) {a[1]="02";}else
//        		 if(a[1].equals("Mar")) {a[1]="03";}else
//        			 if(a[1].equals("Apr")) {a[1]="04";}else
//        				 if(a[1].equals("May")) {a[1]="05";}else
//        					 if(a[1].equals("Jun")) {a[1]="06";}else
//        						 if(a[1].equals("Jul")) {a[1]="07";}else
//        							 if(a[1].equals("Aug")) {a[1]="08";}else
//        								 if(a[1].equals("Sep")) {a[1]="09";}else
//        									 if(a[1].equals("Oct")) {a[1]="10";}else
//        										 if(a[1].equals("Nov")) {a[1]="11";}else
//        											 if(a[1].equals("Dec")) {a[1]="12";}
//        date="";
//        date= date+a[0].toString()+"-"+a[1].toString()+"-"+t.toString();
//        return date;
//    }
	//19
	
//    public  static int removePalindromeSub(String s) {
//    if(s.length()==0) {return 0;}
//    if(ispalindrone(s)) {return 1;}
//    else {return 2;}
//    }
//
//private static boolean ispalindrone(String s) {
//	// TODO Auto-generated method stub
//	
//	int left= 0,right= s.length()-1;
//	while(left<=right) {
//		if(s.charAt(left)!=s.charAt(right)) {return false;}
//		else {left++;right--;}
//	}
//	return true;
//}
	//20
   // public static int maxPower(String s) {
//StringBuilder a= new StringBuilder(s);
// int offset=1,g=0;
//for(int i=0;i<a.length()-1;i++) {
//	if(a.charAt(i)==a.charAt(i+1)) {offset++;if(g<offset) {g=offset;}}
//	else {offset=1;}
//}
//  	return g;
//}
	//21
//	  public  static int[] numSmallerByFrequency(String[] queries, String[] words) {
//	      int []queriess= new int[queries.length];
//	      int []wordss= new int[words.length];
//	      int []answer= new int[queries.length];
//	      
//	      for(int i=0;i<queriess.length;i++) {
//	    	  queriess[i]=smalloccur(queries[i]);
//	      }
//	      for(int i=0;i<words.length;i++) {
//	    	  wordss[i]=smalloccur(words[i]);
//	      }
//Arrays.parallelSort(wordss);
//int l=0;
//while(l<queriess.length) {
//	      for(int i=wordss.length-1;i>=0;i--) {
//	if(queriess[l]<wordss[i]) {answer[l]++;}
//	      }
//	      l++;
//}
//	      
//	  return answer;
//	  }
//
//private static int smalloccur(String string) {
//	// TODO Auto-generated method stub
//	
//	char[]d=string.toCharArray();
//	Arrays.parallelSort(d);
//	int offset=1;
//	for(int i=0;i<d.length-1;i++) {
//		if(d[i]==d[i+1]) {offset++;}
//		else {return offset;}
//	}
//	
//	return offset;
//}

//22   different  
	
//    public int findLUSlength(String a, String b) {
//// int g=finlus(a,b);
//// int g1=finlus(b,a);
//// if(g1>g) {return g1;}
//// if(g>g1) {return g;}
//// if(g==g1) {if(g==0) {return -1;}return g;}
//    	
//    	if(a.equals(b))return -1;
//    	if(a.length()>b.length())return a.length();
//    	
//    	
//return b.length();
//    }
//
////private int finlus(String a, String b) {
////	// TODO Auto-generated method stub
////  	 HashMap<Character,Integer>s= new HashMap<Character,Integer>(); 
////     for(int i=0;i<a.length();i++) {
////     	if(s.containsKey(a.charAt(i))) {
////     		s.put(a.charAt(i), s.get(a.charAt(i))+1);
////     	}
////     	else {
////     		
////     		s.put(a.charAt(i), 1);
////     	}
////     }
////     int offset=0,g=0;
////   	for(int i=0;i<b.length();i++) {
////   		if(!s.containsKey(b.charAt(i))) {offset++;if(g<offset) {g=offset;}}
////   		else {offset=0;}
////   	}
////   	s.clear();
////	return g;
////}
//23
//    public  static int romanToInt(String x) {
//   	 HashMap<Character,Integer>s= new HashMap<Character,Integer>(); 
//s.put('I',1 );s.put('V',5);s.put('X',10 );s.put('L',50 );s.put('C',100 );
//s.put('D',500 );s.put('M',1000 ); 
//int r=0;
//     for(int i=0;i<x.length()-1;i++) {
//    	 if(s.get(x.charAt(i+1))<=s.get(x.charAt(i))) {r=r+s.get(x.charAt(i));}
//    	 else {r=r-s.get(x.charAt(i));}
//     }r=r+s.get(x.charAt(x.length()-1));
// 
//     return r;
//    }
	//24
	

//    public static String reformat(String s) {
//        if(s.length()==1)return s;
//        char[]a= s.toCharArray();
//            Arrays.parallelSort(a);
//            StringBuilder ax= new StringBuilder();
//            int left=0,right=a.length-1;
//            if(a.length%2==0){
//            	if(a[((a.length)/2)-1]>='0'&&a[((a.length)/2)-1]<='9'&&
//            			a[((a.length)/2)]>='a'&&a[((a.length)/2)]<='z') {
//            		while(left<right) {
//            			ax.append(a[left]);left++;
//            			ax.append(a[right]);right--;
//            		}
//            		return ax.toString();
//            		
//            		
//            	}
//            	else {return "";}
//            }
//            else
//            if(a.length%2==1){
//            	if((a[((a.length)/2)-1]>='0'&&a[((a.length)/2)-1]<='9')||(a[((a.length)/2)]>='0'&&a[((a.length)/2)]<='9')) 
//            	{
//            		if(a[((a.length)/2)]>='0'&&a[((a.length)/2)]<='9'
//            				&&a[((a.length)/2)+1]>='a'&&a[((a.length)/2)+1]<='z')
//            		{ax.append(a[left]);left++;while(left<right) {
//            			
//            			ax.append(a[right]);right--;ax.append(a[left]);left++;
//            		}
//            		return ax.toString();}
//            		
//            		if(a[((a.length)/2)]>='a'&&a[((a.length)/2)]<='z') {}else {return "";}
//            		ax.append(a[right]);right--;while(left<right) {
//            			ax.append(a[left]);left++;
//            			ax.append(a[right]);right--;
//            		}
//            		return ax.toString();
//            		
//            		
//            		
//            	}
//            	else {return "";}
//            }
//            
//            
//            for(int i=0;i<a.length;i++) {
//            	System.out.println(a[i]);
//            }
//        return s;
//        }
	//25  Imp sliding window
	
//	  public int maxScore(String s) {
//	        
//          int p=0,c=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='1')
//                p++;
//        }
//        int sum=p-1;
//        for(int i=0;i<s.length()-1;i++){
//            if(s.charAt(i)=='0')
//                c++;
//            else
//                p--;
//            if(c+p>sum)
//                sum=c+p;
//        }
//        return sum;
//    }
	//26
	
	
	  
//	class Point
//	{
//	    int x;
//	    int y;    
//		
//	    Point(int x, int y)
//	    {
//	        this.x = x;
//	        this.y = y;
//	    }
//	    
//	    public int hashCode() {
//
//	        return 31 * x + 37 * y;
//	    }
//	 
//	    public boolean equals(Object obj) {
//	        if (this == obj)
//	            return true;
//	        if (obj == null)
//	            return false;
//	        if (getClass() != obj.getClass())
//	            return false;
//	        Point other = (Point) obj;
//	        if (x != other.x || y != other.y)
//	            return false;
//	        return true;
//	    }
//
//	}
//
//	
//	    public boolean isPathCrossing(String path) {
//	        int n = 0; 
//	        int e = 0;
//	      
//	        Set<Point> points = new HashSet<Point>();
//	        points.add(new Point(0, 0));
//	        
//	        for(int i = 0; i < path.length(); i++)
//	        {            
//	            if(path.charAt(i) == 'N')
//	            {
//	                n++;
//	            }
//	            else if(path.charAt(i) == 'E')
//	            {
//	                e++;
//	            }
//	            else if(path.charAt(i) == 'S')
//	            {
//	                n--;
//	            }
//	            else
//	            {
//	             e--;
//	            }
//	            
//	            Point p = new Point(n, e);
//	            if(!points.contains(p))
//	            {
//	                points.add(p);
//	            }
//	            else
//	            {
//	                return true;
//	            }
//	            
//	         
//	        }
//	        
//	        return false;
//	    }
//27
//	   int[] charArr = new int[26];
//	    public String sortString(String s) {
//
//       for(int i=0; i<s.length(); i++){
//           charArr[s.charAt(i) - 'a']++;            
//       }
//       
//       StringBuilder sb = new StringBuilder();
//       
//       while(sb.length() != s.length()){
//           for(int i=0; i<26; i++){
//               if(charArr[i] > 0){
//                   sb.append((char) ('a' + i));
//                   charArr[i]--;
//               }
//           }
//           
//           
//           for(int j=25; j>=0; j--){
//               if(charArr[j] > 0){
//                   sb.append((char) ('a' + j));
//                   charArr[j]--;
//               }
//           }
//       }
//       
//       return sb.toString();
//       
//   }
	//28
    public static boolean repeatedSubstringPattern(String s){

    	
 return  ((s + s).indexOf(s, 1) != s.length());
   
}
	

}