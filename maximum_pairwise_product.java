import java.math.BigInteger;
import java.util.*;

public class maximum_pairwise_product {
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int fmax=0,smax=0;
		
		//first max
		for(int i=0;i<n;i++)
		{
			if(arr[fmax]<arr[i])
			{
				fmax=i;
			}
		}
		
		//second max
		if(fmax==0)
		{
			smax=1;
		}
		for(int i=0;i<n;i++)
		{
			if(fmax!=i)
			{
				if(arr[smax]<arr[i])
				smax=i;
			}
		} 	
		
		String input1=Long.toString(arr[fmax]);
		String input2=Long.toString(arr[smax]);
		BigInteger mul;
		BigInteger A=new BigInteger(input1);
		BigInteger B=new BigInteger(input2);
		mul=A.multiply(B);
		System.out.println(mul);
	}
}
