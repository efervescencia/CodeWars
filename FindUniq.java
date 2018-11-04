package packCodeWars;

public class FindUniq {
	
    public static double findUniq(double arr[]) {
        // Do the magic
    	//Si los 3 primeros son iguales... el único estará después
    	if( (arr[0] == arr[1]) && (arr[1] == arr[2]) ){
    		int n=3;
    		while(arr[n] == arr[0]){
    			n++;
    		}
    		return arr[n];
    	}
    	// si uno de los 3 primeros es distinto... la solución está aquí.
    	else if(arr[0] == arr[1]){
    		return arr[2];
    	}
    	else if(arr[0] == arr[2]){
    		return arr[1];
    	}
    	else return arr[0];
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
