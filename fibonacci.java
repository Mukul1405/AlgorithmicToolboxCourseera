import java.util.Scanner;

public class fibonacci {

	public static void main(String args[])
	{
		long a=0,b=1,c;
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>1) {
		for(int i=1;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(b);
		}
//		else if(n==2)
//		{
//			System.out.println("1");
//		}
		else
		{
			System.out.println(n);
		}
	}
}

// There is a formula also which can do the task in O(1) rtc and stc
// but this above code is running in O(n) rtc and O(1) stc