/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author lucas
 */
public class OrdenacionShell2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = { 1,2,23-321-3211,567,43,-9,0,2345};
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+", ");
        ordenacionShell(array);
        System.out.println("");
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+", ");
    }
    public static void ordenacionShell(int a[])
{
	 int intervalo, i, j, k;
	 int n= a.length;
	 intervalo = n / 2;
	 while (intervalo > 0)
	 {
	 	 for (i = intervalo; i < n; i++)
	 	 {
	 	 	 j = i - intervalo;
	 	 	 while (j >= 0)
	 	 	 {
	 	 	 	 k = j + intervalo;
	 	 	 	 if (a[j] <= a[k])
	 	 	 	 	 j = -1; // par de elementos ordenado
	 	 	 	 else
	 	 	 	 {
	 	 	 	 	 intercambiar(a, j, j+1);
	 	 	 	 	 j -= intervalo;
	 	 	 	 }
	 	 	 }
	 	 }
	 	 intervalo = intervalo / 2;
	 }
}
    public static void intercambiar(int []a, int i, int j)
{
	 int aux = a[i];
	 a[i] = a[j];
	 a[j]= aux ;
}
}
