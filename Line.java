package packCodeWars;

import java.util.ArrayList;

public class Line {
	
	   public static String WhoIsNext(String[] names, int n)
	     {
		   if((n-1)<names.length){
			   return names[n-1];
		   }
		   byte[] cola = new byte[n+2];
		   for(byte i=0;i<names.length;i++){
			   cola[i]=i;
		   }
		   byte temporal = 0;
		   int pos = 0;
		   int ultimo = names.length;
		   
		   while(ultimo<=n){
			   temporal = cola[pos];
			   System.out.println(temporal);
			   cola[ultimo]=temporal;
			   cola[ultimo+1]=temporal;
			   pos++;
			   ultimo+=2;
		   }
		   //System.out.println(ultimo-1);
		   return names[cola[ultimo-1]];
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"julio","juan","alfonso"};
		System.out.println(Line.WhoIsNext(names, 5));
	}

}
