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
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Missing_a_point {



	public static void main(String[] args) {
		// TODO Auto-generated method stub


//try{
//	 int  t=0;
//	
//   InputReader inp = new InputReader(System.in);
//   OutputWriter out = new OutputWriter(System.out);
//
//	{   t = inp.readInt();}
//	while(t>0) {long n=0,k=0,total=0,r=0,g=0,s=0;
//	
//	n = inp.readLong();
//
//	Map<Long,Long> x=new HashMap<Long,Long>();
//	Map<Long,Long> y=new HashMap<Long,Long>();
//	ArrayList<Long> xok=new ArrayList<Long>();
//	ArrayList<Long> yok=new ArrayList<Long>();
//	for(long i=0;i<4*n-1;i++) {
//	g=inp.readLong();
//	s=inp.readLong();
//	
//	if(x.containsKey(g))
//x.put(g,x.get(g)+1);
//	else {
//		x.put(g,(long) 1);	
//	}
//	if(y.containsKey(s))
//y.put(s,y.get(s)+1);	
//	else {
//		y.put(s,(long) 1);
//	}
//	
//	
//	if(x.get(g)%2!=0)
//	xok.add(g);
//	if(y.get(s)%2!=0)
//	yok.add(s);
//	
//	if(xok.contains(g)) {
//		if(x.get(g)%2==0) {System.out.println("vbn");
//			xok.remove(g);System.out.println("xgn");
//	}}
//	if(yok.contains(s)) {
//		if(y.get(s)%2==0)
//			yok.remove(s);
//	}
//	}
//	out.printLine();
//out.print(xok.get(0)+" "+yok.get(0));
//	
//
//	
//	
//	
//	t--;}
//	}
//	catch(Exception e){}


		
		
		
			

		
		

try{
	 int  t=0;
	
   InputReader inp = new InputReader(System.in);
   OutputWriter out = new OutputWriter(System.out);

	{   t = inp.readInt();}
	while(t>0) {int n=0,k=0,total=0,r=0,g=0,s=0;
	
	n =inp.readInt();

	Map<Integer,Integer> x=new HashMap<Integer,Integer>();
	Map<Integer,Integer> y=new HashMap<Integer,Integer>();
	ArrayList<Integer> xok=new ArrayList<Integer>();
	ArrayList<Integer> yok=new ArrayList<Integer>();
	for(int i=0;i<(4*n)-1;i++) {
	g=inp.readInt();
	s=inp.readInt();

	if(x.containsKey(g))
x.put(g,x.get(g)+1);
	else {
		x.put(g, 1);	
	}
	if(y.containsKey(s))
y.put(s,y.get(s)+1);	
	else {
		y.put(s, 1);
	}
	
	if(x.get(g)%2!=0)
	xok.add(g);
	if(y.get(s)%2!=0)
	yok.add(s);
	
	if(xok.contains(g)) {
		if(x.get(g)%2==0) {
			xok.remove(new Integer(g));
			x.remove(g);
		}
	}
	if(yok.contains(s)) {
		if(y.get(s)%2==0)
			yok.remove(new Integer(s));
		y.remove(s);
	}
	}	
out.printLine();
out.print(xok.get(0)+" "+yok.get(0));
	

	
	t--;
	}
	
	}
	catch(Exception e){}






		
		
		
		
		

//try{
	// int  t=0;
//	
//	   InputReader inp = new InputReader(System.in);
//   OutputWriter out = new OutputWriter(System.out);
//	{   t = inp.readInt();}
//	while(t>0) {long n=0,k=0,total=0,revenues=0,grand=0;
//	
//	n = inp.readLong();
//	
//	ArrayList<Long> x=new ArrayList<Long>();
//	ArrayList<Long> y=new ArrayList<Long>();
//	for(long i=0;i<(4*n)-1;i++) {
//
//x.add(inp.readLong());
//y.add(inp.readLong());	
//	}
//
//
//   long u= countfrequency(x);
//   long g=countfrequency(y);
//	//System.out.println(points.get(i).x+" "+points.get(i).x);
//out.printLine();
//   out.print(u+" "+g);
	
//	2
//	1
//	1 1
//	1 2
//	2 1
//	2
//	1 1
//	1 2
//	4 6
//	2 1
//	9 6
//	9 3
//	4 3
	
//	t--;}
//	}
//	catch(Exception e){}


	}

	private static long countfrequency(ArrayList<Long> points) {
		// TODO Auto-generated method stub
		long r=0;
		Set<Long>st=new HashSet<Long>(points);
		
		for(Long i:st) {
			if(Collections.frequency(points, i)%2!=0)
			{r=i;
			break;}
		}
		return  r;
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

















/* Name of the class has to be "Main" only if the class is public. */
//class Codechef
//{
//   static class Reader 
//
//    { 
//
//        final private int BUFFER_SIZE = 1 << 16; 
//
//        private DataInputStream din; 
//
//        private byte[] buffer; 
//
//        private int bufferPointer, bytesRead; 
//
//  
//
//        public Reader() 
//
//        { 
//
//            din = new DataInputStream(System.in); 
//
//            buffer = new byte[BUFFER_SIZE]; 
//
//            bufferPointer = bytesRead = 0; 
//
//        } 
//
//  
//
//        public Reader(String file_name) throws IOException 
//
//        { 
//
//            din = new DataInputStream(new FileInputStream(file_name)); 
//
//            buffer = new byte[BUFFER_SIZE]; 
//
//            bufferPointer = bytesRead = 0; 
//
//        } 
//
//  
//
//        public String readLine() throws IOException 
//
//        { 
//
//            byte[] buf = new byte[64]; // line length 
//
//            int cnt = 0, c; 
//
//            while ((c = read()) != -1) 
//
//            { 
//
//                if (c == '\n') 
//
//                    break; 
//
//                buf[cnt++] = (byte) c; 
//
//            } 
//
//            return new String(buf, 0, cnt); 
//
//        } 
//
//  
//
//        public int nextInt() throws IOException 
//
//        { 
//
//            int ret = 0; 
//
//            byte c = read(); 
//
//            while (c <= ' ') 
//
//                c = read(); 
//
//            boolean neg = (c == '-'); 
//
//            if (neg) 
//
//                c = read(); 
//
//            do
//
//            { 
//
//                ret = ret * 10 + c - '0'; 
//
//            }  while ((c = read()) >= '0' && c <= '9'); 
//
//  
//
//            if (neg) 
//
//                return -ret; 
//
//            return ret; 
//
//        } 
//
//  
//
//        public long nextLong() throws IOException 
//
//        { 
//
//            long ret = 0; 
//
//            byte c = read(); 
//
//            while (c <= ' ') 
//
//                c = read(); 
//
//            boolean neg = (c == '-'); 
//
//            if (neg) 
//
//                c = read(); 
//
//            do { 
//
//                ret = ret * 10 + c - '0'; 
//
//            } 
//
//            while ((c = read()) >= '0' && c <= '9'); 
//
//            if (neg) 
//
//                return -ret; 
//
//            return ret; 
//
//        } 
//
//  
//
//        public double nextDouble() throws IOException 
//
//        { 
//
//            double ret = 0, div = 1; 
//
//            byte c = read(); 
//
//            while (c <= ' ') 
//
//                c = read(); 
//
//            boolean neg = (c == '-'); 
//
//            if (neg) 
//
//                c = read(); 
//
//  
//
//            do { 
//
//                ret = ret * 10 + c - '0'; 
//
//            } 
//
//            while ((c = read()) >= '0' && c <= '9'); 
//
//  
//
//            if (c == '.') 
//
//            { 
//
//                while ((c = read()) >= '0' && c <= '9') 
//
//                { 
//
//                    ret += (c - '0') / (div *= 10); 
//
//                } 
//
//            } 
//
//  
//
//            if (neg) 
//
//                return -ret; 
//
//            return ret; 
//
//        } 
//
//  
//
//        private void fillBuffer() throws IOException 
//
//        { 
//
//            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
//
//            if (bytesRead == -1) 
//
//                buffer[0] = -1; 
//
//        } 
//
//  
//
//        private byte read() throws IOException 
//
//        { 
//
//            if (bufferPointer == bytesRead) 
//
//                fillBuffer(); 
//
//            return buffer[bufferPointer++]; 
//
//        } 
//
//  
//
//        public void close() throws IOException 
//
//        { 
//
//            if (din == null) 
//
//                return; 
//
//            din.close(); 
//
//        } 
//
//    } 
//
//    static StringBuffer sans = new StringBuffer();
//	public static void main (String[] args) throws java.lang.Exception
//{
//   
//   Reader s= new Reader();
//    int t= s.nextInt();
//	while(t>0){
//	    t--;
//	    int num= s.nextInt();
//	    HashMap<Long,Integer> mx = new HashMap<>();
//	    HashMap<Long,Integer> my = new HashMap<>();
//	    long xx=-1;
//	    long yy=-1;
//	    for(int i=1;i<(4*num); i++){
//	        long xcor= s.nextLong();
//	        long ycor = s.nextLong();
//	        if(mx.containsKey(xcor)){
//	             int c=mx.get(xcor);
//	        mx.put(xcor,c+1);
//	        }
//	        else{
//	            mx.put(xcor,1);
//	        }
//	        if(my.containsKey(ycor)){
//	             int c=my.get(ycor);
//	        my.put(ycor,c+1);
//	        }
//	        else{
//	            my.put(ycor,1);
//	        }
//	    
//	       // i++;
//	    }
//	    
//	    for(Map.Entry<Long,Integer> e : mx.entrySet()){
//	        int v=e.getValue();
//	        long k= e.getKey();
//	        if(v%2 != 0) {
//	            xx=k;	        }
//	    }
//	    
//	    for(Map.Entry<Long,Integer> e : my.entrySet()){
//	        int v=e.getValue();
//	        long k= e.getKey();
//	        if(v%2 != 0) {
//	            yy=k;	        }
//	    }
//	    
//	    	sans.append(xx+" "+yy);
//	    	sans.append("\n");
//	}
//System.out.println(sans);
//	
//	}
//}

