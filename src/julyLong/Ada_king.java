package julyLong;

import java.util.Scanner;

public class Ada_king {

	public Ada_king() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//64
//64
//63
//62
//61
//60
//59
//58
//57
//56
//55
//54
//53
//52
//51
//50
//49
//48
//47
//46
//45
//44
//43
//42
//41
//40
//39
//38
//37
//36
//35
//34
//33
//32
//31
//30
//29
//28
//27
//26
//25
//24
//3
//22
//21
//20
//19
//18
//17
//16
//15
//14
//13
//12
//11
//10
//9
//8
//7
//6
//5
//4
//3
//2
//1


		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int n=0,k=0,total=0,revenues=0,grand=0;
	    	
	    	n = sc.nextInt();
	    	total=n/8;
	    	if(n<8) {total=0;}
	    	grand=n%8;
	    System.out.println();
	    	for(int i=0;i<8;i++)
	    	{
	    	  for(int j=0;j<8;j++) {
	    		  
	    		  if(i<total) {
	    			  if(i==0&&j==0) {System.out.print("0");}
	    			  else {
	    			  System.out.print(".");
	    		  }
	    			  }
	    		  else
	    			  if(i==total) {
	    				  if(j<grand) {
	    					  if(i==0&&j==0)System.out.print("0");
	    					  else
	    					  System.out.print(".");
	    				  }else {
	    					  if(grand==j)
	    					  System.out.print("X");
	    					  else
	    						  System.out.print("X");
	    				  }
	    			  }else
	    			  if(i==total+1){if(j<=grand&&grand!=0)
	    				  System.out.print("X");
	    			  else
	    				  System.out.print(".");
	    			  }else {
	    				  System.out.print(".");
	    			  }
	    	  }
	
	    		System.out.println();
	    	}
	    	
	    	t--;}
			}
			catch(Exception e){}
		
		
		
		
		
		
	}

}
