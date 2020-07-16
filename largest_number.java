import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largest_number {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Long.parseLong(arr[j].concat(arr[i]))>Long.parseLong(arr[i].concat(arr[j])))
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
