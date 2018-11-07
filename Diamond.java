package packCodeWars;

public class Diamond {
	
	 public static String print(int n) {
		 if(n%2==0 || n<1){
			 return null;
		 }
		 String result = "";
		 String espacios = cadena(" ", n);
		 String diamantes = cadena("*",n);
		 for(int i=1;i<n;i+=2){
			 result+=espacios.substring(0, (n-i)/2);
			 result+=diamantes.substring(0, i);
			 result+="\n";
		 }
		 result+=diamantes.substring(0, n)+"\n";
		 for(int i=n-2;i>0;i-=2){
			 result+=espacios.substring(0, (n-i)/2);
			 result+=diamantes.substring(0, i);
			 result+="\n"; 
		 }
		 return result;
			}
	 
	 public static String cadena(String caracter, int n){
		 String result = "";
		 for(int i=0;i<=n;i++){
			 result+=caracter;
		 }
		 return result;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Diamond.print(1001));
	}

}
