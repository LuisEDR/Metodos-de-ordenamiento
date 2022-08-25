public class Burbuja{
	
	private int iteraciones;
	private int cambios;
    private int auxiliar;
	
	public  int[] ordenarNumeros(int [] numeros){       
		iteraciones = 0;
		cambios = 0; 
		auxiliar = 0;
		
        for(int i = 0; i < numeros.length-1; i++){
            for(int j=0; j < numeros.length-1; j++){
                if(numeros[j] > numeros[j+1]){
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                    cambios++;
                }
                iteraciones++;
            }
        }
        System.out.println("Numero de iteraciones "+iteraciones);
        System.out.println("\nNumero de cambios realizados "+cambios);
		
		return numeros;	
    }
}
