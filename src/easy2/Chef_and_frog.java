package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Chef_and_frog {

static class Frog implements Comparable{
	
	int val;
	int pos;
	Frog(){}
	Frog(int val){
		this.val=val;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
Frog f=	(Frog)o;
		
		
		return  f.val==val?0:val-f.val<0?-1:1;
	}
	
}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int p =Integer.parseInt(st.nextToken());

TreeSet<Frog> se=new TreeSet<Frog>();
Frog[]allfrog=new Frog[n];
	st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
		{int t=0;
	t=Integer.parseInt(st.nextToken());
	allfrog[i]=new Frog(t);
	se.add(allfrog[i]);
		}	

		
	int pos=0;
	int old=se.first().val;
	Iterator<Frog> it=se.iterator();
	while(it.hasNext()){
		Frog f=it.next();
		if(f.val-old>k) {
			pos++;
		}f.pos=pos;
	
		old=f.val;
		
	}
		
	
		
		while(p > 0)
		{
			 st = new StringTokenizer(br.readLine());
			int		in = Integer.parseInt(st.nextToken());
			int     fi=Integer.parseInt(st.nextToken());
if(allfrog[in-1]==allfrog[fi-1])  {System.out.println("Yes");}
else {System.out.println("No");}
			

p--;
		}
	}
}
