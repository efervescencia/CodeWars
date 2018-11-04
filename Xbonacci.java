package packCodeWars;

public class Xbonacci {
	
	  public static double[] tribonacci(double[] s, int n) {
	      // hackonacci me
	   double[] result = new double[n];
	   
	   switch(n){
	   case 0: return result;
	   case 1: result[0]=s[0]; return result;
	   case 2: result[0]=s[0]; result[1]=s[1]; return result;
	   case 3: return s;
	   default:
		   //este es el caso general
		   //los 3 primeros valores ya nos los dan
		   result[0]=s[0]; result[1]=s[1]; result[2]=s[2];
		   //ahora calculamos los demás
		   double valor;
		   for (int i=4;i<(n+1);i++){
			   valor = 0;
			   valor +=result[i-2];
			   valor +=result[i-3];
			   valor +=result[i-4];
			   System.out.println("Valor: "+valor);
			   result[i-1]= valor;
		   }
		   return result;
	   }
	   }
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] semilla = {1,1,1};
		double[] result = Xbonacci.tribonacci(semilla, 5);
		
		for (int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		
	}

}
