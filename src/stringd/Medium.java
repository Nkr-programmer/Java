package stringd;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;
//abc deq mee aqq dkd ccc
public class Medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 String n= sc.nextLine();
//int v=minInsertions(n);
System.out.println();
	}



	



	public static int myAtoi(String str) {
	        str= str.trim();
			     if(str.length()==0) {return 0;}
			        int y=0;boolean x= false;
			        int sign=1;
			        int i=0;
			        if(str.charAt(i)=='-'||str.charAt(i)=='+') {x=true;i++;
	                                                            if(str.length()==1){return 0;}
			        if(str.charAt(0)=='-') {sign=-1;}
			        }
			        if((str.charAt(i)>='0'&&str.charAt(i)<='9')	) {
			        	
			        	if(x) { i=1;}
			        	
			        	
			        	 for(;i<str.length();i++) {
			        			
					        	if((str.charAt(i)>='0'&&str.charAt(i)<='9'))
					        	{
					        		if(y>(Integer.MAX_VALUE-((int)str.charAt(i)-'0'))/10)
					        		{if(sign==1)return Integer.MAX_VALUE;else{return Integer.MIN_VALUE;}}
					        		y=y*10+(int)(str.charAt(i)-'0');
					        	}
					        	else {break;}
					        	
					        }
			        	
			        	
			        	
			        }else {return 0;}
			       
			        
			        
			 if(sign==-1) {y=y*-1;}
			    
			        return y;
			    }
	   //2
	    public static  String validIPAddress(String ip) {
	    	  if(ip.length()==0)return"Neither";
		        if(ip.length()<7)return "Neither";
		        if(ip.length()>39)return "Neither";
		        if(ip.charAt(0)==':'||ip.charAt(ip.length()-1)==':'||ip.charAt(0)=='.'||ip.charAt(ip.length()-1)=='.') {return "Neither";}
		        if(ip.length()==15) {
		        	
		        	if(ip.charAt(1)==':'&&ip.charAt(3)==':') {
		      String g=isIpv6(ip);
		        		if(g.equals("IPv6")) {return g;}
		        	
		        	}
		        	if(ip.charAt(3)=='.'&&ip.charAt(7)=='.') {
		        		String gi=isIpv4(ip);
		        		if(gi.equals("IPv4")) {return gi;}
		        		else {
		        			return gi;
		        			
		        		}
		        	}
		        	
		        }else {
		        	if(ip.length()<15) {
		        	String h=isIpv4(ip);
		        	return h;
		        	}
		        	else {
		       String hi=isIpv6(ip);
		       return hi;
		        	}
		        }
		        
		     return "Neither";   
		    }

			private static String isIpv6(String ip) {
				// TODO Auto-generated method stub
				
	    		String []b= ip.split(":");
	    		if(b.length!=8) {return "Neither";}
	    		for(int i=0;i<8;i++) {
	    			if(b[i].length()==0) {return "Neither";}
	    			if(b[i].length()>4) {return "Neither";}
	    			for(int j=0;j<b[i].length();j++) {
	    			if((b[i].charAt(j)>='a'&&b[i].charAt(j)<='f')||
	    					(b[i].charAt(j)>='A'&&b[i].charAt(j)<='F')||
	    					(b[i].charAt(j)>='0'&&b[i].charAt(j)<='9')) {
	    				
	    			}else {return "Neither";}
	    			}
	    				  
			} return "IPv6";
			}
			private static String isIpv4(String ip) {
				// TODO Auto-generated method stub
			
	        		String []a=ip.split("\\.");
	        		
	        		
	        		
	        	
	        		if(a.length!=4) {return "Neither";}
	        		int y=0;
	        		for(int i=0;i<4;i++) {
	        			if(a[i].length()==0) {return "Neither";}
	        			if(a[i].length()>3) {return "Neither";}
	        			if(a[i].charAt(0)=='0') {if(a[i].length()>1)return "Neither";}
	        			 y=0;
	        			for(int j=0;j<a[i].length();j++) {
	                        if(a[i].charAt(j)>='0'&&a[i].charAt(j)<='9')
	        			y=y*10+(int)a[i].charAt(j)-'0';
	                        else return "Neither"; 
	        			}
	        				System.out.println(y);
	        		if(y>255) {return "Neither";}
	        	
	        		}
	        		return "IPv4";
			}
			
			  public String validIPAddress2(String IP) {
				    try {
				      return (InetAddress.getByName(IP) instanceof Inet6Address) ? "IPv6": "IPv4";
				    } catch(Exception e) {}
				    return "Neither";
				  }

//NOT FOR 01.01.01.01
			  //3
			  public int minSteps(String s, String t) {
			     
			  	 HashMap<Character,Integer>a= new HashMap<Character,Integer>(); 
			     for(int i=0;i<s.length();i++) {
			     	if(a.containsKey(s.charAt(i))) {
			     		a.put(s.charAt(i), a.get(s.charAt(i))+1);
			     	}
			     	else {
			     		
			     		a.put(s.charAt(i), 1);
			     	}
			     }
			        int z=0;
			     for(int i=0;i<t.length();i++) {
			    	 if(!a.containsKey(t.charAt(i))) {z++;}
			    	 else {
			    	
			    		 if(a.get(t.charAt(i))<=0) {z++;}
			    		 
			    		 a.put(t.charAt(i),a.get(t.charAt(i))-1);
			    		 
			    	 }
			     }
			     
			     return z;
			    }
			//4  
			   public static int minFlips(String target) {
			     
String h;int turns=0;

for(int i=0;i<target.length();i++) {
	if(turns%2==(int)(target.charAt(i))-'0') {continue;}
	else {turns++;}

	
}	System.out.println(turns);
return turns;
			    }
			 //5
public static List<String> printVertically(String s) {
	List<String>c= new LinkedList<String>();
	
	
	int k=0,g=0;

	String []a = s.split("\\s+");
	for(int i=0;i<a.length;i++) 
	{
		if(g<a[i].length()) {g=a[i].length();}
	}int f=0;
	while(f<g) {
			StringBuilder b= new StringBuilder();
			
	for(int i=0;i<a.length;i++) {	
		if(a[i].length()<=k) { {b.append(" ");}}
		else
		{
		
			b.append(a[i].charAt(k));}
	}

c.add(b.toString().replaceFirst("\\s++$", ""));
k++;
	f++;
	}
    return c;
}
//6

public int findTheLongestSubstring1(String s) {
	int []a=new int[26];
	char[]b=s.toCharArray();
	int maxlen=-1,l=0;
	
	for(int i=0;i<b.length;i++) {
		int f=b[i]-'a';
		if(f==0||f==4||f==8||f==14||f==20) {
			a[f]++;
		}
		
		int []temp= Arrays.copyOf(a, a.length);
		while(temp[0]%2==1||temp[4]%2==1||temp[8]%2==1||temp[14]%2==1||temp[20]%2==1)
		{
			int le=b[l]-'a';
			if(le==0||le==4||le==8||le==14||le==20) {
				temp[le]--;
			}l++;
		}
			maxlen=Math.max(maxlen, i+1-l);
			
			l=0;
	}
	
	return maxlen;
}
//eleetminicoworoep
public static int findTheLongestSubstring2(String s) {
    int status = 0;
    int ans = 0;
    Map<Integer, Integer> seen = new HashMap<>();
    seen.put(status, -1);
    for (int i = 0; i < s.length(); i++) {
        status ^= 1 << ("aeiou".indexOf(s.charAt(i)) + 1) >> 1; // in case char is not vowel
        System.out.println(status);
        if (!seen.containsKey(status)) {
            seen.put(status, i);  // record earliest index
        }
        ans = Math.max(ans, i - seen.get(status));
    }
    return ans;
}
//7
public static boolean queryString(String S, int N) {
	String in="";
	for(int i=0;i<N;i++) {
		in=Integer.toBinaryString(i);
	if(!S.contains(in)) {return false;}
	}
	return true;
}
//8  imp
public static List<String> removeSubfolders(String[] folder) {
	  List<String>a= new LinkedList<String>();
		Arrays.parallelSort(folder);
		String temp=folder[0]+"/";
		a.add(folder[0]);
		for(int i=1;i<folder.length;i++) {
		if(!folder[i].startsWith(temp))
		{
			temp=folder[i]+"/";
			a.add(folder[i]);
		}
		
		}
		
		return a;
	}
//9 imp
public int countSubstrings(String s) {
 int count =0;
	for(int i=0;i<s.length()-1;i++) {
		count+=numberofpalidrones(s,i,i)+numberofpalidrones(s,i,i+1);
	}
	return count;
}

private int numberofpalidrones(String s, int i, int i2) {
	// TODO Auto-generated method stub
	int count =0,start=i,last=i2;
	while(start>=0&&last<s.length()&&s.charAt(start--)==s.charAt(last++))
	{count++;}	
	
	return count;
}
//10
public List<List<String>> suggestedProducts(String[] products, String searchWord) {
	Arrays.parallelSort(products);
	List<List<String>>a= new ArrayList<>();
    for(int i=0;i<searchWord.length();i++) {
   a.add(search(products,searchWord.substring(0, i+1)));    	
    }

return a;
}

private List<String> search(String[] products, String searchWord) {
	// TODO Auto-generated method stub
	List<String>a= new LinkedList<String>();
	int count =0;
	for(int i=0;i<products.length;i++)
	{
		if(count<=3&&products[i].startsWith(searchWord)) {
			a.add(products[i]);count++;
		}
	}
	return a;
}
//11
public  static String customSortString(String S, String T) {
	StringBuilder gf= new StringBuilder();
    int a[]= new int[26];
    for(int i=0;i<T.length();i++) {
    	int b=T.charAt(i)-'a';
    	a[b]++;
    }
    int []acopy= Arrays.copyOf(a, a.length);
    for(int i=0;i<S.length();i++) {
    	int b=S.charAt(i)-'a';
    	acopy[b]=0;
    }
    for(int i=0;i<S.length();i++)
    {
    	int b= S.charAt(i)-'a';
    	int h=a[b];
    	while(h>0) {
    		gf.append(S.charAt(i));h--;
    	}
    }

	for(int i=0;i<a.length;i++) {
		if(acopy[i]!=0)
		{
			
			char b= (char)(i+'a');
	    	int h=acopy[i];
	    	while(h>0) {
	    		gf.append(b);h--;
	    	}
		}
	}
	System.out.println(gf.toString());
	return gf.toString();
}
//12

public static char findKthBit(int n, int k) {
    
int i=1;
StringBuilder s=new StringBuilder("0");
StringBuilder t=recurse(n,i,s);
System.out.println(t.toString());
char f= t.charAt(k-1);

return f;

}

private static StringBuilder recurse(int n, int i,StringBuilder d2) {
// TODO Auto-generated method stub
if(i>=n) {return d2;}

StringBuilder d=new StringBuilder();
String h=d2.toString();
h= h.replace('0', '2');
h= h.replace('1','0');
h= h.replace('2', '1');
d.append(h);d.reverse();
d2.append('1');
d2.append(d);
d2=recurse(n,i+1,d2);
return d2;
}

//13
public  static String complexNumberMultiply(String a, String b) {
    
	int a2=0,b2=0,a1=0,b1=0;
	
	int plusa= a.indexOf('+');
	int plusb=b.indexOf('+');
	for(int i=0;i<plusa;i++) {	if(a.charAt(i)=='+'||a.charAt(i)=='-') {}
	else {a1=a1*10+(int)a.charAt(i)-'0';}}if(a.charAt(0)=='-') {a1=a1*-1;}
	for(int i=0;i<plusb;i++){	if(b.charAt(i)=='+'||b.charAt(i)=='-') {}
	else {b1=b1*10+(int)b.charAt(i)-'0';}}if(b.charAt(0)=='-') {b1=b1*-1;}
	
	for(int i=plusa+1;i<a.length()-1;i++)
	{
		if(a.charAt(i)=='+'||a.charAt(i)=='-') {}
		else {
			a2=a2*10+a.charAt(i)-'0';
		}
	}
	if(a.charAt(plusa+1)=='-') {a2=a2*-1;}
	for(int i=plusb;i<b.length()-1;i++)
	{
		if(b.charAt(i)=='+'||b.charAt(i)=='-') {}
		else {
			b2=b2*10+b.charAt(i)-'0';
		}
	}
	if(b.charAt(plusb+1)=='-') {b2=b2*-1;}
	int real= a1*b1-a2*b2;
	int complex= a1*b2+a2*b1;
	
	System.out.println(a1+" "+b1+" "+a2+" "+b2+" ");
	return real+"+"+complex+"i";
}
//14
public static  String arrangeWords(String text) {
	text= text.toLowerCase();
    String []h= text.split(" "); 
    StringBuilder s= new StringBuilder();
    StringBuilder t= new StringBuilder();
    int []a= new int[h.length];
 for(int i=0;i<h.length;i++)
 {
	 a[i]=h[i].length(); 
	 s.append((char)(a[i]+'0'));
	 
 }
	 int []b=Arrays.copyOf(a,a.length);
	 Arrays.parallelSort(b);
System.out.println(s.toString());
	 for(int i=0;i<b.length;i++) {
		 int temp=s.toString().indexOf((char)(b[i]+'0'));
         t.append(h[temp]);t.append(" ");
		 s.setCharAt(temp, '0');
	 }
	 t.deleteCharAt(t.toString().length()-1);
	 t.setCharAt(0, (char)(t.charAt(0)-('a'-'A')));
	 return t.toString();
}
//15
public  static String IntToRoman(int num) {
	StringBuilder at=new StringBuilder();
    int[] a = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};


	for(int i=0;i<13&&num>0;i++){
	if(num>=a[13-i]) {num-=a[13-i];at.append(roman[13-i]);}	}	
return at.toString();
}
//16
public String entityParser(String text) {

text=text.replace("&quot;","\"");	
text=text.replace("&apos;","'" );	
text=text.replace("&gt;",">" );	
text=text.replace("&lt;","<" );	
text=text.replace("&frasl;","/" );	
text=text.replace("&amp;","&");	
return text;
}
//17

public static int findMinDifference(List<String> t) {
	int[] c=new int[t.size()];
	int q=0;
	
	for(String x:t)
{
	int a=0,b=0;
	a=a*10+(int)(x.charAt(0)-'0');
	a=a*10+(int)(x.charAt(1)-'0');

	b=b*10+(int)(x.charAt(3)-'0');
	b=b*10+(int)(x.charAt(4)-'0');
	if(a==0&&b==0) {c[q++]=1440;}
	else
	c[q++]=(a*60)+b;
	System.out.println(a+" "+b+" "+c[q-1]);
}


int min=Integer.MAX_VALUE;
Arrays.parallelSort(c);

for(int i=0;i<c.length-1;i++) {
	System.out.println(c[i]+" "+c[i+1]);
	min=Integer.min(min, c[i+1]-c[i]);
}
min=Integer.min(min,1440-c[c.length-1]+c[0]);
return min;
}
//18
//	public static class Point 
//{
//		int id;
//	String name;
//	int time;
//    int money;
//    String city;    
//	
//    Point(int i,String x, int y,int z, String b)
//    {
//    	this.id=i;
//    	this.name = x;
//        this.time = y;
//        this.money = z;
//        this.city = b;
//    }
// 
//
//}
//	
//    public static List<String> invalidTransactions(String[] transactions) {
//    	if (transactions == null) {
//            return Collections.emptyList();
//    	}
//HashMap<String,List<Point>>a=new HashMap<String,List<Point>>(); 
//     for(int i=0;i<transactions.length;i++)
//     { 
//    	  	 String[]b=transactions[i].split(",");
//    	 Point p = new Point(i,b[0],Integer.parseInt(b[1]),Integer.parseInt(b[2]),b[3]);
//    	 List<Point> l = a.getOrDefault(p.name, new ArrayList<>()); 
//    	l.add(p);
//    	a.put(p.name, l);
//     }
//   
//     System.out.println(a);
//List<String>invalid=new ArrayList<>();
//     for(Map.Entry<String, List<Point>> am:a.entrySet()) {
//    	 check(am.getValue(),transactions,invalid);
//     }
//     
//     return null;
//    }
//
//	private static void check(List<Point> value, String[] transactions, List<String> invalid) {
//		// TODO Auto-generated method stub
//		for(Point am:value) {
//			if(am.money>1000) {
//				invalid.add(transactions[am.id]);continue;
//			}
//		
//			for(Point s:value) {
//				if(am.id!=s.id&&Math.abs(am.money-s.money)<=60
//						&&(!am.city.equals(s.city)))
//						{
//					invalid.add(transactions[am.id]);
//		break;
//						}
//				
//			}
//		}
//	}





    
    private static class TransactionEntry {
        int id;
        String name;
        int time;
        int amount;
        String city;
        public TransactionEntry(int id, String name, int time, int amount, String city) {
            this.id = id;
            this.name = name;
            this.time = time;
            this.amount = amount;
            this.city = city;
        }
    }
    
    public List<String> invalidTransactions(String[] transactions) {
        if (transactions == null) {
            return Collections.emptyList();
        }
        Map<String, List<TransactionEntry>> nameToTransactions = new HashMap<>();
        for (int i = 0; i < transactions.length; ++i) {
            String[] splittedTransaction = transactions[i].split(",");
            TransactionEntry entry = new TransactionEntry(i, splittedTransaction[0], Integer.parseInt(splittedTransaction[1]), Integer.parseInt(splittedTransaction[2]), splittedTransaction[3]);
            List<TransactionEntry> listTransactions = nameToTransactions.getOrDefault(entry.name, new ArrayList<>()); 
            listTransactions.add(entry);
            nameToTransactions.put(entry.name, listTransactions);
        }
        List<String> invalidTransactions = new ArrayList<>();
        for(Map.Entry<String, List<TransactionEntry>> entry : nameToTransactions.entrySet()) {
            checkList(entry.getValue(), invalidTransactions, transactions);
        }
        return invalidTransactions;
    }
    
    private void checkList(List<TransactionEntry> entries, List<String> invalidTransactions, String[] transactions) {
        for (TransactionEntry entry1 : entries) {
            if (entry1.amount > 1000) {
                invalidTransactions.add(transactions[entry1.id]);
                continue;
            }
            for (TransactionEntry entry2 : entries) {
                if (entry1.id != entry2.id && Math.abs(entry1.time - entry2.time) <= 60&&!entry1.city.equals(entry2.city)) {
                    invalidTransactions.add(transactions[entry1.id]);
                    break;
                }
            }
        }
    } 

    private static int nextGreaterElement(int n) {

    	String a=Integer.toString(n);
    	int []b= new int[a.length()];
    	
    	for(int i=0;i<a.length();i++)
    	{
    		b[i]=a.charAt(i)-'0';
    	}
    	
int index=-1;
    	for(int  j=b.length-1 ;j>0;j--)
    	{
    	if(b[j]>b[j-1]) 
    	{index=j-1;break;}
    		
    	}
    	if(index==-1) {return -1;}
    	int smallindex=b.length-1,small=9;
    	for(int i=b.length-1;i>index;i--)
    	{
    		if(b[i]>b[index]&&b[i]<=small)
    		{
    			smallindex=i;
    		   small=b[i];
    		}
    	}
    	
    	int temp=b[index];
    	b[index]=b[smallindex];
    	b[smallindex]=temp;
    	
    	Arrays.parallelSort(b, index+1, b.length);
    	int h=0;
    	for(int i=0;i<b.length;i++)
    	{
             if (h != h * 10 /10){
                return -1;
            }
    		h=h*10+b[i];
    	}
    	return h;
    }
    //20
   public int compareVersion(String version1, String version2) {
 
	String[]a= version1.split("\\.");
	String[]b= version2.split("\\.");
int i=0;
	while(i<a.length||i<b.length) {
		
int c=0;
if(i<a.length)
c=firstnumber(a[i]);
int d=0;
if(i<b.length)
d=firstnumber(b[i]);
if(c>d)return 1;
if(d>c)return -1;

i++;
	}
	
	return 0;
}

private int firstnumber(String g) {
	// TODO Auto-generated method stub
	
	int i=0;
	while(i<g.length()&&g.charAt(i)=='0') {
		i++;
	}int h=0;
	for(int j=i;j<g.length();j++)
	{h=h*10+g.charAt(j)-'0';}
	return h;
}	   
//21
public String[] getFolderNames(String[] names) {
    HashMap<String,Integer>a= new HashMap<String,Integer>();
	for(int i=0;i<names.length;i++)
	{
		if(a.containsKey(names[i]))
		{
		int u=a.get(names[i]);
while(a.containsKey(names[i]+"("+u+")"))
			{
			u++;
			}	
			a.put(names[i]+"("+u+")",u+1);
			names[i]=names[i]+"("+u+")";
		}a.put(names[i],0);
	}
	
	return names;
}
//22  "pwwkew"
public static int lengthOfLongestSubstring(String s) {
	
	if(s.length()==0)return 0;
	int []a=new int[256];
	char[]b=s.toCharArray();
	int maxlen=-1,l=0;
	
	for(int i=0;i<b.length;i++) {
		int f=b[i];
			a[f]++;
		
		
		
		while(a[f]>1)
		{
			int le=b[l];
				a[le]--;
			    l++;
		}
			maxlen=Math.max(maxlen, i+1-l);
		
			
	}
	
	return maxlen;
}
//23
public String simplifyPath(String path) {
 Stack<String>a= new Stack();   
 
 String g[]=path.split("/");
 for(int i=0;i<g.length;i++)
 {
	 if(g[i].contentEquals(".."))
	 {
		 if(!a.isEmpty())
		 {
			 a.pop();
			 
		 }
	 }
	 else
		 if(g[i].contentEquals("."))
		 {
			 continue;
		 }else
			 if(!g[i].isEmpty()||!g[i].contentEquals("")||!g[i].isBlank())
			 {
				 a.push("/"+g[i]);
			 }
 }
 if(a.size()==0)return "/";
 String re="";
 for(int i=0;i<a.size();i++)
 {
	 re=re+a.get(i);
 }
 
 
 return re;
}
//24
public static int balancedString(String s) {
 int a[] =new int [4];
 
 for(int i=0;i<s.length();i++)
 {
	 if(s.charAt(i)=='Q')
	 {
		 a[0]++;
	 }
	 else
		 if(s.charAt(i)=='W')
		 {
			 a[1]++;
		 }
		 else
			 if(s.charAt(i)=='E')
			 {
				 a[2]++;
			 }
			 else
				 if(s.charAt(i)=='R')
				 {
				a[3]++;	 
				 }
 }
	int g=0;
	for(int i=0;i<4;i++) {
	if(a[i]>(s.length()/4))
	{
	a[i]=a[i]-(s.length()/4);
	}
	else
	{a[i]=0;}
	}
	int t=a[0]+a[1]+a[2]+a[3];
	
g=	LongestSubstring(s,t,a);
	return g;
}
public static int LongestSubstring(String s,int t,int[]a1) {
	
	if(a1[0]==0&&a1[1]==0&&a1[2]==0&&a1[3]==0)return 0;
	int []a=new int[26];
	char[]b=s.toCharArray();
	int maxlen=Integer.MAX_VALUE,l=0;
	
	for(int i=0;i<b.length;i++) {

		
		int f=b[i]-'A';
				//WWEQERQWQWWRWWERQWEQ		
		a[f]++;
		
		int fi=0;
		if(b[i]=='Q') {fi=0;}else
			if(b[i]=='W') {fi=1;}else
				if(b[i]=='E') {fi=2;}else
					if(b[i]=='R') {fi=3;}
		while(a['Q'-'A']>=a1[0]&&a['W'-'A']>=a1[1]&&a['E'-'A']>=a1[2]&&a['R'-'A']>=a1[3])
		{
			if(a1[fi]==0) {break;}
			else {
				maxlen=Math.min(maxlen, i+1-l);
			int le=b[l]-'A';
				a[le]--;
			    l++;
			  
		}
			}
			

			System.out.println(maxlen+" "+(i+1-l));
			
	}
	
	return maxlen;
}//25  

public static String convert(String s, int n) {
	 if(n>s.length() || n <= 1)
     {
         return s;
     }
 StringBuilder a= new StringBuilder ();
 int m= s.length();
 for(int i=1;i<=n;i++)
 {int f=0,k=i-1;
	 a.append(s.charAt(i-1));
	 while(f<m) {
	if(f+k+(n-i)+(n-i)>=m){break;}
	 if((n-i)+(n-i-1)>=0) {
	a.append(s.charAt(f+k+(n-i)+(n-i)));
	 }

		 if(f+k+(n-i)+(n-i)+2*(i-1)>=m){break;}
	 f=f+k+(n-i)+(n-i)+2*(i-1);
	 if(i-1!=0) {
	 a.append(s.charAt(f));k=0;
	 }
	  }

 }
 return a.toString();
}
//26
public static int maxDiff(int num) {
	
String m= Integer.toString(num);
String g=m;
for(int i=0;i<m.length();i++)
{if(m.charAt(i)!='9') {m=m.replace(m.charAt(i), '9');break;}}

if(g.charAt(0)!='1') {g=g.replace(g.charAt(0), '1');}
else
	if(g.charAt(1)!='0'&&g.charAt(1)!='1') {g=g.replace(g.charAt(1), '0');}
	else {
for(int i=2;i<g.length();i++)
{
	if(g.charAt(i)!='0'&&g.charAt(i)!='1') {g=g.replace(g.charAt(i), '0');break;}
	}
}

int a=Integer.parseInt(m);
int b=Integer.parseInt(g);

System.out.println(a+"-"+b+" ="+(a-b));

return a-b;
}
//27

}
