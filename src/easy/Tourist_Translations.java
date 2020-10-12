package easy;

import java.util.Scanner;

public class Tourist_Translations {

	public Tourist_Translations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		String p="";
		p=sc.next();
		while(t>0) {
			String sa="",hh="";
			
			sa="abcdefghijklmnopqrstuvwxyz ";

			hh=sc.next();
			

			int n=0,x=0;
		System.out.println();
		n=hh.length();
		while(n>0) {
			char y=hh.charAt(x);
			
 int h=sa.indexOf(y);
			
 if(h==-1) {
	 
	 if(y>='A'&&y<='Z')
	 {
	String hg=	 sa.toUpperCase();
	String hj	= p.toUpperCase();
	 
		 int g=hg.indexOf(y);	
		 System.out.print(hj.charAt(g));
	
	 }
	 
	 
	 if(y=='_')
	 System.out.print(" ");
	 else 
		 if(y<'A'||y>'Z')
		 System.out.print(hh.charAt(x));
 }else {

	 System.out.print(p.charAt(h));
 
 }		

n--;x++;
		}
		
			
			
			t--;
		}
				
				
	}

}
//5 qwertyuiopasdfghjklzxcvbnm
//Ph
//Pcssi
//Bpke_kdc_epclc_jcijsc_mihyo?
//Epcf_kdc_liswhyo_EIED_hy_Vimcvpcn_Zkdvp_siyo_viyecle.
//Ipp!