package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Paying_up {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			int		k = Integer.parseInt(st.nextToken());
		
		
			int []a=new int[n];
	for(int i=0;i<n;i++){	st = new StringTokenizer(br.readLine());
			a[i]=Integer.parseInt(st.nextToken());

			}

if(f(a,k,0,0))System.out.println("Yes");
else
	System.out.println("No");

	

		T--;
		}
	}
    private static boolean f(int[] A, int k, int i, int sum) {
        if(i>A.length-1){
            return false;
        }
        if(sum+A[i]==k){
            return true;
        }
        return f(A, k, i+1,sum+A[i])  ||  f(A, k, i+1,sum);
    }
}