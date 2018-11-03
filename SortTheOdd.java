package packCodeWars;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheOdd {
	
	  public static int[] sortArray(int[] array) {
		  
		  ArrayList<Integer> ordenar = new ArrayList<Integer>();
		  
		  //sacamos los valores a ordenar
		  for(int i = 0;i< array.length;i++){
			  if( (array[i] % 2)!= 0){
				  ordenar.add(array[i]);
				  array[i]=-1;
			  }
		  }
		  //ordenamos los impares
		  Collections.sort(ordenar);
		  //los colocamos una vez ordenados
		  for(int i = 0;i< array.length;i++){
			  if( array[i] == -1){
				  array[i] = ordenar.remove(0);
			  }
		  }
		    return array;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 3, 2, 8, 1, 4};
		array = SortTheOdd.sortArray(array);
		for (int i = 0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}
