package augustLong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Smallest_KMP {

	public static void main(String[] args)  throws java.lang.Exception {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int t= sc.nextInt();
//sc.nextLine();
while(t-->0) {
	
	
//	String s= sc.next();
//	String p= sc.next();
//	List<Character>a= new ArrayList();
//	List<Character>b= new ArrayList();
//	int s1=s.length(),k=0;
//	int p1=p.length(),m=0;
//	while(s1>0) {
//		a.add(s.charAt(k));
//		k++;
//		s1--;
//	}
//	while(p1>0) {
//		b.add(p.charAt(m));
//		m++;
//		p1--;
//	}
//	Collections.sort(a);
//	 s1=s.length();k=1;
//	 p1=p.length();m=0;
//	while(p1>1) {
//		a.remove(new Character(p.charAt(k)));
//		k++;
//		p1--;
//	}
//	int g=a.lastIndexOf(p.charAt(0));
//	a.remove(g);
//a.addAll(g, b);
//System.out.println();
//	for(int i=0;i<a.size();i++)
//		System.out.print(a.get(i));
//	
//	
//	aaakaeekmnnry
//	abohotypsu
//	aabadawyehhorst
	
	
//1	
//	//abbccdeeghhiijjjkklmmmnnnooopprstttuuuvvxyyyyzzxfghiopnbvcxaqwerghmhgrewqsdf
//	
//	
//	String s=sc.nextLine();
//	s=s.toLowerCase();
//	String p=sc.nextLine();
//	p=p.toLowerCase();
//	char []s1=s.toCharArray();
//char []p1=p.toCharArray();
//Arrays.parallelSort(s1);
//
//
//for(int i=1;i<p1.length;i++) {
//char p2=p1[i];
//	for(int j=0;j<s1.length;j++) {
//		if(s1[j]==p2) {s1[j]=' ';break;}
//		else 
//		if(s1[s1.length-j-1]==p2)
//		{s1[s1.length-j-1]=' ';break;}
//	}
//	
//}
//
//
//boolean q=false;
//for(int i=1;i<=s1.length;i++) {
//	
//if(s1[i-1]<'a'||s1[i-1]>'z') {}
//else	
//	if(s1[i-1]==' ') {}
//	else {
//System.out.print((char)s1[i-1]);}
//
//	
//if(s1[i-1]==p1[0]&&i<s1.length&&s1[i]!=p1[0]) {
//	for(int j=1;j<p1.length;j++) {
//		if(p1[j]<'a'||p1[j]>'z') {}
//		else	
//		System.out.print((char)p1[j]);
//	}
//q=true;
//}
//
//}
//if(q==false) {
//for(int j=1;j<p1.length;j++) {
//	if(p1[j]<'a'||p1[j]>'z') {}
//	else	
//	System.out.print((char)p1[j]);
//}}
//
////2
//
//
//System.out.println();
	StringBuilder s=new StringBuilder();
	StringBuilder sp=new StringBuilder();
	String gs="",gp="";
	gs=sc.next();
	
	
char d[]=	gs.toCharArray();
	Arrays.parallelSort(d);
	
	s.append(d);
	gs=s.substring(0);
	
	gp=sc.next();
	sp.append(gp);
	char temp=gp.charAt(0);
	boolean c= false;
	for(int i=1;i<gp.length();i++) {
		int y=gs.indexOf(sp.charAt(i));
		s.deleteCharAt(y);
		gs=s.substring(0);
		
		if(gp.charAt(i)<temp) {
			c=true;
		}
	}

		
	if(c)
s.insert(gs.indexOf(gp.charAt(0))+1, gp, 1, gp.length());
	else {
	s.insert(gs.lastIndexOf(gp.charAt(0))+1, gp, 1, gp.length());	
	}
	
	System.out.println();
	System.out.print(s);

	
}


	}

}