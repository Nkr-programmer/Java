package easy;

import java.util.Scanner;

public class Paying_up_2_backtraking {

	public Paying_up_2_backtraking() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(),sum = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)arr[i] = sc.nextInt();
		    if(subset(arr,0,n-1,0,sum))System.out.println("Yes");
		    else System.out.println("No");
		}
	}
	
	public static boolean subset(int arr[],int low,int high,int sum,int target){
	    if(low > high){
	        if(sum==target)return true;
	        else return false;
	    }
	    return subset(arr,low+1,high,sum+arr[low],target) ||  subset(arr,low+1,high,sum,target);
	}
}
//Algorithms.tutorialhorizon.com/dynamic-programming-subset-sum-problem
