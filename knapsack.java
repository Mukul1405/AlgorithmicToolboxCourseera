import java.util.Arrays;
import java.util.Scanner;

public class knapsack {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int capacity=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int stored=0;
		int capacity1=capacity;
		
		int stored1=0;
		int k=arr.length-1;
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr.length-1;j>=0;j--)
			{
				if(j!=k) {
					if(capacity>=arr[j])
					{
						stored1+=arr[j];
						capacity-=arr[j];
					}
				}
//				System.out.println(stored1);
				
			}
			stored=(stored>stored1)?stored:stored1;
			stored1=0;
			capacity=capacity1;
			k--;
		}
		
		System.out.println(stored);
	}
}
