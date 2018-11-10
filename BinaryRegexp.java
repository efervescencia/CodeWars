package packCodeWars;

import java.util.regex.Pattern;

public class BinaryRegexp {
	
	  public static Pattern multipleOf3() {
		    // Regular expression that matches binary inputs that are multiple of 3
		    return Pattern.compile("(1(01*0)*1|0)*");
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The simplest one, using only state A, is:
			0*
			Including state B:
			0*(11)*0*

			Including state C:
			0*(1(01*0)*1)*0*

			And include the fact that after going back to state A, the whole process can be started again.
			0*((1(01*0)*1)*0*)*

			Using some basic regex rules, this simplifies to
			(1(01*0)*1|0)*


			(https://stackoverflow.com/questions/7974655/regex-for-binary-multiple-of-3)
			*/
	}

}
