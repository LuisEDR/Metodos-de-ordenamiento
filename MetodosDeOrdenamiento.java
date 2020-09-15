public class MetodosDeOrdenamiento {
	 public static void main(String[] args) throws IOException {
		final int ORDENAMIENTO_BURBUJA = 1;
        final int ORDENAMIENTO_INSERCION = 2;
        final int ORDENAMIENTO_SELECCION = 3;
        final int TERMINAR_PROGRAMA = 4;
        
        System.out.println("Este programa ordena un conjunto numeros enteros ingresados por el usuario de menor a mayor");
		
		bandera = true; 
        while (bandera == true) {
            if (opcion == ORDENAMIENTO_BURBUJA){
                System.out.println("metodo burbuja ");
            }
            else if (opcion == ORDENAMIENTO_INSERCION){
                System.out.println("metodo por inserción ");
            }
            else if (opcion == ORDENAMIENTO_SELECCION){
                System.out.println("metodo por seleccion ");
            }
            else if (opcion == TERMINAR_PROGRAMA) {
				System.out.println("Se ha finalizado el prgrama");
                bandera = false;
            }
            else{
                System.out.println("La opcion " + opcion+ " no existe, elija otra opcion.");
            }
            
            if(opcion >= 1  && opcion <= 3)
                 mostrarListaOrdenada( );
        }
		
	 }
}