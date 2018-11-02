package packCodeWars;

public class CountVowels {
	
	public int countVowels(String cadena){
	    int vowelsCount = 0;
	    char letra = 0;
	    String vocales = "aeiou";
	    
	    for(int i=0;i<cadena.length();i++){
	    letra = cadena.charAt(i);
	    	if (vocales.contains(""+letra))
	    	{
	    		vowelsCount++;
	    		System.out.println(letra);
	    	}   
	    }
	    return vowelsCount;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountVowels c = new CountVowels();
		System.out.println(c.countVowels("esto es una prueba"));
	}


}
