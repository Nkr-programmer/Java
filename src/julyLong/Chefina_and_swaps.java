package julyLong;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

import julyLong.InputReader.SpaceCharFilter;

public class Chefina_and_swaps {

	public Chefina_and_swaps() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		
		
		
////	5
////	9
////	1 5 8 19 23 21 23 8 1
////	19 100 21 19 5 100 4 4 19
////	12
////	3 1 1 1 2 2 2 5 6 8 9 9
////	1 10 3 2 5 6 8 8 8 9 9 10
////	1
////	1
////	2
////	2
////	1 2
////	2 1
////	2
////	1 1
////	2 2
////    4
////	100000000 100000000 99999999 199999
////	199999 100000000 99999999 100000000
	
		try{
			 int  t=0;
			
			   InputReader inp = new InputReader(System.in);
		   OutputWriter out = new OutputWriter(System.out);
			{   t = inp.readInt();}
			while(t>0) {int n=0,k=0,r=0,grand=0;
			
			n = inp.readInt();
			
			ArrayList<Integer> x=new ArrayList<Integer>();
			ArrayList<Integer> y=new ArrayList<Integer>();
			ArrayList<Integer> total=new ArrayList<Integer>();
			
			for(int i=0;i<n;i++) {
				k=inp.readInt();
		x.add(k);
		total.add(k);
			}

			for(int i=0;i<n;i++) {
				r=inp.readInt();
		y.add(r);	
		total.add(r);
			}

			Collections.sort(x, new comparator());	
			Collections.sort(y, new comparator());	
			Collections.sort(total, new comparator());	


			int u= countfrequency(total);
			Collections.sort(total, new comparator());	

			for(int i=0;i<n;i++) {
				if(x.get(i)-total.get(i)!=0) {
					
					grand++;
		}
			
			}
							
//							1
//							4
//							100000000 100000000 99999999 199999
//							199999 100000000 99999999 100000000

//			5
//			9
//			1 5 8 19 23 21 23 8 1
//			19 100 21 19 5 100 4 4 19
//			12
//			3 1 1 1 2 2 2 5 6 8 9 9
//			1 10 3 2 5 6 8 8 8 9 9 10
//			1
//			1
//			2
//			2
//			1 2
//			2 1
//			2
//			1 1
//			2 2
			if(u==-1)out.print(u);else
			{out.print(grand);}
			System.out.println();
		t--;}
			}
			catch(Exception e){}

			
				
				
				
			}
			
			
			
			private static int countfrequency(ArrayList<Integer> points) {
				// TODO Auto-generated method stub
				int r=0,l=0;
				Set<Integer>st=new HashSet<Integer>(points);
			
				for(Integer i:st) {
			
					if(Collections.frequency(points, i)%2!=0)
					{r=-1;
					break;}
					else
					{
						l=Collections.frequency(points, i)/2;
						while(Collections.frequency(points, i)>l) {
							points.remove(new Integer(i));
						}
					}
				}
				return  r;
			}

		}



		class comparator implements Comparator<Integer>
		{

		@Override
		public  int compare(Integer o1, Integer o2) {
			
		return  (o1-o2);
		}

		}

