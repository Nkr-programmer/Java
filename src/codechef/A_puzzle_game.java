package codechef;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A_puzzle_game {

	public A_puzzle_game() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		HashMap<String,Integer> ki=new HashMap<String,Integer>();
		String front="123456789";
		ki.put(front,0);
		int prime[]= {0,0,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0};
produce(front,prime,ki);


Scanner sc = new Scanner(System.in);
int t = 0;
if(sc.hasNext())
{ t = sc.nextInt();}

while(t>0){
	 
	char [][]mat = new char[3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			String d=sc.next();
			mat[i][j]=d.charAt(0);
		}}
	String h=encode(mat);
if(ki.containsKey(h)) {
	System.out.println(ki.get(h));
}
else {
	System.out.println("-1");
}
t--;}
		}
		catch(Exception e) {}
	}

	private static void produce(String front, int[] prime, HashMap<String, Integer> ki) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		q.add(front);
		int nextx[]= {0,1};int nexty[]= {1,0};
	
		while(q.isEmpty()==false) {
			String start=q.peek();
			q.remove();
			char mat[][]=decode(start);
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					for(int k=0;k<2;k++) {
						int nx=i+nextx[k];int ny=j+nexty[k];
						if((nx<3&&ny<3)&&(prime[mat[i][j]-'0'+mat[nx][ny]-'0']==1)) {
							swaping(mat,i,j,nx,ny);
							String temp=encode(mat);
							if(ki.containsKey(temp)==false) {
								int f=ki.get(start);
								ki.put(temp,f+1);
								q.add(temp);
								
							}
							swaping(mat,i,j,nx,ny);
						}
					}	
				}	
			}
			
		}
		
	}

	private static String encode(char[][] mat) {
		// TODO Auto-generated method stub
		String s="";
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			s+=	mat[i][j];
			}}
		
		return s;
	}

	private static void swaping(char[][] mat, int i, int j, int nx, int ny) {
		// TODO Auto-generated method stub
		char k= mat[i][j];
       mat[i][j]=mat[nx][ny];
       mat[nx][ny]=k;
	}

	private static char[][] decode(String front) {
		// TODO Auto-generated method stub
		char[][] a=new char[3][3];
		a[0][0]=front.charAt(0); a[0][1]=front.charAt(1); a[0][2]=front.charAt(2);
		a[1][0]=front.charAt(3); a[1][1]=front.charAt(4); a[1][2]=front.charAt(5);
		a[2][0]=front.charAt(6); a[2][1]=front.charAt(7); a[2][2]=front.charAt(8);
		return a;
	}

}
