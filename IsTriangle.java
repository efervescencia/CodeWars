package packCodeWars;


public class IsTriangle {
	
	  public static boolean isTriangle(int a, int b, int c){
		  //solo hay que comprobar que la suma de 2 lados siempre es mayor que el lado que falte
		  return( (a+b>c) && (b+c>a) && (a+c>b) );  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
