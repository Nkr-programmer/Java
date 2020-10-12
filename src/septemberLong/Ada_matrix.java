package septemberLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ada_matrix {

//	 static void sortByRow(int mat[][], int n) 
//	    { 
//	        for (int i = 0; i < n; i++) 
//	      
//	            // sorting row number 'i' 
//	            Arrays.sort(mat[i]); 
//	    } 
	      
	    // function to find transpose of the matrix 
	    static void transpose(int mat[][], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            for (int j = i + 1; j < n; j++)  
	                { 
	                // swapping element at index (i, j)  
	                // by element at index (j, i) 
	                int temp=mat[i][j]; 
	                mat[i][j]=mat[j][i]; 
	                mat[j][i]=temp; 
	                } 
	    } 
	      
	 
	    static int sortMatRowAndColWise(int mat[][],int n, int i) 
	    { 
	    	int t=check(mat,n);
	    	if(t==0) {return i;}
	    	if(t==1) {return i+1;}
	     transpose(mat, t);
	   i=  sortMatRowAndColWise(mat,n,i+1);
		return i; 
	    } 
	      
	    private static int check(int[][] mat, int n) {
			// TODO Auto-generated method stub
	    	int k=1;boolean ones=false;
	    	  for (int i = 0; i < n; i++) { 
		            for (int j = 0; j < n; j++) {
		             if(mat[i][j]==k) {ones=true;}
		             else {ones=false;break;}
		             
		            k++;}
		            if(!ones) {break;}
		        }
	    	
	    	if(ones)return 0;  
	    	int k1=1;boolean twoes=false;
	    	  for (int i = 0; i < n; i++) { 
		            for (int j = 0; j < n; j++) {
		             if(mat[j][i]==k1) {twoes=true;}
		             else {twoes=false;break;}
		             
		            k1++;}
		            if(!ones) {break;}
		        } 
	    	if(twoes)return 1;
	    	int l=0,l1=1;
	    	for(int i=n-1;i>=1;i--)
	    	{

	    		if(mat[i][l]<mat[i-1][l]) {return i;}
	    		if(mat[l][i]<mat[l][i-1]) {return i;}
	    		if(mat[i][l1]<mat[i-1][l1]) {return i;}
	    		if(mat[l1][i]<mat[l1][i-1]) {return i;}

	    	}
	    	
			return 0;
		}

		// function to print the matrix 
//	    static void printMat(int mat[][], int n) 
//	    { 
//	        for (int i = 0; i < n; i++) { 
//	            for (int j = 0; j < n; j++) 
//	                System.out.print(mat[i][j] + " "); 
//	            System.out.println(); 
//	        } 
//	    }  
	      
	    // Driver code  
	    public static void main (String[] args) throws IOException 
	    { 
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			
			 int [][]mat=new int[n][n];
			 for(int i=0;i<n;i++) {
				 st = new StringTokenizer(br.readLine());
				 for(int j=0;j<n;j++) {
			int n1 = Integer.parseInt(st.nextToken());
			mat[i][j]=n1;
			 }
				 }
		          System.out.println(sortMatRowAndColWise(mat, n,0)); 
	
		T--;
		}
	    

	    }
	    }
	    