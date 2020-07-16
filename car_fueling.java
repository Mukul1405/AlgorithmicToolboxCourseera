import java.util.Scanner;

public class car_fueling {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int distance=sc.nextInt();
		int fuel=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n+2];
		arr[0]=0;
		for(int i=1;i<n+1;i++)
		{
			arr[i]=sc.nextInt();
		}
		arr[n+1]=distance;
		int t=n+2;
		
		int i=0;
		int start=arr[0];
		int travelled=arr[i];
		int count=0;
		while(travelled<distance) {
		  while(i<t)
		  {
			  i++;
			travelled=arr[i];
			if(travelled-start>fuel)
			{
				i--;
				travelled=arr[i];
				break;
			}
			
//			 System.out.println(travelled+" "+start+" "+i);
		  }
//		  System.out.println(travelled+" "+start+" "+i);
		  start=travelled;
		  count++;
		  if(start+fuel>=distance)
		  {
			  System.out.println(count);
			  travelled=distance;
			  break;
		  }
		  if(travelled+fuel<arr[++i])
		  {
			  System.out.println("-1");
			  break;
		  }
		
	}
  }
}
