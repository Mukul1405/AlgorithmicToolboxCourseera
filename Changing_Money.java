import java.util.Scanner;

public class Changing_Money {

	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			if(n>=10)
			{
				n-=10;
				count++;
			}
			else if(n>=5)
			{
				n-=5;
				count++;
			}
			else
			{
				n-=1;
				count++;
			}
		}
		System.out.println(count);
	}
}
