package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Little_elephant_and_divisiors {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int T = Integer.parseInt(br.readLine());
while(T > 0)
{
	StringTokenizer st = new StringTokenizer(br.readLine());
	int n = Integer.parseInt(st.nextToken());
Long[]a=new Long[n];
	st = new StringTokenizer(br.readLine());
	for(int i=0;i<n;i++) {
	a[i]= Long.parseLong(st.nextToken());
	}
	long y=0;
	for(int i=0;i<n;i++) {
		
		y= gcd(y,a[i]);
		if(y==1) {break;}
}

if(y>1) {
	
	boolean x=true;
	for(int i=2;i<=Math.sqrt(y);i++)
	{
		if(y%i==0) {System.out.println(i);x=false;break;}
	}
	
	if(x)
System.out.println(y);
}else
System.out.println("-1");
T--;
}


}



private static Long gcd(Long a, Long b) {
// TODO Auto-generated method stub
if(b==0)return a;

return gcd(b,a%b);

}		

}