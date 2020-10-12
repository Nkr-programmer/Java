package easy2.easy3;

import java.util.Scanner;

public class Minimum_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0) {
			
			double s =sc.nextFloat();
			 double tf =sc.nextFloat();
			double d =sc.nextFloat();
	
			
			if(d+s>=tf&&tf+s>=d&&d+tf>=s) {System.out.println(0);}
			else {
				System.out.println(Math.max(d-s-tf, Math.max(s-tf-d,tf-s-d)));
			}
		//1 it is possible that one encircle 2nd one like delhi in india
		//2 far away delhi from maharastra
		//3 both are touched or crossing like ncr
		
			
			t--;}
			}
			

		}