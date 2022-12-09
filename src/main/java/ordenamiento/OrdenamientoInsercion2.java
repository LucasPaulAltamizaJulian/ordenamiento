/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author lucas
 */
public class OrdenamientoInsercion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int array[] = { -54,12,-7,34,-987,-1,1,0,123,124,567,321,-32};
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+", ");
        ordInsercion(array);
        System.out.println("");
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+", ");
    }
    public static void ordInsercion (int [] a)
{
	 int i, j;
	 int aux;
	 for (i = 1; i < a.length; i++)
	 {
	 	 /*	 indice j es para explorar la sublista a[i-1]..a[0] buscando la
	 	 posicion correcta del elemento destino*/
	 	 j = i;
	 	 aux = a[i];	
	 	 // se localiza el punto de inserción explorando hacia abajo
	 	 while (j > 0 && aux < a[j-1])
	 	 {
	 	 	 // desplazar elementos hacia arriba para hacer espacio
	 	 	 a[j] = a[j-1];
	 	 	 j--;
	 	 }
	 	 a[j] = aux;
	 }
}
}
