package packCodeWars;

public class DRoot {
	
	  public static int digital_root(int n) {
		  String number;
		  int result = n;
		  while(result>9){
			  number = ""+result;
			  result = 0;
			  for(int i=0; i<number.length();i++){
				  result+= Integer.parseInt(number.substring(i, i+1));
			  }
		  }
	  return result;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DRoot.digital_root(341151));
	}

}
