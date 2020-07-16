import java.util.Arrays;
import java.util.Scanner;

public class dot_product {

	/*public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		long product=0;
		for(int i=0;i<n;i++)
		{
			product+=a[i]*b[i];
		}
		System.out.println(product);
	}
*/
		static int maximumSOP(int[] a, int[] b) 
		{ 
			// Variable to store the sum of 
			// products of array elements 
			int sop = 0; 

			// length of the arrays 
			int n = a.length; 

			// Sorting both the arrays 
			Arrays.sort(a); 
			Arrays.sort(b); 

			// Traversing both the arrays 
			// and calculating sum of product 
			for (int i = 0; i < n; i++) { 
				sop += a[i] * b[i]; 
			} 

			return sop; 
		} 

		// Driver code 
		public static void main(String args[]) 
		{ 
			int n;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
			}
			System.out.println(maximumSOP(a, b)); 
		} 
	
}
