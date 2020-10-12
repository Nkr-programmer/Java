package easy2.easy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Puppy_and_game {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			int		m = Integer.parseInt(st.nextToken());
		int y=0,y1=0;
			boolean x= true;
			if(n==1&&m==1) {x=true;System.out.println("Vanka");}
			else {if(n%2==0||m%2==0) {System.out.println("Tuzik");
			}else {System.out.println("Vanka");}
			

			}	
		
			T--;
			}
		
			

		}
	}
