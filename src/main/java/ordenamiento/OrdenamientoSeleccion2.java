/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author lucas
 */
public class OrdenamientoSeleccion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = { -54,-32,-45,929,912,412,0,1,2,3,-6};
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+", ");
        ordSeleccion(array);
        System.out.println("");
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+", ");
    }
    public static void ordSeleccion (int a[])
{
	 int indiceMenor, i, j, n;
	 n = a.length;	
	 for (i = 0; i < n-1; i++)
	 {
	 	 // comienzo de la exploración en índice i
	 	 indiceMenor = i;
	 	 // j explora la sublista a[i+1]..a[n-1]
	 	 for (j = i+1; j < n; j++)
	 	 	 if (a[j] < a[indiceMenor])
	 	 	 	 indiceMenor = j;
                 // sitúa el elemento mas pequeño en a[i]
	 	 if (i != indiceMenor)
	 	 	 intercambiar(a, i, indiceMenor);
	 }
}
       public static void intercambiar(int []a, int i, int j)
{
	 int aux = a[i];
	 a[i] = a[j];
	 a[j]= aux ;
}
}
