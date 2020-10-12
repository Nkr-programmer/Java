package stringd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;

public class Hard {

	public static void main(String[] args) {
		String f="3242415";
		int x=longestAwesome(f);
System.out.println(x);
	}
//1
    public static String longestPrefix(String s) {
    	StringBuilder si=new StringBuilder(s);
     StringBuffer f=new StringBuffer("");
     int i=si.length()-1,j=1;
    	for(int a=0;a<si.length()-1;a++)
    	{
    		if(si.charAt(i-1)==si.charAt(s.length()-1)) {
    		if(si.substring(0,i).equals(si.substring(j,si.length())))
    		{
    f.append(si.substring(0,i));
    break;
    	}
    		}
    		i--;j++;
    	}
    	return f.toString();
    }
    //  Imp    KMP ALGORITM
    public static String longestPrefix2(String s) {
    	
    	int []d= lpstable(s);
    	return s.substring(0, d[d.length-1]);
    
    }
	private static int[] lpstable(String s) {
		// TODO Auto-generated method stub
		int i=1;
		int []d=new int[s.length()];
		int  len= 0;
		char a[]= s.toCharArray();
		while(i<a.length&&len<a.length)
		{
			if(a[i]==a[len])
			{
				d[i]=len+1;
				len++;i++;
			}
			else {
				if(len!=0)
				{len=d[len-1];}
				else {
					i++;
				}
				
			}
		}
		
		
		return d;
	}
//2
	 public String orderlyQueue(String S, int K) {
	        char[] c = S.toCharArray();
	        if( K > 1) {
	            Arrays.sort(c);
	            return String.copyValueOf(c);
	        }else{
	            String tmp = S;
	            for(int i=1;i<S.length();i++){
	                if(S.charAt(i) > tmp.charAt(0)) continue;
	                String cmp = S.substring(i,S.length())+S.substring(0,i);
	                if(cmp.compareTo(tmp) < 0) tmp=cmp;
	            }
	            return tmp;
	        }
	    }
	 //3
	   public static boolean isNumber(String s) {
		   return Pattern.matches("^\\s*(-|\\+)?(\\d+(\\.\\d*)?|\\.\\d+)(e(-|\\+)?\\d+)?\\s*$", s);
		   }
	 //4
	   public static String numberToWords(int num) {
		     if(num==0)return "Zero";
		     String a=inttowords(num%1000); num=num/1000;
		 	 if(num!=0) {
		 			String ab=inttowords(num%1000);
		 					if(ab.equals("")){}
		 					else{a=ab+"Thousand "+a;}num=num/1000;
		 		}
		 	if(num!=0) {
		 		String ab=inttowords(num%1000);
		 				if(ab.equals("")){}
		 				else{a=ab+"Million "+a;}num=num/1000;
		 	}
		 	if(num!=0) {
		 		String ab=inttowords(num%1000);
		 				if(ab.equals("")){}
		 				else{a=ab+"Billion "+a;}num=num/1000;
		 	}	if(num!=0) {
		 		String ab=inttowords(num%1000);
		 		if(ab.equals("")){}
		 		else{a=ab+"Trllion "+a;}num=num/1000;
		 }a=a.trim();
		 	 return a;
		 	    }
		 	private static String inttowords(int i) {
		 		// TODO Auto-generated method stub
		 		if(i>=100) {int j=i%100; String h=inttowords(j);i=i/100;return inttowords(i)+"Hundred "+h;}
		 		
		 		if(i<=10) {
		 			if(i==0)return "";
		 			if(i==1)return "One ";
		 			if(i==2)return "Two ";
		 			if(i==3)return "Three ";
		 			if(i==4)return "Four ";
		 			if(i==5)return "Five ";
		 			if(i==6)return "Six ";
		 			if(i==7)return "Seven ";
		 			if(i==8)return "Eight ";
		 			if(i==9)return "Nine ";
		 			if(i==10)return "Ten ";
		 			}
		 		if(i<20) {
		 			if(i==11)return "Eleven ";
		 			if(i==12)return "Twelve ";
		 			if(i==13)return "Thirteen ";
		 			if(i==14)return "Fourteen ";
		 			if(i==15)return "Fifteen ";
		 			if(i==16)return "Sixteen ";
		 			if(i==17)return "Seventeen ";
		 			if(i==18)return "Eighteen ";
		 			if(i==19)return "Nineteen ";
		 			
		 			}
		 		if(i<30) {
		 			i=i%10;
		 			return "Twenty "+inttowords(i);
		 		}
		 		if(i<40) {
		 			i=i%10;
		 			return "Thirty "+inttowords(i);
		 		}if(i<50) {
		 			i=i%10;
		 			return "Forty "+inttowords(i);
		 		}if(i<60) {
		 			i=i%10;
		 			return "Fifty "+inttowords(i);
		 		}if(i<70) {
		 			i=i%10;
		 			return "Sixty "+inttowords(i);
		 		}if(i<80) {
		 			i=i%10;
		 			return "Seventy "+inttowords(i);
		 		}if(i<90) {
		 			i=i%10;
		 			return "Eighty "+inttowords(i);
		 		}if(i<100) {
		 			i=i%10;
		 			return "Ninety "+inttowords(i);
		 		}
		 		return null;
		 	}
//5
		    public List<Integer> findSubstring(String s, String[] words) {
		    	if(s.equals(""))return Collections.emptyList();
		    	   final Map<String, Integer> counts = new HashMap<>();
		           for (final String word : words) {
		               counts.put(word, counts.getOrDefault(word, 0) + 1);
		           }
		           final List<Integer> indexes = new ArrayList<>();
		           final int n = s.length(), num = words.length, len = words[0].length();
		           for (int i = 0; i < n - num * len + 1; i++) {
		               final Map<String, Integer> seen = new HashMap<>();
		               int j = 0;
		               while (j < num) {
		                   final String word = s.substring(i + j * len, i + (j + 1) * len);
		                   if (counts.containsKey(word)) {
		                       seen.put(word, seen.getOrDefault(word, 0) + 1);
		                       if (seen.get(word) > counts.getOrDefault(word, 0)) {
		                           break;
		                       }
		                   } else {
		                       break;
		                   }
		                   j++;
		               }
		               if (j == num) {
		                   indexes.add(i);
		               }
		           }
		           return indexes;
		       }
		    
//6
		    static long ans = 0;
static long diff = Long.MAX_VALUE;
static long  n = 0;

		    public static void update(String val) {
		        try {
		            long tmp = Long.parseLong(val);
		            if (tmp == n) return;
		            if (Math.abs(tmp - n) < diff || (Math.abs(tmp - n) == diff && tmp < ans)) {
		                ans = tmp;
		                diff = Math.abs(tmp - n);
		                System.out.println(ans);
		                System.out.println(diff);
		            }
		        } catch (Exception e) { }
		    }

		    public static void concat(long leftHalf) {
		        String s = "" + leftHalf, rs = new StringBuilder(s).reverse().toString();
		        update(s + rs); // abc -> abccba
		        update(s + rs.substring(1)); // abc -> abcba
		    }

		    public static String nearestPalindromic(String nm) {
		        n = Long.parseLong(nm);
		        diff = Long.MAX_VALUE;
		        long leftHalf = Long.parseLong(nm.substring(0, (nm.length() + 1) / 2));
		        concat(leftHalf - 1);
		        System.out.println("x");
		        concat((leftHalf - 1) * 10 + 9); // Handle 1, 1000, 100000, etc.
		        System.out.println("x");
		        concat(leftHalf);
		        System.out.println("x");
		        concat(leftHalf + 1);
		        System.out.println("x");
		        concat((leftHalf + 1) / 10); // Handle 9, 999, 99999, etc.
		        System.out.println();
		        return "" + ans;
		    }
		    //7
		    public static int longestAwesome(String s) {
		    	  Map<Integer, Integer> map = new HashMap<>();
		          map.put(0,-1);
		          int res = 0,mask = 0;
		          for(int i = 0; i < s.length(); i++){
		              mask = mask ^ ( 1 << (s.charAt(i) - '0'));
		              System.out.println(mask);
		              if(!map.containsKey(mask)) map.put(mask, i);
		              res = Math.max(res, i - map.get(mask));
		              int temp = mask;
		              for(int j = 0; j <=9; j++){
		                  temp = mask ^(1 << j);
		                  if(map.containsKey(temp)) res = Math.max(res, i - map.get(temp));
		              }
		          }
		          return res;
		      }
		    //8
	
		    }