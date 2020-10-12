package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Broken_telephone {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int	n = Integer.parseInt(st.nextToken());
int a[]=new int[n];
int g=0,l=0;
 st = new StringTokenizer(br.readLine());
for(int i=0;i<n;i++) {
	a[i]= Integer.parseInt(st.nextToken());
	
	if(i==0) {g=a[i];}
	else {
		if(g!=a[i]) {g=a[i];a[i]=0;a[i-1]=0;}
		else {}
	}
}
	Arrays.parallelSort(a);
for(int i=0;i<n;i++) {
	if(a[i]==0) {l++;}
}
System.out.println(l);
T--;
		}
	}
}