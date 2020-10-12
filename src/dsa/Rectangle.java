package dsa;

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
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

//public class Rectangle {
//
//	public Rectangle() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		try{
//			   InputReader inp = new InputReader(System.in);
//		        OutputWriter out = new OutputWriter(System.out);
//int n=inp.readInt();
//ArrayList<Point> points=new ArrayList<Point>();
//for(int i=0;i<n;i++) {
//	Point temp=new Point();
//	temp.x=inp.readInt();
//	temp.y=inp.readInt();
//	points.add(temp);
//}
//
//
//
//
//for(int i=1;i<100000;i++)
//{
//	Point temp=new Point();
//	temp.x=i;
//	temp.y=500;
//points.add(temp);	
//
//}
//
//
//
//
//
//
//Collections.sort(points, new comparator());
//points.add(new Point(100000,0));
//Stack<Point>stack=new Stack<Point>();
//stack.push(new Point(0,0));
//
//
//for(int i=0;i<n;i++)
//System.out.println(points.get(i));
//
//for(int i=0;i<points.size();i++) {
//	
//if(points.get(i).y>=stack.peek().y) {
//	stack.push(points.get(i));
//}	
//else {
//while(points.get(i).y<stack.peek().y) {
//	Point temp=stack.pop();
//	temp.rb=points.get(i).x;
//}stack.push(points.get(i));
//}
//}
//
//
//
//
//stack.clear();
//stack.push(new Point(0,0));
//
//
//
//
//
//for(int i=0;i<points.size();i++) {
//	
//if(points.get(i).y>=stack.peek().y) {
//	points.get(i).lb=stack.peek().x;
//	stack.push(points.get(i));
//}	
//else {
//while(points.get(i).y<stack.peek().y) 
//	stack.pop();
//points.get(i).lb=stack.peek().x;
//stack.push(points.get(i));
//}
//}
//
//
//
//int largest=0;
//
//
//
//
//for(int i=0;i<points.size();i++) {
//	int area=points.get(i).y*(points.get(i).rb-points.get(i).lb);
//	if(area>largest)largest=area;
//
//}
//System.out.println(largest);
//			}
//			catch(Exception e){}
//	}
//
//}
//
//
//
//class comparator implements Comparator<Point>
//{
//
//    @Override
//    public int compare(Point o1, Point o2) {
//        return o1.x-o2.x;
//    }
//
//}
//class Point{
//	int x;
//	int y;
//	int lb;
//	int rb;
//	public Point(int x,int y) {
//		x=this.x;
//		y=this.y;
//	}	
//	 public Point() {
//	    }
//	 @Override
//	    public String toString() {
//	        return "Point{" + "x=" + x + ", y=" + y + ", lb=" + lb + ", rb=" + rb + '}';
//	    }
//}
//
//class InputReader {
//
//    private InputStream stream;
//    private byte[] buf = new byte[1024];
//    private int curChar;
//    private int numChars;
//    private SpaceCharFilter filter;
//
//    public InputReader(InputStream stream) {
//        this.stream = stream;
//    }
//
//    public int read() {
//        if (numChars == -1) {
//            throw new InputMismatchException();
//        }
//        if (curChar >= numChars) {
//            curChar = 0;
//            try {
//                numChars = stream.read(buf);
//            } catch (IOException e) {
//                throw new InputMismatchException();
//            }
//            if (numChars <= 0) {
//                return -1;
//            }
//        }
//        return buf[curChar++];
//    }
//
//    public int readInt() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        int sgn = 1;
//        if (c == '-') {
//            sgn = -1;
//            c = read();
//        }
//        int res = 0;
//        do {
//            if (c < '0' || c > '9') {
//                throw new InputMismatchException();
//            }
//            res *= 10;
//            res += c - '0';
//            c = read();
//        } while (!isSpaceChar(c));
//        return res * sgn;
//    }
//
//    public String readString() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        StringBuilder res = new StringBuilder();
//        do {
//            res.appendCodePoint(c);
//            c = read();
//        } while (!isSpaceChar(c));
//        return res.toString();
//    }
//
//    public double readDouble() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        int sgn = 1;
//        if (c == '-') {
//            sgn = -1;
//            c = read();
//        }
//        double res = 0;
//        while (!isSpaceChar(c) && c != '.') {
//            if (c == 'e' || c == 'E') {
//                return res * Math.pow(10, readInt());
//            }
//            if (c < '0' || c > '9') {
//                throw new InputMismatchException();
//            }
//            res *= 10;
//            res += c - '0';
//            c = read();
//        }
//        if (c == '.') {
//            c = read();
//            double m = 1;
//            while (!isSpaceChar(c)) {
//                if (c == 'e' || c == 'E') {
//                    return res * Math.pow(10, readInt());
//                }
//                if (c < '0' || c > '9') {
//                    throw new InputMismatchException();
//                }
//                m /= 10;
//                res += (c - '0') * m;
//                c = read();
//            }
//        }
//        return res * sgn;
//    }
//
//    public long readLong() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        int sgn = 1;
//        if (c == '-') {
//            sgn = -1;
//            c = read();
//        }
//        long res = 0;
//        do {
//            if (c < '0' || c > '9') {
//                throw new InputMismatchException();
//            }
//            res *= 10;
//            res += c - '0';
//            c = read();
//        } while (!isSpaceChar(c));
//        return res * sgn;
//    }
//
//    public boolean isSpaceChar(int c) {
//        if (filter != null) {
//            return filter.isSpaceChar(c);
//        }
//        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
//    }
//
//    public String next() {
//        return readString();
//    }
//
//    public interface SpaceCharFilter {
//
//        public boolean isSpaceChar(int ch);
//    }
//}
//
//class OutputWriter {
//
//    private final PrintWriter writer;
//
//    public OutputWriter(OutputStream outputStream) {
//        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
//    }
//
//    public OutputWriter(Writer writer) {
//        this.writer = new PrintWriter(writer);
//    }
//
//    public void print(Object... objects) {
//        for (int i = 0; i < objects.length; i++) {
//            if (i != 0) {
//                writer.print(' ');
//            }
//            writer.print(objects[i]);
//        }
//        writer.flush();
//    }
//
//    public void printLine(Object... objects) {
//        print(objects);
//        writer.println();
//        writer.flush();
//    }
//
//    public void close() {
//        writer.close();
//    }
//
//    public void flush() {
//        writer.flush();
//    }
//}

//try{
//	   InputReader inp = new InputReader(System.in);
//     OutputWriter out = new OutputWriter(System.out);
//int n=inp.readInt();
//ArrayList<Point> points=new ArrayList<Point>();
//for(int i=0;i<n;i++) {
//Point temp=new Point();
//temp.x=inp.readInt();
//temp.y=inp.readInt();
//points.add(temp);
//}
//
//
//
//
//for(int i=1;i<100000;i++)
//{
//Point temp=new Point();
//temp.x=i;
//temp.y=500;
//points.add(temp);	
//
//}
//
//
//
//
//points.add(new Point(100000,0));
//
//Collections.sort(points, new comparator());
//
//Stack<Point>stack=new Stack<Point>();
//stack.push(new Point(0,0));
//
//for(int i=0;i<6;i++)
//System.out.println(points.get(i));
//
//
//for(int i=0;i<points.size();i++) {
//
//if(points.get(i).y>=stack.peek().y) {
//stack.push(points.get(i));
//}	
//else {
//while(points.get(i).y<stack.peek().y) {
//Point temp=stack.pop();
//temp.rb=points.get(i).x;
//}stack.push(points.get(i));
//}
//}
//
//
//
//
//stack.clear();
//stack.push(new Point(0,0));
//
//
//
//
//
//for(int i=0;i<points.size();i++) {
//
//if(points.get(i).y>=stack.peek().y) {
//points.get(i).lb=stack.peek().x;
//stack.push(points.get(i));
//}	
//else {
//while(points.get(i).y<stack.peek().y) 
//stack.pop();
//points.get(i).lb=stack.peek().x;
//stack.push(points.get(i));
//}
//}
//
//
//
//int largest=0;
//
//
//
//
//for(int i=0;i<points.size();i++) {
//int area=points.get(i).y*(points.get(i).rb-points.get(i).lb);
//if(area>largest)largest=area;
//
//}
//System.out.println(largest);
//	}
//	catch(Exception e){}
//}
//
//}
//
//class comparator implements Comparator<Point>
//{
//
//@Override
//public int compare(Point o1, Point o2) {
//return o1.x-o2.x;
//}
//
//}
//class Point
//{
//int x;
//int y;
//int lb;
//int rb;
//
//public Point(int x, int y) {
//this.x = x;
//this.y = y;
//}
//
//public Point() {
//}
//
//@Override
//public String toString() {
//return "Point{" + "x=" + x + ", y=" + y + ", lb=" + lb + ", rb=" + rb + '}';
//}
//
//
//
//}
//class InputReader {
//
//private InputStream stream;
//private byte[] buf = new byte[1024];
//private int curChar;
//private int numChars;
//private SpaceCharFilter filter;
//
//public InputReader(InputStream stream) {
//this.stream = stream;
//}
//
//public int read() {
//if (numChars == -1) {
// throw new InputMismatchException();
//}
//if (curChar >= numChars) {
// curChar = 0;
// try {
//     numChars = stream.read(buf);
// } catch (IOException e) {
//     throw new InputMismatchException();
// }
// if (numChars <= 0) {
//     return -1;
// }
//}
//return buf[curChar++];
//}
//
//public int readInt() {
//int c = read();
//while (isSpaceChar(c)) {
//	
// c = read();
//}
//int sgn = 1;
//if (c == '-') {
// sgn = -1;
// c = read();
//}
//int res = 0;
//do {
// if (c < '0' || c > '9') {
//     throw new InputMismatchException();
// }
// res *= 10;
// res += c - '0';
// c = read();
//} while (!isSpaceChar(c));
//return res * sgn;
//}
//
//public String readString() {
//int c = read();
//while (isSpaceChar(c)) {
// c = read();
//}
//StringBuilder res = new StringBuilder();
//do {
// res.appendCodePoint(c);
// c = read();
//} while (!isSpaceChar(c));
//return res.toString();
//}
//
//public double readDouble() {
//int c = read();
//while (isSpaceChar(c)) {
// c = read();
//}
//int sgn = 1;
//if (c == '-') {
// sgn = -1;
// c = read();
//}
//double res = 0;
//while (!isSpaceChar(c) && c != '.') {
// if (c == 'e' || c == 'E') {
//     return res * Math.pow(10, readInt());
// }
// if (c < '0' || c > '9') {
//     throw new InputMismatchException();
// }
// res *= 10;
// res += c - '0';
// c = read();
//}
//if (c == '.') {
// c = read();
// double m = 1;
// while (!isSpaceChar(c)) {
//     if (c == 'e' || c == 'E') {
//         return res * Math.pow(10, readInt());
//     }
//     if (c < '0' || c > '9') {
//         throw new InputMismatchException();
//     }
//     m /= 10;
//     res += (c - '0') * m;
//     c = read();
// }
//}
//return res * sgn;
//}
//
//public long readLong() {
//int c = read();
//while (isSpaceChar(c)) {
// c = read();
//}
//int sgn = 1;
//if (c == '-') {
// sgn = -1;
// c = read();
//}
//long res = 0;
//do {
// if (c < '0' || c > '9') {
//     throw new InputMismatchException();
// }
// res *= 10;
// res += c - '0';
// c = read();
//} while (!isSpaceChar(c));
//return res * sgn;
//}
//
//public boolean isSpaceChar(int c) {
//if (filter != null) {
// return filter.isSpaceChar(c);
//}
//return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
//}
//
//public String next() {
//return readString();
//}
//
//public interface SpaceCharFilter {
//
//public boolean isSpaceChar(int ch);
//}
//}
//
//class OutputWriter {
//
//private final PrintWriter writer;
//
//public OutputWriter(OutputStream outputStream) {
//writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
//}
//
//public OutputWriter(Writer writer) {
//this.writer = new PrintWriter(writer);
//}
//
//public void print(Object... objects) {
//for (int i = 0; i < objects.length; i++) {
// if (i != 0) {
//     writer.print(' ');
// }
// writer.print(objects[i]);
//}
//writer.flush();
//}
//
//public void printLine(Object... objects) {
//print(objects);
//writer.println();
//writer.flush();
//}
//
//public void close() {
//writer.close();
//}
//
//public void flush() {
//writer.flush();
//}
//}
//

