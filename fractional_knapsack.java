import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class fractional_knapsack {

	public static void main(String args[])
	{
		int n,capacity;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		capacity=sc.nextInt();
		int val[]=new int[n];
		int weight[]=new int[n];
		double perunitprice[]=new double[n];
		HashMap<Double,Integer> hm=new HashMap();
		for(int i=0;i<n;i++)
		{
			val[i]=sc.nextInt();
			weight[i]=sc.nextInt();
			perunitprice[i]=val[i]/(double)weight[i];
			hm.put(perunitprice[i],(int) weight[i]);
		}
		Arrays.sort(perunitprice);
		double maxvalue=0;
		int i=0;
		while(capacity>0 && (i<n))
		{
			if(hm.get(perunitprice[n-i-1])>0)
			{
				if(capacity>=hm.get(perunitprice[n-i-1])){
					capacity-=hm.get(perunitprice[n-i-1]);
					maxvalue+=hm.get(perunitprice[n-i-1])*perunitprice[n-i-1];;
					hm.put(perunitprice[n-i-1],(int) 0);
					//System.out.println(capacity+" "+maxvalue);
				}
				else
				{
					int req=hm.get(perunitprice[n-i-1])-capacity;
					
					maxvalue+=capacity*perunitprice[n-i-1];
					capacity-=req;
					hm.put(perunitprice[n-i-1], hm.get(perunitprice[n-i-1])-req);
				}
			}
			else
			{
				i++;
			}
		}
		System.out.printf("%.4f ",maxvalue);
	}
}
