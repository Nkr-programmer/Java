package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Chef_and_party {

	public Chef_and_party() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
int n=0,x=0,min=0,total=0;
n=sc.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
	}			
Arrays.parallelSort(a);
for(int i=0;i<n;i++) {
if(i==0) {
	if(a[i]==0){min++;}else {break;}
}			
else {
	if(min>=a[i]) {min++;}
	else {break;}
		
}



	}
System.out.println(min);


t--;
		}
		
		
	}

}
