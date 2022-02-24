/**
 * @author oscar
 * @version 1.0
 * 
 */
package ordenaArray;
import java.util.*;

public class ordenaArray {
	/**
	 * 
	 * @param args
	 * funcion main de la clase
	 */
	public static void main(String[] args) {
			int arrayNums[] = {45,6,48,72,3};
			int nume;
			boolean res;
			Scanner sc = new Scanner (System.in);

			System.out.println("El array antes de ser ordenado es: ");
			mostrarDatosArray(arrayNums);
			ordenarArray(arrayNums);
			System.out.println("El array ordenado es: ");
			mostrarDatosArray(arrayNums);
			System.out.println("Introduce un número para comprobar que está contenido en el array: ");
			nume = Integer.parseInt(sc.nextLine());
			res = contieneNum(arrayNums,nume);
			if (res) System.out.println("Has introducido un número que está contenido en el array.");
			else System.out.println("Has introducido un número que no está contenido en el array.");
		}
		/**
		 * introduce datos en el array pasado por parametros
		 * @param arNum
		 */
		public static void llenarDatosArray (int[] arNum) {
			Scanner inScanner = new Scanner (System.in);
			for (int i=0;i<arNum.length;i++) {
				arNum[i] = Integer.parseInt(inScanner.nextLine());	
			}
			inScanner.close();
		}
		/**
		 * Muestra los datos que hay en arNum
		 * @param arNum
		 */
		 public static void mostrarDatosArray (int arNum[]) {
			for (int i=0;i<arNum.length;i++) {
				if (i==(arNum.length-1))
					System.out.print(arNum[i]);
				else System.out.print(arNum[i]+" -- ");
			}
			System.out.println();
		}
		/**
		 * Comprueba si n está en arNum, si se encuentra devuelve true, si no false.
		 * @param arNum
		 * @param n
		 * @return true/false
		 */
		public static boolean contieneNum (int arNum[], int n) {
			boolean esta = false;
			int i=0;
			
			do {
				if (arNum[i]==n)
					esta = true;
				else i++;
			} while ((!esta) && (i<arNum.length));
			
			return esta;
		}
		/**
		 * ordena arNum de menor a mayor
		 * @param arNum
		 */
		public static void ordenarArray (int arNum[]) {
			int aux;
			for (int j=0; j<arNum.length;j++) {
				for (int i=0;i<arNum.length;i++) {
					if ((i<(arNum.length-1)) && (arNum[i] > arNum[i+1])) {
						aux=arNum[i];
						arNum[i]=arNum[i+1];
						arNum[i+1]=aux;
					} 
				}
			}	
		}
		/**
		 * ordena arNum y lo devuelve ordenado
		 * @param arNum
		 * @return arNum
		 */
		public static int[] ordenarArray2 (int arNum[]) {
			int aux;
			for (int j=0; j<arNum.length;j++) {
				for (int i=0;i<arNum.length;i++) {
					if ((i<(arNum.length-1)) && (arNum[i] > arNum[i+1])) {
						aux=arNum[i];
						arNum[i]=arNum[i+1];
						arNum[i+1]=aux;
					} 
				}
			}	
			
			return arNum;
		}
}
