import java.util.Scanner;

public class gcd {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int ans=gcd(a,b);
		System.out.println(ans);
	}
private static int gcd(int a,int b) {
	if(b==0)
	return a;
	else
		return gcd(b,a%b);
 }
}

