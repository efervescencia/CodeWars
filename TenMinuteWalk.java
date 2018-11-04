package packCodeWars;

public class TenMinuteWalk {
	
	  public static boolean isValid(char[] walk) {
		    // Insert brilliant code here
		  boolean result = false;
		  int minutes = 10;
		  int n = 0 , s = 0, e = 0 , w = 0 ;
		  
		  if(walk.length == minutes){
			  //contamos cada direccion
			  for (int i=0;i<minutes;i++){
				  switch(walk[i]){
				  case 'n': n++; break;
				  case 's': s++; break;
				  case 'e': e++; break;
				  case 'w': w++; break;
				  }
			  }
			  /*si vamos al norte tantas veces como al sur, y al este
			  tantas como al oeste, el final sera el punto de partida.*/
			  if( (n == s) && (e == w) ){
				  result = true;
			  }
		  }
		  
		  return result;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
