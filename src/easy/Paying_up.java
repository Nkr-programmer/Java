package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Paying_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while (t-- >= 1) {
	            int n = sc.nextInt();


	            int m = sc.nextInt();


	            int a[] = new int [n];
	            for (int i = 0; i < n; i++) {
	                a[ i] = sc.nextInt();
	            }
	            int total=1<<n;//it means x*(2^y)==>1*(2^3)===>8
	            
	            boolean flag=false;
	            int sum=0;
	            for (int k=1;k<total;k++){
	                 sum=0;
	                for (int i=0;i<n;i++){
	                    if ((k&(1<<i))>0)
	                    sum+=a[i];
	                }
	                if (sum==m){
//	                System.out.println("Yes");
	                    flag=true;
	                }
	            }
	            if (flag==true)System.out.println("Yes");
	            else System.out.println("No");


	            }


	    }
	    static class FastScanner {
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st=new StringTokenizer("");
	        String next() {
	            while (!st.hasMoreTokens())
	                try {
	                    st=new StringTokenizer(br.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            return st.nextToken();
	        }

	        int nextInt() {
	            return Integer.parseInt(next());
	        }
	        int[] readArray(int n) {
	            int[] a=new int[n];
	            for (int i=0; i<n; i++) a[i]=nextInt();
	            return a;
	        }
	        long nextLong() {
	            return Long.parseLong(next());
	        }
	    }

		}


