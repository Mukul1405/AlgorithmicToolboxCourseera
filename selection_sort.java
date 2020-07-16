import java.util.Scanner;

public class selection_sort {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//So lets do sort the elements
		SelectionSort(arr);
	}

	private static void SelectionSort(int[] arr) {
		int n=arr.length;
		int min;
		for(int i=0;i<n-1;i++)
		{
			min=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
		
		//display 
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"--> ");
		}
	}
}
