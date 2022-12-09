/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author lucas
 */
public class OrdenamientoIntercambio2 {
    public static void main(String[] args) {
      int array[] = { 9,8,7,6,1,2,3,4,5,-1,-2,-3,0,999,123};
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+", ");
        ordIntercambio(array);
        System.out.println("");
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+", ");
    }
    public static void intercambiar(int []a, int i, int j)
{
	 int aux = a[i];
	 a[i] = a[j];
	 a[j]= aux ;
}
    public static void ordIntercambio (int a[])
{
	 int i, j;
	 for (i = 0 ; i < a.length-1; i++)
	 	 // sitúa mínimo de a[i+1]...a[n-1] en a[i]
	 	 for (j = i+1 ; j < a.length; j++)
	 	 	 if (a[i] > a[j])
	 	 	 {
	 	 	 	 intercambiar(a, i, j);
	 	 	 }
}
}
