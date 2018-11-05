package packCodeWars;

public class DontGiveMeFive {
	
	  public static int dontGiveMeFive(int start, int end)
	  {
		  int contador = 0;
		  String cadena;
		  
		  for(int i = start; i <= end;i++){
			cadena = ""+i;
			  if( !cadena.contains("5") ){
				  contador++;
			  }
		  }
	    return contador;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DontGiveMeFive.dontGiveMeFive(1, 10));
	}

}
