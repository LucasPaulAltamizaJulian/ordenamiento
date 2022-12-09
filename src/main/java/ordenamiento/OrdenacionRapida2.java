/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author lucas
 */
public class OrdenacionRapida2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = { -321,-345,-756,-98,-231,-56,-78,-67,-234,1};
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+", ");
        quicksort(array);
        System.out.println("");
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+", ");
    }
    public static void quicksort(int a[])
{
	 quicksort(a, 0, a.length-1);
}
   private static void quicksort(int a[], int primero, int ultimo)
{
	 int i, j, central;
	 double pivote;
	 central = (primero + ultimo)/2;
	 pivote = a[central];
	 i = primero;
	 j = ultimo;
	 do {
	 	 while (a[i] < pivote) i++;
	 	 while (a[j] > pivote) j--;
	 	 if (i <= j)
	 	 {
	 	 	 intercambiar(a, i, j);
	 	 	 i++;
	 	 	 j--;
	 	 }
	 }while (i <= j);
	 if (primero < j)
	 	 quicksort(a, primero, j); // mismo proceso con sublista izqda
	 if (i < ultimo)
	 	 quicksort(a, i, ultimo); // mismo proceso con sublista drcha
}
   public static void intercambiar(int []a, int i, int j)
{
	 int aux = a[i];
	 a[i] = a[j];
	 a[j]= aux ;
}
}
