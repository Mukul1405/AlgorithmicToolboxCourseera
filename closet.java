import java.util.Scanner;

public class closet {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double X[]=new double[n];
		double Y[]=new double[n];
		for(int i=0;i<n;i++)
		{
			X[i]=sc.nextDouble();
			Y[i]=sc.nextDouble();
		}
	double min=Math.sqrt(Math.pow(X[0]-X[1], 2)+Math.pow(Y[0]-Y[1],2));
//	System.out.println(min);
//	System.out.println(Math.sqrt(Math.pow(7-7, 2)+Math.pow(7-7,2)));
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(min>Math.sqrt(Math.pow(X[i]-X[j], 2)+Math.pow(Y[i]-Y[j],2)))
						{
							min=Math.sqrt(Math.pow(X[i]-X[j], 2)+Math.pow(Y[i]-Y[j],2));
//							System.out.println(min+" "+X[i]+" "+X[j]+" "+Y[i]+" "+Y[j]);
						}
			}
		}
		System.out.println(min);
		
		

	}

}
