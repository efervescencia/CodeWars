package packCodeWars;

public class Scramble {

    public static boolean scramble(String str1, String str2) {
    	int pos = 0;
    	for(int i=0;i<str2.length();i++){
    	   pos = str1.indexOf(str2.substring(i,i+1));
    	   if( pos >= 0 ){
    		   str1 = str1.substring(0, pos)+str1.substring(pos+1, str1.length());
    	   }
    	   else {
    		   return false;
    	   }
       }
       return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scramble.scramble("rkqodlw","world");
	}

}
