package util;

import java.lang.reflect.Array;
import java.util.Iterator;

public abstract class misArrays {
	private int[] array;
	

	public misArrays(int[] array) {
		
		this.array= array;
		
	}
	
	
	
	public float notaMedia() {
		
	int []array = {1,2,3,4,5,6,7,8,9,10} ;
	 float notaMedia =  0;
    for (int i = 0; i < array.length; i++) {
      notaMedia = (float)array[i]++ / array.length;
      
		
	} 

     return  notaMedia ;
	}
	

public static int notaMinima(int[] array) {
	
	int menor = 0;
	int []arrayMinimo = {1,2,3,4,5,6,7,8,9,10} ;
	

    for (int i = 1; i < arrayMinimo.length; i++) {
     menor = arrayMinimo[i] ;
        if (arrayMinimo[i] < menor ) {
            menor = arrayMinimo[i];
        }
    }
  return menor;
}
    	        
    	    	

public int notaMaxima(int[] array) {
	
	int mayor = 0;
	int []arrayMinimo = {1,2,3,4,5,6,7,8,9,10} ;
	

    for (int i = 1; i < arrayMinimo.length; i++) {
   mayor = arrayMinimo[i] ;
        if (arrayMinimo[i] >  mayor ) {
            mayor = arrayMinimo[i];
        }
    }
  return mayor;
}   

}
