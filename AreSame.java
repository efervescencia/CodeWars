package packCodeWars;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
		
	    if(a!=null && b!=null){
	    
			int numero =0;
			int coincidencias = 0;
			
			for(int i=0;i<a.length;i++){
				
				numero = a[i]*a[i];
				
				for(int j=0;j<b.length;j++){
					
					if(b[j]==numero){
						b[j]=-1;
						coincidencias++;
						break;
					}
				}
			}
			if(coincidencias==b.length){
				return true;
			}
			else{
				return false;
			}
	}
	else{
	return false;
	}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		System.out.println(AreSame.comp(a, b));

	}

}
