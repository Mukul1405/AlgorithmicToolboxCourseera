import java.util.Scanner;

public class fibonacci_last_digit {

	public static void main(String[] args) {
		long a=0,b=1,c;
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>=2) {
		for(int i=1;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			a=a%10;
			b=b%10;
		}
		System.out.println(b%10);
		}
		else
		{
			System.out.println(n);
		}
	}

}
