package packCodeWars;

import java.math.BigInteger;

public class Factorial {
	
	  public static String factorial(int n) {
		    BigInteger f = new BigInteger("1");
		    for (int i = 1; i <= n; i++) {
		        f = f.multiply(new BigInteger(i + ""));
		    }
		    return ""+f;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
