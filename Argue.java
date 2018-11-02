package packCodeWars;

public class Argue {
	   
	    public static int nbYear(int p0, double percent, int aug, int p) {
	        //p0: población inicial
	    	//percent: porcentaje de crecimiento   2% = 2
	    	//aug: migración de habitantes
	    	//p: población objetivo
	    	// hay que devolver el numero de años para llegar al objetivo
	    	
	    	// your code
	    	int poblacion = p0;
	    	int years = 0;
	    	
	    	while(poblacion<p){
	    		
	    		poblacion += (poblacion*percent/100);
	    		poblacion += aug;
	    		years++;
	    		
	    	}
	    	return years;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Argue a = new Argue();
		System.out.println(a.nbYear(1500, 5, 100, 5000));
		System.out.println(a.nbYear(1500000, 2.5, 10000, 2000000));
		
	}

}
