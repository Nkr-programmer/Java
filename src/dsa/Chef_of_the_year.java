package dsa;
//  not  working
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
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

import dsa.InputReader.SpaceCharFilter;

public class Chef_of_the_year {

	public Chef_of_the_year() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2 10
//		a A
//		b a
//		C
//		IN
//		U
//		I
//		P
//		BR
//		N
//		BA
//
//		R
//		M
		
		
		try{
			   InputReader inp = new InputReader(System.in);
		     OutputWriter out = new OutputWriter(System.out);
		int n=inp.readInt();
		int k=inp.readInt();
		HashMap<String,Integer>points=new HashMap<String,Integer>();
		HashMap<String,Integer>name=new HashMap<String,Integer>();
		
		
		for(int i=0;i<n;i++) {
			inp.readString();
			String h=inp.readString();
			if(points.containsKey(h)) {points.put(h, points.get(h)+1);}
			else {
			points.put(h, 1);
			}}

	
		for(int i=0;i<k;i++) {
			String h=inp.readString();
			if(name.containsKey(h)) {name.put(h, name.get(h)+1);}
			else {
			name.put(h, 1);
			}}
		

		
		
		
		ArrayList<String> tu=new ArrayList<String>();
		int a=n;
		while(!points.containsValue(a)) {
			
			a--;
		}
		for(Map.Entry<String,Integer> entry:points.entrySet()) {
			if((Integer)entry.getValue()==a) {
	
				tu.add(entry.getKey());
			}
			}
		
		
		
		
		String fin=tu.get(0);
		
		int e=1;
		if(tu.size()>1) {
		for(int i=0;i<tu.size()-1;i++) {
			
			
			
			if(fin.charAt(0)<tu.get(i+e).charAt(0))
			{
				
				
			}
			else 
				if(fin.charAt(0)>tu.get(i+e).charAt(0)){
		    fin=tu.get(i+1);
			}
				else {int t=1;
					while(t!=0) {
					
						if(t==fin.length()) {t=0;}
						else
							if(t==tu.get(i+e).length()) {fin=tu.get(i+e);t=0;}
				       else
					if(fin.charAt(t)<tu.get(i+e).charAt(t))
					{
						t=0;
					}
					else 
						if(fin.charAt(t)>tu.get(i+e).charAt(t)){
				    fin=tu.get(i+e);t=0;
					}
						else {
							
							t++;}
				
					}
					
					}
					
			
			System.out.println(fin);
		}
		}else {
			fin=tu.get(0);
		}
		
		System.out.println(fin);
		
		
		int f=k;
		ArrayList<String> fu=new ArrayList<String>();

		while(!name.containsValue(f)) {
			
			f--;
		}
		for(Map.Entry<String,Integer> entry:name.entrySet()) {
			if((Integer)entry.getValue()==f) {
		
				fu.add(entry.getKey());
			}
			}
		
int d=1;

String tin=fu.get(0);


if(fu.size()>1) {
for(int i=0;i<fu.size()-1;i++) {
	
	
	
	if(tin.charAt(0)<fu.get(i+d).charAt(0))
	{
		
	}
	else 
		if(tin.charAt(0)>fu.get(i+d).charAt(0)){
    tin=fu.get(i+d);
	}
		else {int t=1;
			while(t!=0) {
			
				
				if(t==tin.length()) {t=0;}
				else
					if(t==fu.get(i+d).length()) {tin=tu.get(i+d);t=0;}
		       else
			if(tin.charAt(t)<fu.get(i+d).charAt(t))
			{
			t=0;
			}
			else 
				if(tin.charAt(t)>fu.get(i+d).charAt(t)){
		    tin=fu.get(i+d);t=0;
			}
				else {t++;}
		
			}
			
			}
			
	
	
}
}else {
	tin=fu.get(0);
}

System.out.println(tin);


	
			}
			catch(Exception e){}
		}

		}

//		class comparator implements Comparator<Point>
//		{
//
//		@Override
//		public String compare(Point o1, Point o2) {
//		return o1.x-o2.x;
//		}
//
//		}
		class Point
		{
		String x;
		String y;
		int lb;
		int rb;

		public Point(String x, String y) {
		this.x = x;
		this.y = y;
		}

		public Point() {
		}

		@Override
		public String toString() {
		return "Point{" + "x=" + x + ", y=" + y + ", lb=" + lb + ", rb=" + rb + '}';
		}



		}
		class Points
		{
		String y;
		int rb;

		public Points( String y) {
		this.y = y;
		}

		public Points() {
		}

		@Override
		public String toString() {
		return "Points{" + " y=" + y + ", lb=" +  ", rb=" + rb + '}';
		}



		}
		class InputReader {

		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;

		public InputReader(InputStream stream) {
		this.stream = stream;
		}

		public int read() {
		if (numChars == -1) {
		 throw new InputMismatchException();
		}
		if (curChar >= numChars) {
		 curChar = 0;
		 try {
		     numChars = stream.read(buf);
		 } catch (IOException e) {
		     throw new InputMismatchException();
		 }
		 if (numChars <= 0) {
		     return -1;
		 }
		}
		return buf[curChar++];
		}

		public int readInt() {
		int c = read();
		while (isSpaceChar(c)) {
			
		 c = read();
		}
		int sgn = 1;
		if (c == '-') {
		 sgn = -1;
		 c = read();
		}
		int res = 0;
		do {
		 if (c < '0' || c > '9') {
		     throw new InputMismatchException();
		 }
		 res *= 10;
		 res += c - '0';
		 c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
		}

		public String readString() {
		int c = read();
		while (isSpaceChar(c)) {
		 c = read();
		}
		StringBuilder res = new StringBuilder();
		do {
		 res.appendCodePoint(c);
		 c = read();
		} while (!isSpaceChar(c));
		return res.toString();
		}

		public double readDouble() {
		int c = read();
		while (isSpaceChar(c)) {
		 c = read();
		}
		int sgn = 1;
		if (c == '-') {
		 sgn = -1;
		 c = read();
		}
		double res = 0;
		while (!isSpaceChar(c) && c != '.') {
		 if (c == 'e' || c == 'E') {
		     return res * Math.pow(10, readInt());
		 }
		 if (c < '0' || c > '9') {
		     throw new InputMismatchException();
		 }
		 res *= 10;
		 res += c - '0';
		 c = read();
		}
		if (c == '.') {
		 c = read();
		 double m = 1;
		 while (!isSpaceChar(c)) {
		     if (c == 'e' || c == 'E') {
		         return res * Math.pow(10, readInt());
		     }
		     if (c < '0' || c > '9') {
		         throw new InputMismatchException();
		     }
		     m /= 10;
		     res += (c - '0') * m;
		     c = read();
		 }
		}
		return res * sgn;
		}

		public long readLong() {
		int c = read();
		while (isSpaceChar(c)) {
		 c = read();
		}
		int sgn = 1;
		if (c == '-') {
		 sgn = -1;
		 c = read();
		}
		long res = 0;
		do {
		 if (c < '0' || c > '9') {
		     throw new InputMismatchException();
		 }
		 res *= 10;
		 res += c - '0';
		 c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
		}

		public boolean isSpaceChar(int c) {
		if (filter != null) {
		 return filter.isSpaceChar(c);
		}
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public String next() {
		return readString();
		}

		public interface SpaceCharFilter {

		public boolean isSpaceChar(int ch);
		}
		}

		class OutputWriter {

		private final PrintWriter writer;

		public OutputWriter(OutputStream outputStream) {
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
		}

		public OutputWriter(Writer writer) {
		this.writer = new PrintWriter(writer);
		}

		public void print(Object... objects) {
		for (int i = 0; i < objects.length; i++) {
		 if (i != 0) {
		     writer.print(' ');
		 }
		 writer.print(objects[i]);
		}
		writer.flush();
		}

		public void printLine(Object... objects) {
		print(objects);
		writer.println();
		writer.flush();
		}

		public void close() {
		writer.close();
		}

		public void flush() {
		writer.flush();
		}
		}
		
		
		
		