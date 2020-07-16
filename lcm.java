import java.math.BigInteger;
import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		String inp1= Integer.toString(a);
		String inp2= Integer.toString(b);
		
		BigInteger A=new BigInteger(inp1);
		BigInteger B=new BigInteger(inp2);
		BigInteger mul=A.multiply(B);
//		System.out.println(mul);
		
		int hcf=gcd(a,b);
		String h=Integer.toString(hcf);
		BigInteger H=new BigInteger(h);
		System.out.println(mul.divide(H));
	}
private static int gcd(int a,int b) {
	if(b==0)
	return a;
	else
		return gcd(b,a%b);
 }

	}


